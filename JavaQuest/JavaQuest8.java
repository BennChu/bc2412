/**
 * Example Output
 * Second Max = 230
 */
public class JavaQuest8 {
  // Write a loop to find the second max number.
  public static void main(String[] args) {
    int[] nums = new int[] { -10, 5, 100, 240, 230, 80 }; // Second Max = 230 ok
    int[] nums2 = new int[] { -10, 5, 100, 120, 240, 200 }; // Second Max = 200
    int[] nums3 = new int[] { -10, 5, 120, -100, 100, 240 }; // Second Max = 120
    int[] nums4 = new int[] { -10, 5, 100, 240, 240, 80 }; // Second Max = 240

    // Your program should be able to handle all the above test case.

    int secondMax;
    int temp;

        for( int i = 0 ; i < nums.length-1 ; i++ ){
          if( nums[i] > nums[i+1]){
            temp = nums[i];
            nums[i] = nums[i+1];
            nums[i+1] = temp;
          }
        }

 
        for( int i = 0 ; i < nums.length-2 ; i++ ){
          if( nums[i] > nums[i+1]){
            temp = nums[i];
            nums[i] = nums[i+1];
            nums[i+1] = temp;
          }
        }
        secondMax = nums[nums.length-2];
        System.out.println("Second max number in nums " + secondMax); // 230

 
        // for nums2
        for( int i = 0 ; i < nums2.length-1 ; i++ ){
          if( nums2[i] > nums2[i+1]){
            temp = nums2[i];
            nums2[i] = nums2[i+1];
            nums2[i+1] = temp;
          }
        }

 
        for( int i = 0 ; i < nums2.length-2 ; i++ ){
          if( nums2[i] > nums2[i+1]){
            temp = nums2[i];
            nums2[i] = nums2[i+1];
            nums2[i+1] = temp;
          }
        }
        secondMax = nums2[nums2.length-2];
        System.out.println("Second max number in nums2 " + secondMax); // 200


        // nums3
        for( int i = 0 ; i < nums3.length-1 ; i++ ){
          if( nums3[i] > nums3[i+1]){
            temp = nums3[i];
            nums3[i] = nums3[i+1];
            nums3[i+1] = temp;
          }
        }

 
        for( int i = 0 ; i < nums3.length-2 ; i++ ){
          if( nums3[i] > nums3[i+1]){
            temp = nums3[i];
            nums3[i] = nums3[i+1];
            nums3[i+1] = temp;
          }
        }
        secondMax = nums3[nums3.length-2];
        System.out.println("Second max number in nums3 " + secondMax); // 120


        // nums4
        for( int i = 0 ; i < nums4.length-1 ; i++ ){
          if( nums4[i] > nums4[i+1]){
            temp = nums4[i];
            nums4[i] = nums4[i+1];
            nums4[i+1] = temp;
          }
        }

 
        for( int i = 0 ; i < nums4.length-2 ; i++ ){
          if( nums4[i] > nums4[i+1]){
            temp = nums4[i];
            nums4[i] = nums4[i+1];
            nums4[i+1] = temp;
          }
        }
        secondMax = nums4[nums4.length-2];
        System.out.println("Second max number in nums4 " + secondMax); // 240





  }
}