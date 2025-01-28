import java.util.concurrent.atomic.AtomicInteger;

public class DemoThread2 {

    //private int x;//Primitive (Not thread safe), memory 得一個 x, 一齊攞 x , 一薺放入去, 加小左
    private AtomicInteger x = new AtomicInteger(0);//Primitive (thread safe), 有 key, 好慢, 因為一齊 read 同一個 variable


    public int getX() {
       // return this.x;
       return this.x.get();
    }


    public void addOne() {
        //this.x++;
        this.x.getAndIncrement();//AtomicInteger 內有的 method
    }

    
    public static void main(String[] args) {
        
        DemoThread2 place = new DemoThread2();
        place.addOne();
        System.out.println(place.getX());//1

        DemoThread2 central = new DemoThread2();
        //Runnable placeAddoneTask = () -> central.addOne();
            Runnable placeAddMillionTask = () -> {
                //System.out.println("Thread ID:＂ ＋ Thread.currentThread().getId());
                //有 id 可以用 check process
                for (int i = 0 ; i < 1_000_000 ; i ++) {
                    central.addOne();
                }
            };


        Thread workerB = new Thread(placeAddMillionTask);//thread 未出
        workerB.start();

        Thread workerC = new Thread(placeAddMillionTask);
        workerC.start();

        try {
            workerB.join();//main thread wait until workerC complete the task
            workerC.join();//main thread wait until workerC complete the task
        } catch (InterruptedException e) {

        }

        System.out.println(central.getX());//18XXXXXXX, likely less than 2,000,000, larger than 1,000,000
                                            //1898960, 1970805, 1934882, 1938381, 1972468, 1960224
                                            //after using AtomicInteger 2000000
    }
}
