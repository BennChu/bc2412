public class Worker2 {

    public Worker2() {

    }


    //availableStock related to class Supermarket2.
    //is not using 
    //go to Supermarket2 get available stock value
    public void moveIn(int quantity) {
      Supermarket2.availableStock += quantity;
    }
  

    public void moveOut(int quantity) {
      Supermarket2.availableStock -= quantity;
    }

    public int checkStockQuantity() {
        return Supermarket2.availableStock;
    }

    public static void main(String[] args) {
        Worker2 w1 = new Worker2();
        w1.moveIn(100);
        w1.moveOut(23);

        System.out.println(w1.checkStockQuantity());//77
    }

}
