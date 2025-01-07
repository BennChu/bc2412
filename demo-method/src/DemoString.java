public class DemoString {

  public static void main(String[] args) {


    //string function 有好多工具, methods

    String s1 = "hello";                            //s1 type is String, 所以 . 係 string 既 method
    System.out.println(s1.length());                //5, start from 1
    System.out.println(s1.charAt(1));               //e, 1 is index position, 0 is the first
    System.out.println("Hello".equals(s1));         //true, only for String type
    System.out.println(s1.contains("ll"));          //true
    System.out.println(s1.substring(0, 2));         //he, beginning index 0 , ending index 1(2-1)
    //example
    System.out.println(s1.substring(1));            //ello, only input beginning index

    System.out.println(s1.contains("lll"));         //false
    System.out.println(s1.concat("!!!"));           //hello!!!
    System.out.println(s1.startsWith("h"));         //true
    System.out.println(s1.startsWith("ha"));        //false
    System.out.println(s1.endsWith("lo"));          //true
    System.out.println(s1.endsWith("oo"));          //false
    System.out.println(s1.toUpperCase());           //HELLO
    System.out.println("HELLO".toLowerCase());      //hello


    System.out.println("helollolllollllo".replace("ll", "xxx"));    //heloxxxoxxxloxxxxxxo, 可以 replace string
    System.out.println(s1.replace('l', 'm'));                       //hemmo, replace all 'l' old char, to new char 'm'
    System.out.println(s1.equalsIgnoreCase("HeLLo"));               //true, ignore 大細草

   
    //**********************important use a lot
    System.out.println(s1.indexOf('e'));              //return 1, 係一個 index
    System.out.println(s1.indexOf('h'));              //return 0, 係一個 index
    System.out.println(s1.indexOf('x'));              //return -1, cannot found
    System.out.println(s1.indexOf("ll"));             //return 2, indexOf 可以 2 characters return 第一個字 index
    System.out.println(s1.lastIndexOf('l'));          //return 3
    System.out.println("hellollo".lastIndexOf("ll")); //return 5
    System.out.println("hellollo".lastIndexOf("l"));  //return 6
    
    System.out.println(s1.isEmpty());       //return false
    System.out.println("".isEmpty());       //return true

    System.out.println(s1.isBlank());             //return false
    System.out.println("".isBlank());             //return true
    System.out.println(" ".isBlank());            //return true

    System.out.println(" hel lo ".trim());      //return "hel lo", trim 頭尾 space
    System.out.println("abc".compareTo("bbb")); //return -1, compare the first character
                                                //negative means abc before bbb
    System.out.println("abc".compareTo("dbb")); //return -3, compare the first character
    System.out.println("aac".compareTo("azb")); //retur -25 (a vs z), compare the second character


    //chain method, 點完再點
    System.out.println("hello".concat("ijk").concat("def").toUpperCase()); //HELLOIJKDEF

    //split
    String s = "hello world";
    String[] arr = s.split(" ");
    //System.out.println(Arrays.toString(arr));
    for (String s2 : arr) //for each loop, loop 一個 array 係 string type
      System.out.println(s2);//return hello
                             //return world

      String str = "apple, banana;cherry; date"; 
      String[] fruits = str.split("[,; ]+");//見到 fruit's' 有s 就係 arrays 
      for (String fruit : fruits) {
          System.out.println(fruit);
      }


    //charAt() -> Find char by index
    //indexOf() -> find index by char



  }

}
