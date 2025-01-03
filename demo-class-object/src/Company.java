public class Company {



    private String name;
    private int stockCode;
    private String location;
    private int employee;


    public Company(String name, int stockCode, String location, int employee){

        this.name = name;
        this.stockCode = stockCode;
        this.location = location;
        this.employee = employee;
    }

    //getter
    public String getName(){
      return this.name;
    }

    public int getStockCode(){
      return this.stockCode;
    }

    public String getLocation(){
      return this.location;
    }

    public int getEmployee(){
      return this.employee;
    }
  

    //setter
    public void setName(String name){
        this.name = name;
    }
    
    public void setStockCode(int stockCode){
        this.stockCode = stockCode;
    }

    public void setLocation(String location){
      this.location = location;
  }


    public static void main(String[] args){


      Company c1 = new Company("Ben Limited", 168, "HK", 100);
      Company c2 = new Company("Sam Limited", 200, "UK", 50);

      Company[] comArr = new Company[] {c1, c2};

      System.out.println(c1.getName());

      for(Company c : comArr){

        System.out.println(c.getName());
        System.out.println(c.getStockCode());
        System.out.println(c.getLocation());
        System.out.println(c.getEmployee());

      }

      //set c1 company stock code from 168 to 888
      c1.setStockCode(888);

      System.out.println(c1.getStockCode());  //888
















    }



}
