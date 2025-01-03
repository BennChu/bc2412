import java.util.Arrays;

public class Code3289 {
  

    // Leetcode 3289
    // The Two Sneaky Numbers of Digitville
    // In the town of Digitville, there was a list of numbers called nums 
    // containing integers from 0 to n - 1. 
    // Each number was supposed to appear exactly once in the list, 
    // however, two mischievous numbers sneaked in an additional time,
    // making the list longer than usual.


    public static int[] getSneakyNumbers(int[] nums) {

      int[] counters = new int[nums.length];
      int[] values = new int[2];
      int j = 0;

      for( int i = 0 ; i < nums.length ; i++ ) {
          
          //assume input {0,1,1,0}
          //nums[0] is 0, so counters[0] + 1
          //nums[1] is 1, so counters[1] + 1
          //nums[2] is 1, so counters[1] + 1
          //nums[3] is 0, so counters[0] + 1
          //so counters[0] is 2, counters[1] is 2
          counters[nums[i]]++;
      }        

      for( int i = 0 ; i < values.length ; i++ ) {
          if( counters[i] == 2 ) {
              values[j] = i;
              j++;
          }
      }
  return values;
  }


    public static void main(String[] args) {

        int[] arr = new int[] {0,1,1,0};

        //Code3289.getSneakyNumbers(arr));, also ok
        System.out.println(Arrays.toString(getSneakyNumbers(arr)));




    }//main
}//class
