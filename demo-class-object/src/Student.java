import java.util.Arrays;

public class Student {

  /* Expected Output
   * 20 candies -> distribute to students according to their score
   * Rule: every round of distribution, Above 80 score -> 2 candies; between 60 - 79 score -> 1 candy
   * Student 1: 67
   * Student 2: 89
   * Student 3: 50
   * Student 4: 99
   * Student 5: 60
   * Student 6: 59
   * 
   * round
   * 1. 1 + 1 + 1 + 1 = 4 
   * 2. 2 + 2 + 2 + 0 = 6
   * 3. 0 + 0 + 0 + 0 = 0
   * 4. 2 + 2 + 2 + 0 = 6
   * 5. 1 + 1 + 1 + 1 = 4
   * 6. 0 + 0 + 0 + 0 = 0
   * 
   * Expected output:
   * Student 1 has 4 candies
   * Student 2 has 6 candies
   * Student 3 has 0 candies
   * Student 4 has 6 candies
   * Student 5 has 4 candies
   * Student 6 has 0 candies
   */


   // 寫法係每個 student 都有呢條 array
   // 要加 static
   private static int[] score = new int[] {67, 89, 50, 99, 60, 59};
   private static int candy = 20;
   private static int[] count = new int[score.length];

    public static void main(String[] args) {


      // private int[] score = new int[] {67, 89, 50, 99, 60, 59};
      // private int candy = 20;
      // private int[] count = new count[score.length];


      // int[] score = new int[] {67, 89, 50, 99, 60, 59};
      // int candy = 20;
      // int[] count = new int[score.length];


      /* Step1: check if still have candies, then distribute
       * 
       */

      while( candy > 0 ) {

          for( int i = 0 ; i < score.length ; i++ ) {
              if( score[i] > 80 && candy > 1 ) {
                  count[i] = count[i] + 2;
                  candy = candy - 2;
              }else if( score[i] >= 60 && score[i] < 79 && candy > 0 ) {
                  count[i] = count[i] + 1;
                  candy = candy - 1;
              }
          }

      }

      //checking
      System.out.println(Arrays.toString(count));


      int idx = 1;
      for( int i = 0 ; i < count.length ; i++ ) {
        System.out.println("Student " + idx + " has " + count[i] + " candies.");
        idx++;
      }




      /* Question 2
       * Candy.class has attribute color (RED, BLUE, YELLOW)
       * Student2.class to store his own candies
       * make candies, 裝 candy
       * 20 candies -> distribute to students according to their score
       * Rule: every round of distribution, Above 80 score -> RED; between 60 - 79 score -> BLUE candy, else YELLOW
       * Student 1: 67
       * Student 2: 89
       * Student 3: 50
       * Student 4: 99
       * Student 5: 60
       * Student 6: 59
       * 
       * Expected output: return Student[] (Student[] should have candy attribute)
       */









    }
  
}
