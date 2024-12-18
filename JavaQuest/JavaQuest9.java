/**
 * Expected Output:
 * J
 * e
 * 3
 * 9
 * 10
 * ab c
 * VenturenixLAB, Coding
 * 19
 * ren
 * VENTURENIXLAB, JAVA
 * venturenixlab, java
 * V*NTUR*NIXLAB, JAVA!!!
 */
public class JavaQuest9 {

    public static String chaining(String a){

        return a.replace('e', '*').concat("!!!");

    }




  public static void main(String[] args) {
    String str = "VenturenixLAB, Java";



    // prints J
    char target = 'J';
    for( int i = 0 ; i < str.length() ; i++ ){
      if( target == str.charAt(i)){
        System.out.println(str.charAt(i));
        break;
      }
    }




    // prints e (the 1st e)
    target = 'e';
    for( int i = 0 ; i < str.length() ; i++ ){
      if( target == str.charAt(i)){
        System.out.println(str.charAt(i));
        break;
      }
    }



    // Use indexOf()
    // prints 3
    // prints 9
    // prints 10
    //"VenturenixLAB, Java", t is index 3, x index 9, L is index 10
    System.out.println(str.indexOf('t'));
    System.out.println(str.indexOf('x'));
    System.out.println(str.indexOf('L'));





    // Use String trim()
    String abc = "    ab c    ";
    // prints "ab c"
    System.out.println(abc.trim());




    // Use String replace() method
    // prints VenturenixLAB, Coding
    // str = VenturenixLAB, Java
    System.out.println(str.replace("Java", "coding"));
    



    // int length()
    // prints 19
    System.out.println(str.length());





    // Use String substring(int start, int end)
    // prints "ren"
    //str = VenturenixLAB, Java, r index 5, n index 7
    System.out.println(str.substring(5,8));




    // print "VENTURENIXLAB, JAVA"
    // prints "venturenixlab, java"
    System.out.println(str.toUpperCase());
    System.out.println(str.toLowerCase());





    // Method Chaining (one line to complete)
    // prints "V*NTUR*NIXLAB, JAVA!!!"
    System.out.println(chaining("VENTURENIXLAB, JAVA"));


  }
}