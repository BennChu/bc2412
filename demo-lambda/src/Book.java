public record Book (String name, double price) {


    //constructor get set equal hashcode 全部唔使寫

    // All-arg constructor ONLY
    // renamed getter 
    // no setter (immutable)
    // Support equals() and hashCode()
    // Support toString()
    // Support static variable/ method
    // Support custom instance method
    // Do not support custom attirbute
    // Do not support custom contructor


    //private String author;//not permitted, 唔可以加野
    public static final int X=10;//support

    //static method ok
    public static String print1() {
        return "this is static method print1 " + X;
    }

    public static void print2() {
        System.out.println("this is static method print2 " + X);
    }


    //instance method ok
    public void print() {
        System.out.println("name" + name());//this.name 都 ok
    }

    // public Book(int price, st){

    // }

    public static void main(String[] args) {
        

        Book b1 = new Book("ABC", 10.5);    //Book type, b1 reference, new Book object, attributes "ABC" 10.5
        System.out.println(b1.name());      //b1 reference point to object Book, getName(), actually is getName(), 宜家 get 都
        System.out.println(b1.price());     //get 都唔要寫, 就咁 price()
        System.out.println(new Book("ABC", 10.5).equals(b1));//true, override equals 都唔要寫
                                                            //support equals() and hashCode()

        //support toString(), 都唔要寫
        //b1 is reference
        System.out.println(b1);//[name=ABC, price=10.5]
        

        //no setter (innutable)

        b1.print();                 //nameABC
        System.out.println(print1());//this is static method 10
        print2();                   //this is static method print2 10

    }
    
}
