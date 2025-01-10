import java.util.Objects;

public class Pig extends Animal {

    //class cannot extends more than 1 parent class
    //Pig.class own attributes
    //private boolean wings;
    private int age;


    //如果你開 empty constructor, parent class (Animal.class) 都要開
    public Pig() {
        //implicity calling super();
        //super();
        //super("ABN");
    }

    //constuctor
    //name 放落 Parant class 容器 (Animal.class)
    public Pig(String name, int age) {
        super(name,age);
        //this.age = age;
        //this.wings = wings;
    }


    public int getAge() {
        return this.age;
    }

    // public boolean hasWings() {
    //     return this.wings;
    // }

    /**********************************important****************************************** */
    //implicitly extend Object.class
    //Object.equals() -> check if they are same memory object
    //equals() and hashCode(), 係一 pair, 如果要寫, 就兩個一齊寫
    //override the parent given method
    @Override
    public boolean equals(Object obj) {
        //first step: same object reference pointing to same momory location, return true, they are the same object
        //checking object reference, if same object reference in memory -> they must be same
        //this -> current object
        //obj -> input object
        if( this == obj )
            return true;

        //instanceof keyword
        // is used to check whether an object is an instance of a specific class
        //whether obj is instanceof object of Pig.class, not same object
        //second step: not same object referene, then check whether obj is an instance of Pig.class
        //             
        if( !(obj instanceof Pig))
            return false;

        Pig pig = (Pig) obj; //Polymorphism, from Parent class to child class int x = (int) 10L
            
        //Objects 's' 有 s 既 class, 用黎放 static methods, 被 call
        //inside Objects class, there is a static method called equals(), compare 2 objects
        return Objects.equals(pig.getAge(), this.age)
                    && Objects.equals(pig.getName(), super.getName()); //因為 super 左 name, 同 this.getName() 一樣
    
        //return pig.getAge() == this.age && pig.getName().equals(super.getName())
    
    }

    //implicitly extend Object.class
    //Object.hashCode() -> check if they are same memory object
    //override the parent given method
    //to get a numeric representation of an object's data which is useful in data structures like hash tables.
    @Override
    public int hashCode() {
        return Objects.hash(this.age, super.getName());//hash -> generate a new int number representing the object
    }


    //usually for debug
    @Override
    public String toString() {
        return "Pig[ "
            + "age" + this.age
            + ", name " + super.getName() //concat
            + "]";
    }



    public void sleep() {
        System.out.println("Pig is sleeping ...");
    }






    public static void main(String[] args) {

        Pig pig1 = new Pig("Pig1", 5);
        Pig pig2 = new Pig();
        System.out.println(pig1.getName());//Pig1
        System.out.println(pig2.getName());//null 空指針 
        System.out.println(pig1.getAge());//5
        pig1.sleep();
        pig1.eat();

        //如果一樣 attributes 默認可以當同一隻
        //如果想分別, 多D attributes
        Pig myPig = new Pig("ABC",3);
        Pig checkPig = new Pig("ABC",3);

        //equals()
        //after override, if they are having same value of attributes, they should be same
        if( myPig.equals(checkPig)) {
            System.out.println("not same");//before override, because equal() implementation from Object.class
        }                                  //in java really 2 objects
                                           //check 特徵
                                           //in java world memory object 有2個, 現實世界得一隻, 想 check 2隻是否一樣
    

        //in jave world create 2 new objects, 應該唔一樣
        //作者 override 左, 因為作者應為真實世界應該 return true
        //一樣比較合理
        //如果你 design system 有2個 object 全部 attrubutes 一樣, 就應該當成同一個人
        //attrubutes 夠唔夠多
        //check value
        String s = new String("hello");
        String s2 = new String("hello");
        System.out.println(s.equals(s2));//true
        System.out.println(s.equals("hello"));//true

        System.out.println(s.hashCode());//99162322, same as s2
        System.out.println(s2.hashCode());//99162322
        
        //String.class override toString()
        System.out.println(myPig);//myPig is a object reference,
                                  //當
                                  //冇 override 
                                  //有 toString() Pig[age3, nameAB
        /* When you use System.out.println() with an object reference, 
         * Java will call the toString() method of that object to get 
         * a string representation of it and then print that string to
         *  the console. 
         * The toString() method is automatically called by System.out.println
         *  to get the string representation of the object.
         * 
         */

        System.out.println(checkPig);
        System.out.println(myPig.toString());
    
    }
    
}
