public class Code3190{


    public static int balancedStringSplit(String s) {
        
        //int default is 0
        //int numberOfR = 0, iCount = 0, balance = 0;
        //寫法一樣, 一次過 declare
        int numberOfR = 0;  
        int numberOfL = 0;
        int balanced = 0;

        for( int i = 0 ; i < s.length() ; i++ ) {
            if('R' == s.charAt(i)) {
                numberOfR++;
            }else
                numberOfL++;

            if(numberOfR == numberOfL) {
                //balanced string
                balanced++;
                //reset numberOfR and numberOfL to 0
                numberOfR = 0;
                numberOfL = 0;
            }


        }
        return balanced;

    }



    public static void main(String[] args){

        String s = "RRLLRLRLRRRLLL";

        System.out.println(balancedStringSplit(s));//4




    }


}