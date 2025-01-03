public class Cat extends Animal { 
    
    //Animal.class is a Parent Class
    //有晒 all attributes from Animal.class
    //Cat.class is a child class
    //no need to write
    //write cat 的作者面對問題, 好多同類 animal

    //private String name; inherit from Parent Animal.class
    //cat 自己 attritbutes
    private int age;


    public Cat(String name, int age) {
        //this.name = name;
        super(name);//calling Parent Constructor, super is a key word to call parent class
                    //call parent 容器放名
                    //super calling public Animal(String name)
                    //super must be the first line to call super()
                    //只可得一個 super()
        this.age = age;
        }
    
    //inherit Parent all instance methods
    //getter
    //public String getName() {
    //    return this.name;
    //}

    public int getAge() {
        return this.age;
    }

    public void walk() {
        System.out.println("Cat is walking");
    }

    public static void main(String[] args) {

        Cat cat = new Cat("milk", 8);
        System.out.println(cat.getName() + " " + cat.getAge());
        cat.walk();





    }

}
