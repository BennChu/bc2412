public class LeetCode3190{
    public int balancedStringSplit(String s) {
        
        int numberOfR = 0;  // int numberOfR = 0 , iCount = 0 , balance = 0 ; 寫法一樣, 一次過 declare
        int numberOfL = 0;
        int balanced = 0;

        for( int i = 0 ; i < s.length() ; i++ ){
            if( 'R' == s.charAt(i)){
                numberOfR++;
            }else
                numberOfL++;

            if( numberOfR == numberOfL ){
                balanced++;
                numberOfR = 0;
                numberOfL = 0;
            }


        }
        return balanced;

    }



    public static void main(String[] arge){

        String s = "RRLLRLRLRRRLLL";

        int a = balancedStringSplit(s);

        System.out.println(a);




    }


}