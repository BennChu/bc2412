import java.util.Arrays;

public class Abc {
  

  public static void main(String[] args) {
     
    //用一個全新同 memory
    //run, memory 上的 location 佔

    //連續三個 location

    int[] arr = new int[3];

    //生產一個 person (new Person) is an object
    //data(vincent 同 18 vincent@gmail.com), 同生共死關係
    //另一個 person, lucas 同  17, 同生共死關係
    //p1 is an reference address point to an object Person
    Person p1 = new Person("vincent", 18, "vincent@gmail.com");
    Person p2 = new Person("lucas", 17, "lucas@gmail.com");

    //p1 type is Person, class Person has methods getName(), getAge(), getEmail()
    System.out.println(p1.getName());
    System.out.println(p1.getAge());
    System.out.println(p1.getEmail());
    
    System.out.println(p2.getName());
    System.out.println(p2.getAge());
    System.out.println(p2.getEmail());

    //p1, p2, 唔可以放 string , different type
    //前面 array 名 Person 要加 s
    //後面係 new 一個 Person
    Person[] persons = new Person[] {p1, p2, new Person("dicky", 19, "dicky@gmail.com")};

    //get name, age, email
    //for each loop
    //前面 declare, 後面 array variable
    for(Person p : persons) {

        System.out.println(p.getName()+ ", " + p.getAge()+ ", " + p.getEmail());

    }

    //copy p2 address to p3, so p3 p2 係同一個地址, 指住同一個 object
    Person p3 = p2; 
    System.out.println(p3.getName());
    System.out.println(p3.getAge());

    //p2 改 age, 之後 p3.getAge(), 都會係同一個 age 30
    p2.setAge(30);
    System.out.println(p2.getAge());
    System.out.println(p3.getAge());

    p2.setName("big");
    System.out.println(p2.getName());

    //String s2 = p2;
    //not OK, s2 is String, p2 is Person, different types

    
    String s1 = "hello";

    //array strings 加's'
    String[] strings = new String[] {s1, "world"};



    //compile time
    //run time -> 先會真正去 object 度搵野
    //Person p1 = null;
    //p1.getK(); //compile Error -> p1 come from Person.class, 
                 //and this class has no getK() method
    // p1.getAge(); //compile ok
                   //run time error, 
                   //because p1 object reference finally cannot point to an object 




    // String sentence = "Hello World";
    // String[] subSentences = sentence.split(" ");
    // System.out.println(Arrays.toString(subSentences));


    //Cat c1 = new Cat(); c1 store address 係指針
    //new Cat() obsoleted object after created






  }
}
