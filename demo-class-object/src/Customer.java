import java.math.BigDecimal;

public class Customer {

    /* customer object 想勾住 order object, related
     * class 係死物, object 係有生命, class 冇, class can deleted from harddisk
     * 指令放係 main
     * 指令可以放係任何地方
     * main(String[] args), java 認定入口
     * class file 冇生產 memory
     */

    /* id used to Long type, 可能有 transcation id 加落去
     * order class, 一個客可以有好多訂單
     * new 先有 object, 幾多 new 幾多 object
     * press run buttom, 係 memory
     * 行完 main, 就會 kill 左
     * 
     */

    private long id;
    private Order[] orders;


    //sutitation
    //1. Normally Customer can be created without order


    //constructor
    public Customer(long id){
        
        this.id = id;
        this.orders = new Order[0];//指針係地址 //Order[] orders = new Order[0];

    }


    //*********************order id -> item[]
    public Item[] getItem(long orderId){
        for(Order order : this.orders){
            if( order.getId() == orderId){
                return order.getItems();
            }
        }
        return new Item[0];//return null
    }


    //*******************getTotalOrderAmount
    //order id -> item[], program where to write
    //total order amount by order id, 1 id has many items, item 
    public double getTotalOrderAmount(long orderId){

        for(Order order : this.orders){
            if(order.getId() == orderId){
                return order.totalAmount();
            }
        }
    return -1.0;

    }



    //******************orderSize() method
    public int orderSize(){
        return this.orders.length;

    }







    //is vip a boolean,  >100_000 (total amount of all orders)
    public boolean isVip(){

        BigDecimal total = BigDecimal.valueOf(0.0);

        for( Order order : this.orders ){
            total = total.add(BigDecimal.valueOf(order.totalAmount()));
        }
        return total.doubleValue() >= 100_000.0;

    }



    //2. Customer can place order after become creating the customer account
    //static method
    public void placeOrder(Order order){

        //create 新 array 叫 newOrders,
        //如果 order[0] 長度係係 1 , then newOrders 係 2
        Order[] newOrders = new Order[this.orders.length+1]; 
                                                            

        for( int i = 0 ; i < this.orders.length ; i++ ){

            //copy address
            newOrders[i] = this.orders[i];   
        }

        newOrders[newOrders.length-1] = order;
        //轉新指針指向既地方
        this.orders = newOrders;  
    }


    //getter, get orders
    public Order[] getOrders(){
        return this.orders;
    }




  public static void main(String[] args){

      //Order[] orders = new Order[3];
      //orders[0] = new Order();
      //orders[1] = new Order();
      //orders[2] = new Order();
      //create a new customer 1L with customer type
      //Customer c1 = new Customer[] {1, };

      //create customer object and then write down the address into c1
      //c1 is an address, object reference
      Customer c1 = new Customer(1L);
      
      //first order for customer 1L
      //1L is order id
      //宜家自己入, 應該電腦 generate
      Order o1 = new Order(1L);
      System.out.println("order id of o1 is " + o1.getId());


      //new Item 係 create 一個 item
      //addItem 係將 item 放落一個 array 內
      //o1.addItem(new Item("ABC", 5.4, 5));
      //can rewrite like below
      Item item1 = new Item("ABC", 5.4, 5);
      o1.addItem(item1);

      o1.addItem(new Item("DEF", 1.3, 3));

      //最後 c1 placeOrder(), order 係 o1
      c1.placeOrder(o1);

      //second order for customer 1L
      Order o2 = new Order(2L);
      o2.addItem(new Item("Coca Cola", 20, 1));
      o2.addItem(new Item("Chip", 10.5, 2));
      c1.placeOrder(o2);

      //third order for customer 1L
      Order o3 = new Order(3L);
      o3.addItem(new Item("abc", 5, 1));
      o3.addItem(new Item("uio", 54, 2));
      c1.placeOrder(o3);

      //o3 = 02, assign o2 address to o3
      //then o3 will be lost cannot find 

      //fourth order for customer 1L
      Order o4 = new Order(4L);
      o4.addItem(new Item("bnm", 5_000, 1));
      o4.addItem(new Item("watch", 100_000, 2));
      c1.placeOrder(o4);


      
      //c1.placeOrder(new Order(0001));//address
      System.out.println(c1.orderSize()); // 4 order
      System.out.println(c1.getTotalOrderAmount(1L));//30.9
      System.out.println(c1.getTotalOrderAmount(2L)); //154
      System.out.println(c1.getTotalOrderAmount(3L)); //113
      System.out.println(c1.isVip()); //false
      System.out.println(c1.getTotalOrderAmount(4L));//205000
      System.out.println(c1.isVip()); //true


     //c1.getOrders -> return an array, Order[]
     //so, getOrders()[0] -> order
     //so, getOrders[0] -> getItems() -> Item[]
     //so, getOrders[0] -> getItems() - Item
     //so, getORders[0].getItems()[1].getPrice() -> double
     System.out.println(c1.getOrders()[0].getItems()[1].getPrice());//1.3

     System.out.println(c1.getOrders()[0].getItems()[1].totalAmount());//3.9

     System.out.println(c1.getOrders()[0].totalAmount());//order[0], is Order o1, 5.4*5+1.3*3 = 30.9

     System.out.println(c1.getTotalOrderAmount(1));//30.9

  }
  
}
