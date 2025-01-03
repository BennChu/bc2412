public class Code1672 {
  

  public static void main(String[] args){

      //Leetcode 1672. Richest Customer Wealth
      int[][] accounts = new int[][]{{2,8,7},{7,1,3},{1,9,5}};

      int richest = 0;
      int sum = 0;

      for( int i = 0 ; i < accounts.length ; i++ ){

              sum = 0;

              for( int j = 0 ; j < accounts[i].length ; j++ ){

                  sum = sum + accounts[i][j];

              }

              richest = Math.max(richest, sum);

      }

      System.out.println(richest);

      
      //try find how much money in each bank
      //sum up each column
      for( int i = 0 ; i < accounts.length ; i++ ){

        sum = 0;

        for( int j = 0 ; j < accounts[i].length ; j++ ){

            sum = sum + accounts[j][i];

        }

        richest = Math.max(richest, sum);

      }

      System.out.println(richest);


  



      
  }

}
