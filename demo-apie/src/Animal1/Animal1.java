package Animal1;
public class Animal1 implements Eatable {

    /* 同 eatable related */

    /**
     * a normal class can new object, new Animal()
     * abstract class, cannot 俾人 new object
     * 同 Cat.java, Dog.java, Pig.java a set
     */


    private String name;
    private int age;

    //empty constructor
    public Animal1() {
        
    }

    /**
     * common attribute of cats and dogs
     * Animal.class 係有野 store 野
     */
    public Animal1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
    
    //implements Eatable
    //Eatable 內有 void eat()
    //係 java 世界, make sure Animal 有 eat method
    @Override //唔寫 Override 冇問題, complier 唔會 check
    public void eat() {
        System.out.println("Animal is eating...");
    
    }

    public static void main(String[] args) {

        //Cat1 class new object Cat1
        //cat store reference of new object Cat1
        Cat1 cat = new Cat1 ("Jimmy", 3);
        System.out.println(cat.getName());//Jimmy


        Animal1 cat2 = new Cat1 ("Mary", 2);
        //Rule 1.During the compile time, 
        //       "Animal cat2" implies the object can be accessed in "Animal Scope".
        //       唔可以 call cat 既野 只可 call Animal
        //       由 type 決定 你可以 call what
        //       cat2.sleep();//call 唔到, Animal 只有 Eat(), 冇 sleep(), 冇 walk()
        //       cat2.walk();
        cat2.getName(); //Animal.class has this method
        cat2.eat(); //Animal.class and Cat.class both have this method
                    //Cat1 is eating

        System.out.println(cat2.getName());//Mary
        //System.out.println(cat2.eat());


        //Rule 2.run time
        //left side, 有咩 method
        //cannot call sleep, 
        Animal1 cat3 = new Animal1("Vincent",10);
        cat3.eat();//Animal is eating


        //cannot place a parent to child reference
        //Cat cat4 = new Animal ("Lucas");//前面係 Cat class, 後面係 Animal type

        //Parent class 好處
        //開一條 Animal array, 就可以放其它 animals (Cat, Dog, Pig) 係array
        //唔使開 3 條 array
        //用 Parent 做個 type
        Animal1[] animals = new Animal1[4];//Cat, Dog, Pig
        animals[0] = new Cat1("ABC",2);
        animals[1] = new Cat1("CDE",2);
        animals[2] = new Cat1("EFG",2);
        animals[3] = new Animal1("XYZ",10);//可以放 Animal or 以下
                                          //唔想開 Animal 傽人放 Animal, then "abstract"
        System.out.println("animals[0].getName() is " + animals[0].getName());

        //for each loop to print names
        for (Animal1 animal : animals)
            System.out.println(animal.getName());

        Cat1[] cats = new Cat1[3];
        cats[0] = new Cat1 ("123",5);

        //Example 2
        Shape1[] shapes1 = new Shape1[3];
        shapes1[0] = new Circle1(Color.RED, 3);
        shapes1[1] = new Square1(Color.BLUE, 4);
        shapes1[2] = new Triangle1(Color.YELLOW, 3 , 4);
        //shapes1[2] = new Shape1(Color.RED);//this one cannot, Shape1 is an sbstract class

        //calculate area
        //left side is type, right side is which array
        //Shape1 has method getColor, area()
        //shapes1 指住 Shape1[] array, array 指住 Circle, Square, Tringle
        //佢地都係 extend Shape1
        //shapes1[0] 指住 Circle1, 如果 Circle1 有 override Shape1 area method, 就會用 circle1
        for ( Shape1 i : shapes1 )
            System.out.println( i.getColor() + " area is " + i.area());

        //System.out.println( shape.getRadius()) 唔可以, Shape1 冇呢個 method
        //同上面一樣, 因為 Circle 有 override parent area method
        System.out.println("Circle1 area: " + shapes1[0].area());
        //cannot call getRadius()
        //because the shapes1 array is of type Shape1, 
        //and the Shape1 class doesn't have a getRadius() method. 
        //Therefore, the compiler doesn't know that the actual object is a Circle1 with a getRadius() method
        //System.out.println("Circle radius: " + shapes1[0].getRadius());

        //if (shape instanceof Circle) 真身係咪 Circle
        //因為你驗左真身, 所以可以小心咁 downcast
        //你唔驗唔可以 downcast, 因為你唔知真身
        //合 downcast 用
        for( Shape1 shape : shapes1 ) {
            if (shape instanceof Circle1) {//shape 係唔係 instanceof circle1
                                           //用 for loop, loop shapes1 array
                                           //check 裹面真身係唔係 Cirlce1
                                           //係就 downcast to Circle1
                                           //放係 Circle1 circle 度跟住做野
                Circle1 circle = (Circle1) shape;//this is downcast, double y=2.0; 
                System.out.println( circle.getRadius());//comply with rule 1
            } else if (shape instanceof Square1) {
                Square1 square = (Square1) shape;
                System.out.println(square.getSide());
            }

        }

        //Example 4: for interface
        Eatable cat4 = new Cat1 ("Tommy", 5);
        cat4.eat();//Eatable 有 eat()
                   //Cat is eating
                   //cat4.walk(), cannot

        Sleepable[] animals2 = new Sleepable[2];
        animals2[0] = new Cat1("Steve",2);
        animals2[1] = new Dog("Owen",9);;
        //animals2[2] = new Animals(); //cannot, Animal didnt implement Eatable

        animals2[1].sleep();
        animals2[0].sleep();//Sleepable, 係決定有咩 method 可以 call
                            //cannot eat()


        // Animal1 animal = new Cat1("ABC", 3);
        // animal.eat();
        // animal = new Dog("CDE",8);
        // animal.eat();

        Animal1 animal;
        int x =1;
        if (x==1) {
            animal = new Cat1("ABC", 3);
            animal.eat();                           //Cat1 is eating
            System.out.println(animal.getName());   //ABC
        } else {
            animal = new Dog("CDE",8);
            animal.eat();                           //Dog is eating
            System.out.println(animal.getName());   //CDE
        }
            



    }


}
