

public class LittlePig extends Pig {

    
    //final cannot extends, cannot override
    //no final can extends then can override
    //inherate all attributes from Animal and Pig
    public LittlePig(String name, int age) {
        super(name, age);
    }
    

    public static void main(String[] args) {

        LittlePig littlePig1 = new LittlePig("littlePig1", 8);
        littlePig1.eat(); //return -> Animal is eating...
                          //because there is no override parent method
                          //will run Parent method
        littlePig1.sleep();
        System.out.println(littlePig1.getName());




    }

}
