import java.util.Scanner;

public class DemoForLoop {

  public static void main(String[] args){

    // 2^100
    int x = 2;
    x = x * 2;
    x *= 2;
    System.out.println(x);

    // For loop
    // for ( initilization 行一次 ; (condition) ask question when to stop ; modification)
    // "i<3" -> continue criteria
    // "i++" -> modifier
    // you have to let the modifier work with "continue criteria"
    // so that continue crtieria at the end become false
    // Step 1: int i =0
    // Step 2: i < 3, asking question
    // Step 3: if true, enter into code block print hello
    // Step 4: i++, i become 1
    // Step 5: go back to question is i < 3?? if true
    // Step 6: if true, print hello
    // Step 7: i++, i become 2
    // Step 8: ask question is i < 3
    // Step 9: if true, print Hello
    // Step 10: i++, i become 3
    // Step 11: ask question is 1 < 3
    // Step 12: exit for loop
    for(int i =0; i < 3; i++ ){  // always start with i=0 not i = 1; <3 not <=3, loop 3times (3-0)

      System.out.println("when i = "+ i);
      System.out.println("Hello");

    } // end loop print hello


   // for loop printing letters
   String s = "hello";
 
    for(int i = 0; i < s.length(); i++){

      System.out.println(s.charAt(i));

    } // end loop printing letters


    // print star
    for (int i2 = 0; i2 < 4 ; i2++){

      System.out.println("*************************");
    }

    // print even nubmers
    for( int i = 0; i < 10; i++ ){

      if( i % 2 == 0){
        System.out.println(i);
      }

    } // end loop print even numbers


    // print 0 - 100, can be divided by 3 and divided by 4
    // for + if
    for( int i = 0; i < 101; i++){

      if( i % 3 == 0 && i % 4 == 0 ){

        System.out.println(i);
        
      }

    } // end loop


      // sum up 0-20
      int sum = 0;
      for(int i =0; i < 21; i++){

          sum += i;
          System.out.println(sum);

      } // end loop
      System.out.println("sum of 0 - 20 is " + sum);
      // System.out.println(i) cannot // i is declared within the for loop


      //print star
      /*
      String space = "     ";
      String star = "*";

      for (i = 0; i < 5; i++){

        System.out.println( space + star);
        space = space - ' ';
        star = star + '*';
      }
        */


      // sum up all odd number between 0-10
      // sum up all even number between 0-10
      // find the difference between evenSum and oddSum -> positive number


      int oddSum = 0;
      for( int i=0; i<11; i++){

        if (i % 2 != 0){
          oddSum = oddSum + i; // 一句可以唔落 bracket
        }
      }
      System.out.println("odd sum is " + oddSum);

      int evenSum = 0;
      for( int i=0; i<11; i++){

        if (i % 2 == 0){
          evenSum = evenSum + i;
        }
      }
      System.out.println("even sum is " + evenSum);

      // difference
      //int diff = 0;
      // if(evenSum >= oddSum){

      //   diff = evenSum - oddSum;
      //   System.out.println("the difference between oddsum and evensum is " + diff);

      // }else{

      //   diff = oddSum - evenSum;
      //   System.out.println("the difference between oddsum and evensum is " + diff);
      // }

      int diff = oddSum > evenSum? oddSum - evenSum : evenSum - oddSum;









      // Searching
      String str = "abcdefghijk";
      boolean found = false;


      for (int i=0; i < str.length(); i++){

        if( str.charAt(i) == 'd'){
          found = true;
          System.out.println("str contains letter d " + found);
          break; //break the nearest loop
        }

      }// end loop
      //test case
      // 有d
      // 冇d
      // "" empty string
      // abcdefjdfld




      // 2. check if the string value contains given sub-string
      // find "ll" return true

      String substr = "ll";
      String str2 = "Hellolloll";

      found = false;

      //for (int i=0; i < str2.length() - substr.length(); i++)
    
      for(int i = 0 ; i < str2.length() - substr.length() +1 ; i++){

        if(str2.substring(i, i + substr.length()).equals(substr)){

          found = true;

          System.out.println(found);

          break;
          
        }
    
      
      }// end for loop
      // test cases
      //1. llo














    } // end main
  
} // end class
