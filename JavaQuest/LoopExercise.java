import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.function.BiFunction;

public class LoopExercise {

  public static void main(String[] args) {
    // 1. Print 6 times hello
    // Use: for loop
    System.out.println("1. Print 6 times hello");
    for(int i = 0 ; i < 6 ; i++) {
      System.out.println("Hello");
    }
    //for new line
    System.out.println();


    // 2. Expected output: "0,1,2,3,4"
    // Use: for loop
    System.out.println("2. Expected output: 0,1,2,3,4");
    for( int i = 0 ; i < 5 ; i++ ) {
        if(i != 4)
          System.out.print(i + ",");
        else
          System.out.print(i);
    }
    //for new line
    System.out.println(); 



    // 3. Print even numbers between 2 and 20
    // Use: for loop + if
    System.out.println();
    System.out.println("3. Print even numbers between 2 and 20");
    for( int i = 2 ; i < 21 ; i++ ) {
        if(i % 2 == 0){
          System.out.println(i);
        }
    }









    // 4. Print the numbers, which can be divided by 3 or 5
    // Use: for loop + if
    System.out.println();
    System.out.println("4. Print the numbers, which can be divided by 3 or 5");
    for( int i = 2 ; i < 21 ; i++ ) {

        if(i % 3 == 0 || i % 5 == 0) {
          System.out.println(i);
        }
    }










    // 5. Sum up the numbers between 0 and 15 and print it
    // Use: for loop
    System.out.println();
    System.out.println("5. Sum up the numbers between 0 and 15 and print it");
    int sum = 0;
    for( int i = 0 ; i < 16 ; i++ ){
        sum = sum + i;
    }
    System.out.println(sum);








    // 6. sum up all odd numbers betwen 0 - 10
    // Sum up all even numbers betwen 0 - 10
    // Find the product of evenSum and oddSum
    // Use: for loop + if
    System.out.println();
    System.out.println("6. sum up all odd numbers and even numbers between 0 - 10 and find the product of them");
    //int default is 0
    int odd = 0;
    int even = 0;
    for( int i = 0 ; i < 11 ; i++ ) {
      if( i % 2 == 0) {
        even = even + i;
      }else
        odd = odd + i;
    }
    //int * int, no need BigDecimal
    System.out.println(even * odd);







    // 7. Check if 'd' exists in the string.
    // print "d is found."
    // otherwise, print "d is not found."
    System.out.println();
    System.out.println("7. Check if 'd' exists in the string.");
    String str7 = "ijkabcpodi";
    //boolean default is false
    boolean find = false;

    for( int i = 0 ; i < str7.length() ; i ++ ) {
        if( 'd' == str7.charAt(i)){
          find = true;
          break;
        }  
    }
    if(find)
      System.out.println("d is found");
    else
      System.out.println("d is not found");














    // 8. Check if the string s8b is a substring of s8a
    // print "s8b is a substring."
    // otherwise, print "s8b is not a substring."
    // Use: for loop + if + substring method
    String s8a = "abcba";
    String s8b = "cba";
    boolean found = false;

    System.out.println();
    System.out.println("8. Check if the string s8b is a substring of s8a");

    //for testing System.out.print(s8a.substring(0));
    for( int i = 0 ; i < s8a.length() - s8b.length() +1 ; i++ ) {
        //string 要用 equals
        //i 係 beginning index, s8b.length() 係 ending index
        if(s8a.substring(i, i + s8b.length()).equals(s8b)) {
        found = true;
        break;
        }
    }

    if(found)
    System.out.println("s8b is a substring");
    else
    System.out.println("s8b is not a substring");






    // 9. Count the number of char value in the given String s9
    // print "count=2"
    // Use: for loop + if
    String s9 = "pampers";
    char c9 = 'p';
    int count = 0;

    System.out.println();
    System.out.println("9. Count the number of char value in the given String s9");

    for( int i = 0 ; i < s9.length() ; i++ ) {
        if( c9 == s9.charAt(i)){
          count++;
        }

    }
    System.out.println("count = " + count);




    // 10. Replace all char value 'x' in the given String array by 'k'
    // Print arr10: ["akc", "kkk", "k", "kbk", "mkk"]
    // Use: for loop + replace method
    String[] arr10 = new String[] {"akc", "xxx", "x", "xbx", "mkx"};

    System.out.println();
    System.out.println("10. Replace all char value 'x' in the given String array by 'k'");

    // testing System.out.println( "akc".replace( 'k', 'x'));
    
    for( int i = 0 ; i < arr10.length ; i++ ) {
         
         //string has a method replace, it returns a string
         //replace x oldChar with k newChar
         System.out.println( arr10[i].replace('x', 'k') );

    }








    // 11. Count the number of Uppercase char value in the given string s11
    // Print "count uppercase=4"
    // Use: for loop + if
    String s11 = "kLKloOOu";

    System.out.println();
    System.out.println("11. Count the number of Uppercase char value in the given string s11");

    //char int relationship
    int asciiA = 'A';
    int asciiZ = 'Z';
    count = 0;

    // System.out.print(Integer.valueOf(s11.charAt(0)));
    // System.out.print(asciiA);
    for( int i = 0 ; i < s11.length() ; i++ ) {

        //uppercase should between A <= i <= Z
        //Integer class has a method valueOf
        if( Integer.valueOf(s11.charAt(i)) >= asciiA && Integer.valueOf(s11.charAt(i)) <= asciiZ )
          count++;
    }

    System.out.println("count uppercase = " + count );









    // 12. Print the following pattern of * value
    // *****
    // *****
    // *****
    System.out.println();
    System.out.println("12. Print the following pattern of * value");

    int numOfRow = 3;
    int numOfStar = 5;

    for( int i = 0 ; i < numOfRow ; i++ ) {
      for( int j = 0 ; j < numOfStar ; j++ ) {
        System.out.print("*");
      }
    System.out.println();
    }







    // 13. Given a string value s13, each of the char value has its score.
    // Calculate the total score
    // Use: switch + for loop

    // l -> 1 score
    // r -> 3 score
    // d -> 2 score
    // u -> 4 score
    // for other character, -1 score
    String s13 = "lrlaudbucp";

    System.out.println();
    System.out.println("13. Given a string value s13, each of the char value has its score.");

    int x = 0;
    int score = 0;
    for( int i = 0 ; i < s13.length() ; i++ ) {
        if( s13.charAt(i) == 'l' ) {
          x = 1;
          //System.out.println('l');
        }else if( s13.charAt(i) == 'd' ) {
          x = 2;
          //System.out.println('d');
        }else if( s13.charAt(i) == 'r' ) {
          x = 3;
          //System.out.println('r');
        }else if( s13.charAt(i) == 'u' ) {
          x = 4;
          //System.out.println('u');
        }else{
          x = 5;
          //System.out.println("5");
        }  

        switch(x){
          case 1:
            score += 1;
            break;
          case 2:
            score += 2;
            break;
          case 3:
            score += 3;
            break;
          case 4:
            score += 4;
            break;
          default:
            score += -1;
        }

    }    
    System.out.println(score);






    
    // 14. Assign the long values of 1, 4, 9, -4 to the given array arr14
    long[] arr14 = new long[4];

    System.out.println();
    System.out.println("14. Assign the long values of 1, 4, 9, -4 to the given array arr14");

    arr14[0] = 1L;
    arr14[1] = 4L;
    arr14[2] = 9L;
    arr14[3] = -4L;

    System.out.println(Arrays.toString(arr14));






    // 15. Find the max value and min value in arr14
    // Use One Loop + if

    System.out.println();
    System.out.println("15. Find the max value and min value in arr14");

    //find the max and min
    long max1 = Integer.MIN_VALUE;
    long min = Integer.MAX_VALUE;
    for( int i = 0 ; i < arr14.length ; i++ ) {
        // if( arr14[i] > max1 ){
        //     max1 = arr14[i];
        // }else if(arr14[i] < min){
        //     min = arr14[i];
        // }
        if( arr14[i] > max1 ) max1 = arr14[i];

        if(arr14[i] < min ) min = arr14[i];

    }
    System.out.println("the max is = " + max1 );
    System.out.println("the min is = " + min );





    // 16. Declare a float value (arr16) array with value 0.2, 0.3, 0.5
    System.out.println();
    System.out.println("16. Declare a float value (arr16) array with value 0.2, 0.3, 0.6");

    float[] arr16 = new float[] {0.2f, 0.3f, 0.6f};

    System.out.println(Arrays.toString(arr16));







    // 17. Add value 0.1 to each of value in array arr16
    // Print: [0.3, 0.4, 0.7]
    System.out.println();
    System.out.println("17. Add value 0.1 to each of value in array arr16");

    //double temp1;
    double[] temp11 = new double[arr16.length];
    //BigDecimal bd1;
    //BigDecimal bd2 = BigDecimal.valueOf(0.1);
    //BigDecimal bd3;

    //System.out.println("before for loop arr16(2) " + arr16[2]);

    for( int i = 0 ; i < arr16.length ; i++ ){
        
          //temp1 = arr16[i];
          //bd1 = BigDecimal.valueOf(temp1);
          //bd3 = bd1.add(bd2);
          //temp11[i] = bd3.doubleValue();
          //temp11[i] = bd1 + bd2
          temp11[i] = BigDecimal.valueOf((double)arr16[i])
                                // .setScale(1,RoundingMode.HALF_DOWN)
                                // .add(BigDecimal.valueOf(0.1))
                                .doubleValue();

    }
    //return a string of the content of the array
    System.out.println(Arrays.toString(temp11));
    

    // double temp2 = arr16[2];
    // BigDecimal bd4 = BigDecimal.valueOf(0.1);
    // BigDecimal bd5 = BigDecimal.valueOf(temp2);
    // BigDecimal bd6 = bd5.add(bd4);
    // temp1 = bd6.doubleValue();
    // System.out.println(temp1);


    // BigDecimal[] updateArr = new BigDecimal[arr16.length];

    // BigDecimal increment = new BigDecimal("0.1");

    // for( int i = 0 ; i < arr16.length ; i++ ){

    //     BigDecimal value = new BigDecimal(Float.toString(arr16[i]));
    //     updateArr[i] = value.add(increment);
    // }

    // for( int i = 0 ; i < updateArr.length ; i++ ){

    //     System.out.println
    // }








    // 18. Count the number of target strings in the String[]
    String[] arr18 = new String[] {"Steve", "Tommy", "Katie", "Tommy", "Lydia"};
    String target = "Tommy";
    // Print "count name=2"

    System.out.println();
    System.out.println("18. Count the number of target strings in the String[]");
    count = 0;
    for( int i = 0 ; i < arr18.length ; i++ ){

        if( arr18[i].substring(0).equals(target))
          count++;
    }
    System.out.println("count name = " + count);













    // 19. swap the max digit and min digit
    // Assumption: each digit value appear once in the String
    // Print: "49280"
    String s19 = "40289";
    char[] charArr = s19.toCharArray(); //for loop 都做到 toCharArray()





    System.out.println();
    System.out.println("19. swap the max digit and min digit");

    char[] arr19 = new char[s19.length()];
    for( int i = 0 ; i < s19.length() ; i++ ) {
        arr19[i] = s19.charAt(i);
    }

/*
    int minIndex = -1;
    int maxIndex = -1;
    int min19 = Integer.MAX_VALUE;
    int max19 = Integer.MIN_VALUE;

    for( int i = 0 ; i < arr19.length ; i++ ){
        if( arr19[i] > max19){
          max19 = arr19[i];
          maxIndex = i; 
        })
        if( arr19[i] < min19 ){
          min19 = arr19[i]

        }


    })


*/





    char c = '0';
    char d = '9';
    int max2 = c;
    int min2 = d;
    int maxIndex = 0;
    int minIndex = 0;
    char temp = ' ';

    // System.out.println(max);
    // System.out.println(min);
    // System.out.println((s19.charAt(0)));
    // System.out.println(Integer.valueOf(s19.charAt(1)));
    
    //"40289"
    //charAt() return char
    //i=0, 4 > max(0) -> max = 4, maxIndex = 0 -> 4 < min(9) , min index = 0
    //i=1, 0 !> max -> max = 4 maxIndex = 0 -> 0 < min, min = 0, minIndex = 1
    //i=2, 2, 2 !> max 4, max = 4, 2 !< min 0, min=0
    for( int i = 0 ; i < s19.length() ; i++ ){
         if( Integer.valueOf(s19.charAt(i)) >= max2 ){
            max2 = Integer.valueOf(s19.charAt(i));
            maxIndex= i;
         }
                   
          if( Integer.valueOf(s19.charAt(i)) <= min2 ){
            min2 = Integer.valueOf(s19.charAt(i));
            minIndex = i;
          }

    }
    //System.out.println(maxIndex);
    //System.out.println(minIndex);

    temp = charArr[maxIndex];
    charArr[maxIndex] = charArr[minIndex];
    charArr[minIndex] = temp;

    System.out.println(String.valueOf(charArr));









    // 20. Find the longest String in the String array
    // Print "longest=programming"
    String[] arr20 = new String[] {"python", "array", "programming", "java", "bootcamp"};
    int maxLength = Integer.MIN_VALUE;
    maxIndex = 0;

    System.out.println();
    System.out.println("20. Find the longest String in the String array");


    //System.out.println(Arrays.toString(s20));

    for( int i = 0 ; i < arr20.length ; i++ ){
        //maxLength = Math.max(s20[i], maxLength);
        if( arr20[i].length() > maxLength ) {
            maxLength = arr20[i].length();
            maxIndex = i;
        }
    }


    //System.out.println(maxLength);
    //System.out.println(maxIndex);
    System.out.println("longest = " + arr20[maxIndex]);






  }
}
