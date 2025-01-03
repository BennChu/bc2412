public class Code804 {

    public static void main(String[] args) {

        String[] words = new String[] {"gin","zen","gig","msg"};

        String[] morse = new String[] {".-","-...","-.-.","-..",".",
                                       "..-.","--.","....","..",".---",
                                       "-.-",".-..","--","-.","---",".--.",
                                       "--.-",".-.","...","-","..-","...-",
                                       ".--","-..-","-.--","--.."};

        char[] abc = new char[] {'a','b','c','d','e','f','g','h',
                                 'i','j','k','l','m','n','o','p','q',
                                 'r','s','t','u','v','w','x','y','z'};

        String s = "";
        String[] maps = new String[words.length];

  
        
        for( int i = 0 ; i < words.length ; i++ ){            
            
          s = "";
          for( int j = 0 ; j < words[i].length() ; j++ ){        
                for( int k = 0 ; k < abc.length ; k++ ){
                    //abc[1] = 
                   if(abc[k] == words[i].charAt(j))
                        s = s + morse[k];
                       


                }//for loop


          }

            maps[i] = s;

        }

        // for( String s1 : maps ){
        //   System.out.println(s1);
        // }

        for( int i = 0 ; i < maps[i]; i++ ){
            if( )

        }



    }//main
}//class