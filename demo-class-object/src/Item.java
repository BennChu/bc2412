import java.math.BigDecimal;

public class Item {

    /* 如果係 public String name, item.name 就可以用
     * 儲 raw data
     */
    private String name;
    private double price;
    private int quantity;

    public item() {
        return;
    }



    //constrcutor, has the same name of the class
    /* first time to set the data */
    public Item(String name, double price, int quantity) {

        this.name = name;
        this.price = price;
        this.quantity = quantity;

    }

    //getters
    public String getName(){

        return this.name;
  
    }

    public double getPrice(){
      
        return this.price;
    
    }

    public int getQuantity(){
        
        return this.quantity;
    
    }

    //setter for set name and set price no need
    //因為唔會 customer 自己 set
    // public void setName(String name){
    //   this.name = name;
    // }

    // public void setPrice(double price){
    //   this.price = price;
    // }


    /* second chance to modified
     * if cannot change, called immutable
     * quantitiy add 1 more
     */
    public void setQuantity(int quantity){
      
        this.quantity++;
    }


    /* instance method
     * is a presentation
     * 總結自己, 比人類用
     *
     */
    public double totalAmount(){
        
        return BigDecimal.valueOf(this.getPrice())
                         .multiply(BigDecimal.valueOf(this.quantity))
                         .doubleValue();
    }






    public static void main(String[] args){

    




    }





}//class
