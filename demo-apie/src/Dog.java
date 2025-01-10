public class Dog extends Animal implements KeepAlive {
    
    /* Parent class is Animal.class
     * inherit all attributes from Animal.class
     * Dog.class is a child class
     * no Dog.class own attribute
     * no need private String name
     */

    private String name;
    private int age;

    public Dog(String name, int age) {
        super(name,age); //唔放落自己度 this, 放落 parent 度
                     //class cannot inherit parent constructor
    }
    
    //has Parent class, no need getName method
    //can inherit from parent class (Animal.class)
    // public String getName() {
    //     return this.name;
    // }

    
    public void walk() {
        System.out.println("Dog is walking");
    }

    //repeat 左 eat() method
    // @Override
    // public void eat() {
    //     System.out.println("Dog is eating");
    // }
    @Override
    public void drink() {
        System.out.println("Dog is drinking");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }



    public static void main(String[] args) {

        Dog dog = new Dog("dog",5);
        System.out.println(dog.getName());
        dog.walk();
        dog.eat();
        dog.drink();
        dog.sleep();





    }
}
