package src;
import java.util.ArrayList;
import java.util.Vector;

public class DemoThread4 {


    //solution
    //1. Native Data structure (AtomicXXX)
    //2. 

    //private ArrayList<Integer> integers;//如果咁寫, 就寫死左
    //private List<Integer> integers; List is type, fixable d, 下面可以寫 arraylist, linkedlisk
    //private 
    private Vector<Integer> integers;//lock 左, inside methods have synchronized 


    public DemoThread4() {

        //if () {
        //    new ArrayList
        //} else {
        //  new LinkedList
        //}
        //this.integers = new ArrayList<>();//ArrayList 係性能 polymorsh
        this.integers = new Vector<>();
    }

    // public ArrayList<Integer> getIntegers() {
    //     return this.integers;
    // }


    public synchronized boolean add(Integer integer) {//synchronized public boolean is the same
        return this.integers.add(integer);//lock this line of code
    }

    public int size() {
        return this.integers.size();
    }




    public static void main(String[] args) {
        
        ArrayList<Integer> integers = new ArrayList<>();

        // Runnable addition = () -> {
        //     for (int i = 0 ; i < 3 ; i++) {
        //         for (int j = 0 ; j < 1000 ; j++) {
        //             integers.add(i, j);
        //         }
        //     }
        // };

        // Thread workerB = new Thread(addition);
        // workerB.start();

        // Thread workerC = new Thread(addition);
        // workerC.start();

        // try {
        //     workerB.join();//因為有 exception, 要 try and catch
        //     workerC.join();
        // } catch (InterruptedException e) {

        // }

        // System.out.println(integers.size());//correct is 3000



        DemoThread4 central = new DemoThread4();
        Runnable addMillionElements = () -> {//句寫唔完, 要 bracaket
            for (int i = 0 ; i < 1000000 ; i++) {
                //central.getIntegers().add(i);//the last code running of workerB
                  central.add(i);
            }
        };

        Thread workerB = new Thread(addMillionElements);
        workerB.start();//main thread initialize another thread (workerB) to execute the task
                        //the workerB execute the task only

        Thread workerC = new Thread(addMillionElements);
        workerC.start();

        try {
            workerB.join();//佢地會 comunicate, java 會自己完成
            workerC.join();
        } catch (InterruptedException e) {

        }


        System.out.println()



    }
    
}
