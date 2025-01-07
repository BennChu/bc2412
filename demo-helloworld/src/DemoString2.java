public class DemoString2 {
  public static void main(String[] args){

    int x = 10;
    String s = "number";
    // String s1 = x; // cannot convert from int to String

    System.out.println(s);

    //add x to s
    System.out.println(s+x);//just printout string and int
                            //但 s 係冇變
    System.out.println(s);//number

    System.out.println(s.charAt(0)); // return n

    // for loop printing letters
    for(int i = 0; i<s.length(); i++) {

      System.out.println(s.charAt(i));

    }


    




  } // end main
  
} // end class
