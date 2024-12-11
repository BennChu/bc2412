public class DemoString {
  public static void main(String[] args){

    char x = 'a';
    x = 1;  //ok
            // char x = '1.1' cannot
            // char x = 'true' cannot
            // char x = 'x' ok
            // char x = '0' cannot

    // define a String value by double quote ""
    // define a Char value by single quote ''
    String password = "abcd1234";
    String emailAddress = "abc@gmail.com";

    // + operation, String can add more letter
    password = password + "!";

    System.out.println(password); // abcd1234!

    // Java method (Instance method)
    // action

    char result = password.charAt(0); // 0 represents the first position of the string value
    System.out.println(result);

    // index starts from 0 to lenght -1, index = lenght - 1
    System.out.println(password.charAt(8)); // return !
    // System.out.println(password.charAt(9)); // error
    // System.out.println(password.charAt(-1)); //error


    //print the last character of string
    String password2 = "helloworld";
    char lastChar = password2.charAt(password2.length()-1); // do bracket first, 10-1
    System.out.println("lastChar = " + lastChar);


    // equals()
    String s1 = "abc";
    String s2 = "abc";

    boolean result2 = s1.equals(s2);
    System.out.println(result2); //true

    //equals() -> false
    String s3 = "abc";
    String s4 = "efg";

    boolean result3 = s3.equals(s4);
    System.out.println(result3); // false

    // length() function
    String s5 = "how are you today     !    ";

    int result4 = s5.length(); // return 27, the length of String value
    System.out.println(result4);


    //empty string
    String emptyString ="";
    System.out.println("empty String = " + emptyString.length());
    //System.out.println(emptyString.charAt(0));

    boolean isStringEmpty = "".equals(emptyString);
    System.out.println(isStringEmpty);


    String s = "Hello";
    System.out.println("Hello".equals(s)); // asking if s equals to "Hello"

    System.out.println("Hello".charAt(2)); // should return l
    System.out.println("Hello length is " + "Hello".length()); // should return 5

    // 'c' is char cannot .charAt(), primitive has no method (tool)





    
  }
  
}
