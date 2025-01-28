public class DemoRecursion {

    public static void main(String[] args) {
        
        //1 + 2 + 3 + ... + 10
        int sum = 0;
        for (int i = 0 ; i <= 10 ; i++) {
            sum += i;
        }
        System.out.println(sum);

        //Recursion
        System.out.println(sum(10));

        //1 * 3 * 5 *7 * .. * n
        //n can be even number
        int n = 8;
        int result = n % 2 == 1 ? product(n) : product (n-1);
        System.out.println(result);



    }/*end main */




    /**
     * static methods
     */
    public static int sum(int value) {
        //base criteria for when to exit
        if (value <= 0)
            return value;

        //invoke myself
        return value + sum(value-1);

        //sum(10), value = 10
        //step 1. 10 + sum(10-1)
        //step 2. 10 + (9 + sum(9-1))
        //step 3. 10 + (9 + (8 + sum(8-1)))
    }



    public static int product(int n) {
        //base criteria for when to exit
        if (n <= 1)
            return n;
       
        //invoke myself
        return n * product(n-2);
    }
    
    
}
