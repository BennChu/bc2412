public class DemoThread {
    public static void main(String[] args) {
        
        //main thread
        //if main thread is a person, worker A, if worker A go dig a hole, program finish worker die
        //now another thread, worker B
        int x = 3;
        x++;
        ++x;
        x += 1;
        System.out.println(x);//6


        //create another thread
        //1. 有 task 先 2. thread
        //Runnable is java build in interface, use if for example
        //Runnable only 1 method, no input, no output, functional interface
        //Runnable is a functional interface that represents a task that can be executed by a thread
        Runnable sayHelloTask = () -> System.out.println("Worker B Hello");
        //sayHelloTask.run();
        
        StringBuilder sb = new StringBuilder("");
        Runnable concatStringMillionTimes = () -> { 
            //The lambda expression (() -> { ... }) defines the implementation of the run method of the Runnable interface
            for (int i = 0 ; i < 1_000 ; i++) {
                sb.append("!");
            }
            System.out.println(sb.length());//if put code here, worker B execute, so length will be 1, 因為 worker B 做完先 print
        };

        //Thread workerB = new Thread(sayHelloTask); //this worker 門say hello, now no need call .run()
        
        //workerB.start();//main thread, worker A, execute a new thread (worker B)
                        //main thread proceed its own task
        

        Thread workerB = new Thread(concatStringMillionTimes);
        System.out.println(sb.length());//0(Likely) executed by Worker A (main thread), 因為 worker B 可能未做完, worker A 就出 result, 唔知邊個行先
        System.out.println(sb.length());
        System.out.println(sb.length());
        System.out.println(sb.length());
        System.out.println(sb.length());


        System.out.println("Main thread Worker A Program end.");//this is from worker A, he will keep going will not wait for Worker B
        
        //workerB.start();






    }
}
