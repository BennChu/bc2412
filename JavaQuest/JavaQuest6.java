public class JavaQuest6 {
  /**
   * Expected output:
   * 0 1 1 2 3 5 8 13 21 ...
   * 
   */
  public static void main(String[] args) {
    
    int first = 0, second = 1;
    // for loop to print first 15 numbers in Fibonacci Sequence

    int n = 15;
    int[] arr = new int[n]; // declare a int array with n houses for storing values

    arr[0] = 0;
    arr[1] = 1;

    System.out.print( first + " " + second + " ");

    for( int i = 0 ; i < arr.length-2 ; i++ ){

      arr[i+2] = arr[i] + arr[i+1];

      System.out.print(arr[i+2] + " ");

    }



    System.out.println();

//************************************************************ */

    int r = 10;      // for counting how many row
    int a = 0;      // for counting how many " " to print
    int b = 0;      // for counting how many "*" to print


          for( int i = 0 ; i < r ; i++ ){

                    // print " "
                    for( int j = 0 ; j < r - a ; j++ ){
                      System.out.print(" ");
                    }

                    // print "*"
                    for( int k = 0 ; k < b + 1 ; k++ ){
                      System.out.print("*");
                    }

                    a++;
                    b = b + 2;
                    System.out.println();

          }

  }// end main
}// end class