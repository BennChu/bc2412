package Animal1;
public class Cat1 extends Animal1 implements Walkable, Sleepable { 
    
    /**
     * extends only 1 class
     * implements can more than 1
     * Animal.class is a Parent Class of Cat.class
     * Cat.class 有晒 all attributes from Animal.class
     * Cat.class is a child class
     * no need to write
     * write cat 的作者面對一個問題, 好多同類的 animal, 有同樣的 attributes
     */


    //private String name; inherit from Parent Animal.class
    //int age is Cat.class own attritbute
    //private int age; super no need declare

    public Cat1(String name, int age) {
        //this.name = name;
        super(name,age);//calling Parent Constructor, super is a keyword to call parent class
                        //call parent 容器放名入去
                        //super is calling public Animal(String name)
                        //super must be put at the first line in the constructor
                        //只可得一個 super()
        }
    
    //inherit Parent all instance methods
    //getter
    //public String getName() {
    //    return this.name;
    //}


    // public int getAge() {
    //     return this.age;
    // }

    @Override
    public void walk() {
        System.out.println("Cat is walking...");
    }

    @Override
    public void eat() {
        System.out.println("Cat1 is eating...");
    }

    @Override
    public void sleep() {
        System.out.println("Cat is sleeping...");
    }

    //@Override is an indication
    //如果打左 '@Override', 佢就會 check Parent class 有冇以下個同名 method, 然後 override 佢
    //默認應該會同名, 如果唔同名, 會 underline
    //the method eat1 type Cat must override or implement a supertype method
    //隔行都可以 check 到
    //如果冇左以下同名 eat() method, Cat class 就會 inherate Parent class 的 eat() mehtod
    //return "Animal is eating..."
    /* Clarity: It indicates that a method is intended to override a method in a superclass. 
     * This makes the code more readable and easier to understand
     *  for others (or your future self). 
     */

     /* Compile-time Checking: It helps catch errors. 
      * If the superclass method's signature is changed or the method is removed, 
      * the compiler will generate an error if you've used the @Override annotation. 
      * This ensures that the method you're intending to override actually exists and
      * is correctly overridden.
      */

    public String getName() {
        //return "testing";
        return super.getName();
    }


    public static void main(String[] args) {

        Cat1 cat = new Cat1("milk", 8);
        System.out.println(cat.getName());//override 左, 用左 Cat1.class method getName() not Animal1.class method getName(), will return testing
                                          //if not override, then will use Animal1.class method getName(), will return milk
        cat.walk();
        cat.eat(); //before override "Animal is eating...", use Parent class method
                   //after override "Cat is eating...", child class method





    }

}
