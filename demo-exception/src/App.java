public class App {
    public static void main(String[] args) {

        int q = 0;
        if (q != 0) {
            int x = 10 / q;  //java.lang.ArithmeticException: / by zero
                             //java 決定唔行落去, 我地要 avoid
                             //check q is it 0
        }
            

        //如果用 if 可以 handle 就用 if
        //Handle Exception
        try {
            int a = 10 /q;
        } catch (ArithmeticException e) {
            System.out.println("Cannot divided by zero");
        }



        //nullpointer exception (NPE)
        String result = null;
        //System.out.println(s.charAt(0));


        // try{
        //     result = concat(null, "abc");//method caller
        // } catch (IllegalArgumentException e) { 
        //     //1. catch class
        //     //2. when something wrong happen within the try block
        //     System.out.println("Ignore the bomb.");
        // }


        //try & catch
        try {
            result = concat("hello", "abc");//method "caller"
        } catch (IllegalArgumentException e) { //catch class
            System.out.println("Ignore the bomb.");
        }

        System.out.println(result);


        //3. Integer.parseInt
        //NumberFormatException e
        String input2 = "-3.";
        try {
            int x2 = Integer.parseInt(input2);
        } catch (NumberFormatException e) {
            input2 = "-1";
        }
        System.out.println(input2); //-1, from string to int


        //4. 應該自己 avoid, 用 program 做 avoid, 因為都常自己入 [3], 唔會係 user
        String[] arr = new String[] {"abc", "def", "ijk"};
        //System.out.println(arr[3]);
        for (int i = 0 ; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }
    
    
        //5. 
        //java.lang.StringIndexOutOfBoundsException
        //String s3 = "Hello";
        //System.out.println(s3.charAt(s3.length()));
    
    
    
    
    
    }


    public static String concat(String x, String y) {
        if (x == null)
            throw new IllegalArgumentException();//complain method input parameters
                                                //throw an object
            return x.concat(y);
    }


}
