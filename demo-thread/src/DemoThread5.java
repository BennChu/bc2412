package src;

import java.util.HashMap;
import java.util.Map;

public class DemoThread5 {

    //search Thread
    //search Runnable, if no, then only 1 thread, main thread
    //好小係 multi thread 情況下用 array
    private Map<Integer, String> map;//HashMap is not thread safe

    public DemoThread5() {
        this.map = new HashMap<>();//Hashtable 會上鍞，array + linkedlink
                                    //concurrenthashmap
                //Collections.synchronized(new HashMap<>())
    }

    public String put(Integer key, String value) {
        return this.map.put(key, value);
    }

    public int size() {
        return this.map.size();
    }



    public static void main(String[] args) {
        
        DemoThread5 central = new DemoThread5();

        //put
        Runnable putEntryTask1 = () -> {
            for (int i = 0 ; i < 1_000_00 ; i++) {
                central.put(i, "abc");
            }
        };

        Runnable putEntryTask2 = () -> {
            for (int i = 1_000_000 ; i < 2_000_00 ; i++) {
                central.put(i, "abc");
            }
        };



        Thread workerB = new Thread(putEntryTask1);
        workerB.start();

        Thread workerC = new Thread(putEntryTask2);
        workerC.start();
    
        try {
            workerB.join();//佢地會 comunicate, java 會自己完成
            workerC.join();
        } catch (InterruptedException e) {

        }

        System.out.println(central.size());
    
    
    
    
    
    }
    
}
