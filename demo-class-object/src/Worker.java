public class Worker {

    //static field
    private static int workerCount = 0;

    //一個 worker 一個 supermarket work
    private Supermarket supermarket;

    //this is a constructor, must has the same name as the class name
    //Supermarket supermarket is parameter
    //method signature = method name + parameter
    public Worker(Supermarket supermarket) {
        this.supermarket = supermarket;

        //如果用 object method 去數 workers
        //this.workers = new Worker[0];

        //for counting how many worker in the same supermarket
        //recommended, invoking static method with class name
        //workerCount++; is the same
        //static reference
        Worker.workerCount++;
        
    }

      //if read private static variable 
      //we should use a static method
      public static int getWorkCount() {

          //Worker.workerCount is a static
          //"Worker" is a class name
          return Worker.workerCount;

      }

    //instance method
    //with or without this, result is the same
    //有 this 會清楚D
    //會認上面個 supermarket
    public void moveIn(int quantity) {
         supermarket.setAvailableStock(
          supermarket.getAvailableStock() + quantity);
    }


    public void moveOut(int quantity) {
        supermarket.setAvailableStock(
          supermarket.getAvailableStock() - quantity);
    }



    //如果用 object method 去做
    //private int availableStock;
    //private Worker[] worker;

    //move 一d 貨入去
    // public void moveIn(int numOfStock) {
    //    this.availableStock += numOfStock;
    // }

     //move 貨走
    //  public void moveOut(int numOfStock) {
    //  this.availableStock -= numOfStock;
    //  }
  

    // public void addWorker(int worker) {


    // }

    // public void removeWorker(int worker) {


    // }



}//class
