public class DemoString {

    public static void main(String[] args) {


        /* String 係 immutable 不可改
         * purpose, reduce risk
         */
        String s = "hello"; //Literial Pool
        String s2 = "hello"; //Literial Pool

        /* 同一個 hello, pointing same object
         * 6 個指針, 1個 hello!, 2 hello object
         * 提升性能
         * String 好多出現次數
         */
        String s3 = s;
        String s4 = "hello!";
        String s5 = new String("hello");
        //example 唔岩
        //char[] arr = new char[] {'h','e','l','l','o'};
        //valueOf 作者寫左 9 個, method name 改 method parameter
        //valueOfStringFromDouble, from 乜野係 signature 
        //短 method 名, 放 parameters
        String s6 = String.valueOf("hello"); //leverage literial pool
        String s7 = new String("hello");

        /* System.identityHashCode(s) -> object address (object reference) */
        System.out.println(System.identityHashCode(s)); //617901222
        System.out.println(System.identityHashCode(s3));
        System.out.println(System.identityHashCode(s2));
        System.out.println(System.identityHashCode(s4));
        System.out.println(System.identityHashCode(s5));
        System.out.println(System.identityHashCode(s6)); 
        System.out.println(System.identityHashCode(s7)); //681842940


        /* String 係 immutable 不可改
         * purpose, reduce risk
         * Question: after appending "?", is "s" still the same object
         * no, 新指針
         */
        //s = s + '?';
        System.out.println(System.identityHashCode(s)); //1670782018

        /* String.equals(), is checking the String value 本身
         * ==, for non primitive, you are checking object reference
         */
        System.out.println(s == s2); //true, object reference
        System.out.println(s.equals(s2)); //true, value

        System.out.println(s == s5); //false
        System.out.println(s.equals(s5)); //true

        System.out.println(s7 == s5); //false






    }
  
}
