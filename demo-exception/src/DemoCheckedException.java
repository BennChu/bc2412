public class DemoCheckedException {

    //一定要消化的 bomb
    //2 types exception: checked exception - 1. compile time do checking, exception.class, parent,
    //                                          the compiler requires us to handle
    //                   unchecked exception - 2. runtime do checking, runtime exception RuntimeException.class, child
    //3. error

    //define Checked Exception
    public static class BusinessException extends Exception {//如果寫 RuntimeException, mean run time 先 check

    }


    //define checked Exception
    public static class BusinessRuntimeException extends RuntimeException {

    }


    //who is the caller of main() method
    //JVM (Java Virtual Machine) call this main method
    //main 做 testing, main 可有可冇
    public static void main(String[] args) {//this is run time
        
        int sum = 0;

        // try {
        //     throw new BusinessException();
        // } catch (BusinessException e) {
        //     System.out.println("Handle Checked exception.");
        // }
        
         try {
             sum = sum(10, 1);//throw checked exception (compile time)
             System.out.println("sum result: " + sum);
         } catch (BusinessException e) {
             System.out.println("x and y cannot be null");
         }
        

         //for runtime exception, you can catch or not catch
         sum = sum2(10, null);//syntax OK, but the exception still exit

        try {
            sum = sum2(10, 1);//throw uncheck exception (run time)
            System.out.println("sum result: " + sum);
        } catch (BusinessRuntimeException e) {
            System.out.println("x and y cannot be null");
        }
        
        
    }



    /**
     * static methods
     */
    //When you declare a method that throws an exception in its signature, 
    //you are essentially communicating that this method might cause an exceptional condition
    // that it does not handle internally and that the calling method must be prepared to handle.
    //for compile time exception "throws BusinessException" is 簽名
    public static int sum(Integer x, Integer y) throws BusinessException {
        if (x == null || y == null) {
            throw new BusinessException();
            
        }
        
        return x.intValue() + y.intValue();
    }


    //唔使要簽名
    public static int sum2(Integer x, Integer y) {
        if (x == null || y == null) {
            throw new BusinessRuntimeException();
            
        }
        return x.intValue() + y.intValue();
    }
    
}
