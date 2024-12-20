public class DemoMethod {
    
    // sum 係個名, (int x, int y) 係 input parameters 係入口, defined 係兩個 int values
    // int -> return type 出去門口
    // sum(int x, int y) -> method signature
    public static int sum(int x, int y){

        int result = x + y;
        return result; // int (sum) -> int 係 retrun type, 要一樣, 所以唔可以 double
    }
    
    //not allowed: same method signature
    // "sum(int a, int b)" = sum(int x, int y)
    //not allowed, bcoz same method name + same parameter list
    //public static int sum ( int a, int b )
    public static int sum1 (int a, int b ){ // this is ok

        return 1;
    }


    public static int sum ( double a, double b ){

        return 2;
    }


    public static double sumDouble (double a, double b){

        return a+b;
    }

    //Java doesn't allow different type for the same method signature
    //public static long sum (int x, int y)


    //sum2()
    // public static int sum2( int a, String b ){

    //     return a + Integer.valueOf(b); //
    // }








    //create a method called subtract
    public static double subtract( double x, double y){ // return double, input double

        double result = x - y;
        return result; // can write, return a-b, can use x and y
    }


    //create a method called countCharacter for counting letter
    //source -> "hello"
    //target 'l'
    //return 2
    public static int countCharacter(String source, char target){

        //可以用 toCharArray 都得

        int count = 0;

        for( int i = 0 ; i < source.length() ; i++ ){ //length is 5, stop at 4, so i<5
            if( source.charAt(i) == target){ //vincent use target == source.charAt(i)
                count++;
            }
        }
        return count;
    }


    //totalMinutes() method
    public static int totalMinutes(int day){
        int minutes = 0;
        for( int i = 0 ; i < day ; i++ ){
            for ( int j = 0 ; j < 24 ; j++ ){
                minutes += 60;
            }

        }

        minutes;
    }


    //countEvenNumber method
    public static int countEven (int[] arr){ //short 就唔得
        int evenCount = 0;

        for( int i = 0 ; i < arr.length ; i++ ){
            if(arr[i] % 2 == 0)
            evenCount++;
        }

        return evenCount;
    }


    public static int countEven(long[] arr){
        int evenCount = 0;

        for( int i = 0 ; i < arr.length ; i++ ){
            if(arr[i] % 2 == 0)
            evenCount++;
        }

        return evenCount;
    }










//***************************main*************************** */
    
    public static void main(String[] args) {
        
        int x = 3;
        int a = 10;
        int b = 11;
        int y = a + b;
        System.out.println(y); //21


        // call sum() method
        y = sum(10, 11);
        System.out.println(y); //21
        y = sum(19, 21);
        System.out.println(y); //40


        //call subtract() method
        double z = subtract( 20.5, 10.1);
        System.out.println(z);

        System.out.println(subtract(100, 98)); //return 2.0, should input double but can input int, 因為升級關係是可以


        //call countCharacter() method, return int
        System.out.println(countCharacter("hello", 'l')); //2
        System.out.println(countCharacter("abc", 'l')); //0
        System.out.println(countCharacter("", 'l')); //0
        System.out.println(countCharacter(" l l l ", 'l')); //3



        String s = "Hello";

        char[] arr1 = new char[s.length()];
        arr1 = s.toCharArray();
        System.out.println(arr1[2]);


        //sum(1, 2.0); //sum(int x, double y)
        //sum(1 ,2); // sum(int x, int y) 優先去 int
        //sum(1.0 , 2); // sum(double x, int y)
        //sum( 1.0, 2.0); //sum (double a, double y)

        //System.out.println(sum2(2 + "123"));


        System.out.println(countEven(new long[] {1L, 3L, 2L, 6L})); // 2
        System.out.println(countEven(new int[] {1, 3, 2, 6})); // 2
        
    }
}
