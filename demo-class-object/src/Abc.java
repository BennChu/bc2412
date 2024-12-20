public class Abc {
  

  public static void main(String[] args) {
     
    //用一個全新同 memory
    //run, memory 上的 location 佔

    //連續三個 location

    int[] arr = new int[3];

    //生產一個 person (new Person), data( vincent 同 18 vincent@gmail.com), 同生共死關係
    //另一個 person, lucas 同  17, 同生共死關係
    Person p1 = new Person("vincent", 18, "vincent@gmail.com");
    Person p2 = new Person("lucas", 17, "lucas@gmail.com");

    System.out.println(p1.getName());
    System.out.println(p1.getAge());
    System.out.println(p1.getEmail());
    
    System.out.println(p2.getName());
    System.out.println(p2.getAge());
    System.out.println(p2.getEmail());

    //p1, p2, 唔可以放 string , different type
    Person[] persons = new Person[] {p1, p2, new Person("dicky", 19, "dicky@gmail.com")};

    //get name, age, email
    for( Person p : persons){

        System.out.println(p.getName()+ ", " + p.getAge()+ ", " + p.getEmail());

    }

    Person p3 = p2; //p3 p2 係一個地址, 指住同一個 object
    System.out.println(p3.getName());
    System.out.println(p3.getAge());

    p2.setAge(30);
    System.out.println(p2.getAge());
    System.out.println(p3.getAge());

    p2.setName("big");
    System.out.println(p2.getName());












    String s1 = "hello";
    String[] strings = new String[] {s1, "world"};







}
}
