public class Animal implements Eatable {

    /* 同 eatable related */

    /**
     * a normal class can new object, new Animal()
     * abstract class, cannot 俾人 new object
     * 同 Cat.java, Dog.java, Pig.java a set
     */


    private String name;
    private int age;

    /**
     * empty constructor
     */
    public Animal() {
        
    }

    /**
     * common attribute of cats and dogs
     * Animal.class 係有野 store 野
     */
    public Animal(String name) {
        this.name = name;
        //this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
    
    //implements Eatable
    //Eatable 內有 eat()
    //係 java 世界, make sure Animal 有 eat method
    @Override //唔寫 Override 冇問題, complier 唔會 check
    public void eat() {
        System.out.println("Animal is eating...");
    
    }

    public static void main(String[] args) {

        Cat cat = new Cat ("Jimmy", 3);
        System.out.println(cat.getName());//Jimmy


        Animal cat2 = new Cat ("Mary", 2);
        //Rule 1.During the compile time, 
        //       "Animal cat2" implies the object can be accessed in "Animal Scope".
        //       唔可以 call cat 既野 只可 call 
        //       由 type 決定 你可以 call what
        //       cat2.sleep();//call 唔到, Animal 只有 Eat(), 冇 sleep(), 冇 walk()
        //       cat2.walk();
        cat2.getName();
        cat2.eat();


        //Rule 2.run time
        //left side, 有咩 method
        //cannot call sleep, 
        Animal cat3 = new Animal("Vincent");
        cat3.eat();//Animal is eating


        //cannot place a parent to child reference
        //Cat cat4 = new Animal ("Lucas");

        //Parent class 好處
        //開一條 Animal array, 就可以開其它 animal array
        //唔使開 3 條 array
        //用 Parent 做個 type
        Animal[] animals = new Animal[4];//Cat, Dog, Pig
        animals[0] = new Cat("ABC",2);
        animals[1] = new Cat("ABC",2);
        animals[2] = new Cat("ABC",2);
        animals[3] = new Animal("XYZ");//可以放 Animal or 以下
                                       //唔想開 Animal 傽人放 Animal, then "abstract"

        Cat[] cats = new Cat[3];
        cats[0] = new Cat ("123",5);

        //Example 2
        Shape1[] shapes1 = new Shape1[3];
        shapes1[0] = new Circle1(Color.RED, 3);
        shapes1[1] = new Square1("BLUE", 4);
        shapes1[2] = new Triangle1("YELLOW", 3 , 4);

        //calculate area
        //left side is type, right side is which array
        //Shape1 has method getColor, area()
        for ( Shape1 i : shapes1 )
            System.out.println( i.getColor() + " area is " + i.area());

        //System.out.println( shape.getRadius()) 唔可以, Shape1 冇呢個 method


        //if (shape instanceof Circle) 真身係咪 Circle
        //因為你驗左真身, 所以可以小心咁 downcast
        //你唔驗唔可以 downcast, 因為你唔知真身
        //合 downcast 用
        for( Shape1 shape : shapes1 ) {
            if (shape instanceof Circle1) {
                Circle1 circle = (Circle1) shape;//this is downcast, double y=2.0; 
                System.out.println( circle.getRadius());//comply with rule 1
            } else if (shape instanceof Square1) {
                Square1 square = (Square1) shape;
                System.out.println(square.getSide());
            }

        }

        //Example 4: for interface
        Eatable cat4 = new Cat ("Tommy", 5);
        cat4.eat();//Eatable 有 eat()
                   //Cat is eating
                   //cat4.walk(), cannot

        Sleepable[] animals2 = new Sleepable[2];
        animals2[0] = new Cat("Steve",2);
        animals2[1] = new Dog("Owen");;
        //animals2[2] = new Animals(); //cannot, Animal didnt implement Eatable

        animals2[1].sleep();
        animals2[0].sleep();//Sleepable, 係決定有咩 method 可以 call
                            //cannot eat()


        Animal animal = new Cat("ABC", 3);
        animal.eat();
        animal = new Dog("CDE");
        animal.eat();
            

    }


}
