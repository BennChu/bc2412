public class Pig extends Animal {

    //own attributes

    //如果你開 empty constructor, parent class (Animal.class) 都要開
    public Pig() {
        //implicity calling super();
        //super();
        //super("ABN");
    }

    //constuctor
    //name 放落 Parant class (Animal.class)
    public Pig(String name) {
        super(name);
    }



    public void sleep() {
        System.out.println("the pig is sleeping ...");
    }






    public static void main(String[] args) {

        Pig pig1 = new Pig("PigPig");
        Pig pig2 = new Pig();
        System.out.println(pig1.getName());
        System.out.println(pig2.getName());//null 空指針 
        pig1.sleep();

    }
    
}
