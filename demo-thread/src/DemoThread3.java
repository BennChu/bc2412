public class DemoThread3 {


    private String x = "";


    public String getX() {
        return this.x;
    }

    //solution for String
    //成個 method 都可以 lock, eg. LinkedList, Array
    //lock the door for method addA(), instance method 係個 object 度, 入黎 method 要 key
    //program 會好慢, 要 balance

    //培養 user expectation
    //我既 write 影響 你既 read, eg stock,  
    //我既 write 唔影響 你既 read, eg my own bank account 

    public synchronized void addA() {
        this.x += "A";//String immutable, 新 object 過程, immutable 冇 solve this problem
    }

    public static void main(String[] args) {
        DemoThread3 central = new DemoThread3();

        Runnable concatA = () -> {
            for (int i = 0 ; i < 100_000 ; i++) {
                central.addA();
            }
        };

        Thread workerB = new Thread(concatA);
        workerB.start();

        Thread workerC = new Thread(concatA);
        workerC.start();

        try {
            workerB.join();//因為有 exception, 要 try and catch
            workerC.join();
        } catch (InterruptedException e) {

        }

   
        System.out.println(central.getX().length());//execute by worker A (main thread), 可能 worker B and worker C 未做完就 print so return 0
   
   
   
    }

    
}
