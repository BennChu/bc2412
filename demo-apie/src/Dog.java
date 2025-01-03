public class Dog extends Animal {
    
    /* Parent class is Animal.class
     * inherit all attributes from Animal.class
     * Dog.class is a child class
     * no Dog.class own attribute
     * no need private String name
     */

    //private String name;

    public Dog(String name) {
        super(name); //唔放落自己度 this, 放落 parent 度
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

    public static void main(String[] args) {

        Dog dog = new Dog("my name is dog");
        System.out.println(dog.getName());
        dog.walk();





    }
}
