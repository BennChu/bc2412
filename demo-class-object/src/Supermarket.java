public class Supermarket {

    private int availableStock;
    private Worker worker;

    //constructor, initialization
    public Supermarket(int availableStock) {
        this.availableStock = availableStock;
        //this.workers = new Worker[0];
    }

    //
    public int getAvailableStock() {
        return this.availableStock;
    }

    public void setAvailableStock(int availableStock) {
        this.availableStock = availableStock;
    }

    // //move 一d 貨入去
    // public void moveIn(int numOfStock) {
    //     this.availableStock += numOfStock;
    // }

    // //move 貨走
    // public void moveOut(int numOfStock) {
    //   this.availableStock -= numOfStock;
    // }

    // public static void move(Supermarket from, Supermarket to, Worker worker,
    //                           int quantity, boolean isMoveIn))
    //Supermarket.move



    public static void main(String[] args) {

        //s1 save the address of supermarket with 0 availableStock
        Supermarket s1 = new Supermarket(0);
        //create a second supermarket s2 address with availabelStock 100
        //and with 3 workers
        Supermarket s2 = new Supermarket(100);
        Worker worker3 = new Worker(s2);
        Worker worker4 = new Worker(s2);
        Worker worker5 = new Worker(s2);

        //print out number of worker in supermarket s2
        //class.method
        System.out.println(Worker.getWorkCount());//3

        //worker1 is working at supermarket s1
        //worker2 is working at supermarket s1
        Worker worker1 = new Worker(s1);
        Worker worker2 = new Worker(s1);
        System.out.println(Worker.getWorkCount());//2

        //worker1 and worker2 belong to s1 supermarket
        worker1.moveIn(30);
        worker2.moveOut(4);
        System.out.println(s1.getAvailableStock());//26

        //只能用 moveIn moveOut 去改 availableStock
        // s1.moveIn(10);//10
        // System.out.println(s1.getAvailableStock());
        // s1.moveIn(13);//23
        // System.out.println(s1.getAvailableStock());
        // s1.moveOut(4);
        // System.out.println(s1.getAvailableStock());

        





    }//main
  
}//class
