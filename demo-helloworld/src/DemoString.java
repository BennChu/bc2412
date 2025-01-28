public class DemoString {
  public static void main(String[] args){

    char x = 'a';
    x = 1;  // define a Char value by single quote '', cannot ' ' space
            //ok 
            // char x = '1.1' cannot
            // char x = 'true' cannot
            // char x = 'x' ok
            // char x = '0' cannot


    // define a String value by double quote ""
    String password = "abcd1234";
    String emailAddress = "abc@gmail.com";

    // + operation, String can add more letter
    password = password + "!";
    System.out.println(password); //abcd1234!

    // Java method (Instance method)
    // action

    // charAt(),  return char, inside bracket 要 (int)
    char result = password.charAt(0); // 0 represents the first position of the string value
    System.out.println(result);

    // index starts from 0 to lenght -1, index = lenght - 1
    System.out.println(password.charAt(8)); // return !

    // System.out.println(password.charAt(9)); // error
    // System.out.println(password.charAt(-1)); //error

    //String 大草, 其實係一個 class 有工具
    //print the last character of string
    String password2 = "helloworld";

    //charAt(index)
    //index 由 0 開始
    //length 由 1 開始
    char lastChar = password2.charAt(password2.length()-1);
    System.out.println("lastChar = " + lastChar);


    //equals()
    //String 作者設計 equals() 大草細草唔一樣
    String s1 = "abc";
    String s2 = "abc";

    boolean result2 = s1.equals(s2);
    System.out.println(result2); //true

    //equals() -> false
    String s3 = "abc";
    String s4 = "efg";

    boolean result3 = s3.equals(s4);
    System.out.println(result3); // false

    String s6 = "abc";
    String s7 = "Abc";

    boolean result5 = s6.equals(s7);
    System.out.println(result5); //false, 大草細草唔一樣
 
    //length()
    String s5 = "how are you today     !    ";

    int result4 = s5.length(); //return 27, the length of String value, space 都計
    System.out.println(result4);


    //empty string
    //char cannot like this char empty = '';
    //can like this char empty  = ' '; this is a space
    String emptyString ="";
    System.out.println("empty String = " + emptyString.length());//return 0
    System.out.println(emptyString.isEmpty());//true
    //System.out.println(emptyString.charAt(0));//return java.lang.StringIndexOutOfBoundsException
    String emptyString1 =" ";
    System.out.println("empty String1 = " + emptyString1.length());//return 1
    System.out.println(emptyString1.isEmpty());//false, return true, if and only if length() 0
    System.out.println(emptyString1.isBlank());//true, is empty or contain white space
    System.out.println(emptyString1.charAt(0));//return " "


    boolean isStringEmpty = "".equals(emptyString);
    System.out.println(isStringEmpty);//true


    String s = "Hello";
    System.out.println("Hello".equals(s)); //true, asking if s equals to "Hello"

    System.out.println("Hello".charAt(2)); //return l, index 0 = H, index 1 = e, index 2 = l
    System.out.println("'Hello' length is " + "Hello".length()); //return 5

    // 'c' is char cannot .charAt(), primitive has no method (tool)

    //isEmpty
    s5 = "abc";
    boolean isEmpty = s5.length() == 0;
    System.out.println("is s5pty: " + s5.isEmpty()); // false

    if(!s5.isEmpty()){


    }


    //substring
    String substr = s5.substring(0,2); // return index of s5 index 0 till 2-1
    System.out.println(substr); //should return a b
    //s5 value doesnt change
    // substr is storing a new string value returned by "substring"

    System.out.println(s5.substring(0,s5.length()));
    s5.substring(1);



    
  }// end main
  
}// end class
