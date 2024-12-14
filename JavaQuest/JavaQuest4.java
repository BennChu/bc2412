public class JavaQuest4 {
  /**
   * Exercise: Print 10 numbers: they must be even and > 0, and divisible by 3
   * and divisible by 2 (Search it from 1)
   * 
   * Expected Output: 6 12 18 24 30 36 42 48 54 60
   */
  public static void main(String[] args) {
    // Print first ten numbers, which fulfill the followings criteria:
    // 1. Even numbers
    // 2. Divisible by 3
    // 3. > 0

    int n = 10;

    if ( n<=0){
      System.out.println("Please input a number > 0");
    }else{

        int[] arr = new int[n];       // declare an int array to store 10 numbers
        int count = 0;                 // declare int variable to control counting of array

        for (int i = 0; i < 100; i++) {
            if( i > 0 && i % 2 == 0 && i % 3 == 0){

              arr[count] = i;
              System.out.print(arr[count] + " ");
              count++;
            }
      
            if( count == n ){
            break;
            }

        }// loop
    
    }


    // test cases
    //1. n = 0 -> should return Please input numbers > 0
    //2. n = -5 -> should return Please input numbers > 0
    //3. n = 10 -> should return 6 12 18 24 30 36 42 48 54 60
    //4. n = 16 -> should return 6 12 18 24 30 36 42 48 54 60 66 72 78 84 90 96
    //5. n = 17 -> should return 6 12 18 24 30 36 42 48 54 60 66 72 78 84 90 96
    //6. n = 20 -> should return 6 12 18 24 30 36 42 48 54 60 66 72 78 84 90 96




    
  } // end main
} // end class