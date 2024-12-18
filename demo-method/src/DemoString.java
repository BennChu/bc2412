public class DemoString {

  public static void main(String[] args) {


    String s1 = "hello";
    System.out.println(s1.length());// 
    System.out.println(s1.charAt(1)); // e
    System.out.println("Hello".equals(s1));// true
    System.out.println(s1.contains("ll")); // true
    System.out.println(s1.substring(0, 2)); // he, getting index 0 , 1

    System.out.println(s1.contains("lll")); // false
    System.out.println(s1.concat("!!!")); // Hello!!!
    System.out.println(s1.startsWith("h")); // true
    System.out.println(s1.startsWith("ha")); // false
    System.out.println(s1.endsWith("lo")); // true
    System.out.println(s1.endsWith("oo")); // false
    System.out.println(s1.toUpperCase()); // HELLO
    System.out.println("HELLO".toLowerCase()); // hello


    System.out.println(s1.replace("ll", "xxx")); // hexxxo
    System.out.println(s1.replace('l', 'm')); // hemmo
    System.out.println(s1.equalsIgnoreCase("HeLLo")); // true

    // important use a lot
    System.out.println(s1.indexOf('e')); // return 1, 係一個 index
    System.out.println(s1.indexOf('h')); // return 0, 係一個 index
    System.out.println(s1.indexOf('x')); // return -1, cannot found
    System.out.println(s1.indexOf("ll")); // return 2
    System.out.println(s1.lastIndexOf('l')); // return 3
    System.out.println("hellollo".lastIndexOf("ll")); // return 5
    System.out.println(s1.isEmpty()); // return false
    System.out.println("".isEmpty()); // return true

    System.out.println(s1.isBlank()); // return false
    System.out.println("".isBlank()); // return true
    System.out.println(" ".isBlank()); // return true

    System.out.println(" hel lo ".trim()); // return "hel lo", trim 頭尾 space
    System.out.println("abc".compareTo("bbb")); // -1
    System.out.println("abc".compareTo("dbb")); //-3
    System.out.println("aac".compareTo("azb")); //-25 (a vs z)


    //chain method
    System.out.println("hello".concat("ijk").concat("def").toUpperCase()); //HELLOIJKDEF


    //charAt() -> Find char by index
    //indexOf() -> find index by char



  }

}
