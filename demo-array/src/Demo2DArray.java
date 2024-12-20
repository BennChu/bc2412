import java.util.Arrays;

public class Demo2DArray {

  public static void main(String[] args){

      int[] arr = new int[3];
      arr[0] = 1;
      arr[1] = 2;
      arr[2] = 3;

      for( int i = 0 ; i < arr.length ; i++ ){
        System.out.println(arr[i]);
      }

      //array 個樣係 [1,2,3]
      //係 memory 係點存, 係連續空間, 一格格
      System.out.println(Arrays.toString(arr));


     //2D array, like excel has row and column
     //2 row and 3 column
     //2 row -> row 0, row 1
     //column -> column 0, column 1, column 2
     //int array, default value is 0
     int[][] arr2d = new int[2][3];

     //1 row , 1 column
     arr2d[0][0] = 100;

     //2 row , 3 column
     arr2d[1][2] = 100;

     //2d array row 0 length
     int rowLength = arr2d[0].length;

      //how many row = arr2d.length
      for( int i = 0 ; i < arr2d.length ; i++ ){

          //how many columns = arred[i].length
          for( int j = 0 ; j < arr2d[i].length ; j++ ){
            System.out.println(arr2d[i][j]);


          }
              

      }

      //1 row = 100, 0, 0
      //2 row = 0, 0, 100
      //[[100, 0, 0], [0, 0, 100]]
      int[][] arr2d2 = new int[][] {{100, 0, 0}, {0, 0, 100}};
      //print 2d array
      System.out.println(Arrays.deepToString(arr2d2));


      //exercise, find the max value for each row, and then put it into a new int array
      int[][] arr2d3 = new int[][] {{100, 7, 9},{101,-9,100}};
      int[] arr3 = new int[arr2d3.length];

      int max = Integer.MIN_VALUE;

      for( int i = 0 ; i < arr2d3.length ; i++ ){
          
          for( int j = 0 ; j < arr2d3[i].length ; j++ ){

              if (arr2d3[i][j] > max){
                max = arr2d3[i][j];
              }

         }

          arr3[i] = max;

        }
      
        System.out.println(Arrays.toString(arr3));

        /* answer from vincent
         * int idx = 0;
         * int max = Integer.MIN_VALUE
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         */








              

  }//end main
  
}//end class
