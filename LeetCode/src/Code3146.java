public class Code3146 {

    public int findPermutationDifference(String s, String t) {
        

        //permutation difference between 2 strings
        /*s1.indexOf('e'), use string.indexOf() function

        int value = 0;             for storing the index of the matched letter
        int index = 0;             for storing the sum value
        char c = ' ';              for storing the char in "String s"
        for( int i = 0 ; i < s.length() ; i++ ){

            c = s.charAt(i);
            index = t.indexOf(c);
            value += Math.abs(i-c);     value += Math.abs(i- t.indexOf(s.charAt(i)));

        }

      */

        int total = 0;

        for( int i = 0 ; i < s.length() ; i++ ){

            for( int j = 0 ; j < t.length() ; j++ ){

                    if(s.charAt(i) == t.charAt(j)){
                        total = total + Math.abs(i-j);

                    }
            }

        }
        return total;
    }

    public static void main(String[] args){


      
    }



}












}
