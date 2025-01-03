import java.math.BigDecimal;
import java.util.Arrays;

public class Order {


    private long id;
    private Item[] items; //can create a class of item array, address reference, point to Item[] array object
                          //null
                          //一定要加 's'

    //constructor
    //order id 應該係電 gen
    public Order(long id){

        this.id = id;
        this.items = new Item[0]; //this.items 指住 Item[o] array
    }


    public void addItem(Item item){

        //newArr is a local variable in Order class
        //declare an array newArr with the length type is Item, 
        Item[] newArr  = new Item[this.items.length +1];

        for( int i = 0 ; i < this.items.length ; i++ ){
      
            newArr[i] = this.items[i];
        }

        //newArr 係地址
        newArr[newArr.length -1] = item;
        //newArr 要指住新 object, this 係 order
        this.items = newArr; 
    }


    public void removeItem(Item item){

        //create an array with length - 1
        //唔可以 keep 住 old array, 會越來越多
        Item[] newArr = new Item[this.items.length-1];
        int idx = 0;
        int countTarget = 0;

        //this.items -> Item array object 係一個 object
        //this.items[i] -> Item object 都係一個 object

        //for seachring
        for( int i = 0 ; i < this.items.length-1 ; i++ ){
            
            /* 一 this 就會去到 this order 的 item array object reference
             * 再去 array 內的 items[i] object array reference
             * 再用 item 的 method 去 getName
             * equals 就對全部一樣, 全對先會 true
             * contains 就對包括, 有就會 true
             */
            if( this.items[i].getName().equals(item)  && countTarget == 0 ){
                countTarget++;
                continue;                
            }
            //old array copy to new array
            newArr[idx++] = this.items[i];
        }
        //指針
        this.items = newArr;
    }


    public Item[] getItems(){

        return this.items;

    }

    public long getId(){

        return this.id;

    }


    //************   //order.totalAmount()
    //calculate the totalAmount of an order
    //Order order = new Order(items)
     public double totalAmount(){

        // 0.0 + 10.3 (BigDecimal object)= 10.3 (new BigDecimal object) 會比一個全新BigDecimal地址你
        //所以要開 BigDecimal object 要捉住佢
        BigDecimal total = BigDecimal.valueOf(0.0);

        for( Item item : items ){
            total = total.add(BigDecimal.valueOf(item.totalAmount()));
        }

        return total.doubleValue();

    }



    public Item[] getItem(long orderId){



    }



    public static void main(String[] args){

        //creating objects of the Item class
        Item item1 = new Item("Coca Cola", 20, 1);
        Item item2 = new Item("Chip", 10.5, 2);
        Item item3 = new Item("Ice cream", 15.5, 5);
        Item item4 = new Item("Cup Noodles", 12.5, 3);
        Item item5 = new Item("Candy", 8.8, 2);

        Item[] items = new Item[] {item1, item2, item3};
        //addItem(item1);

        for( Item print : items){

            System.out.println(print.getName());
            System.out.println(print.getPrice());
            System.out.println(print.getQuantity());
        }

        System.out.println(totalAmount());



    }//main
  
}//class
