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


      // counting
      // test case
      // hello 有 l
      // heieieiei  冇 l
      // empty string 要有 ""


      s = "Hello";  
      int count = 0;

      // for loop count how many 'l'
      for( int i = 0; i < s.length() ; i++){ // loop all values + filtering, no break

          if( s.charAt(i)=='l' ){         //s.charAt(i)=='l'    s.substring(i,i++).equals("l")

            count++;

          }
      }
      System.out.println("how many l is " + count);


      // continue - skip the rest, go to next iteration i=1
      count = 0;
      for( int i=0 ; i<s.length(); i++){

        if (s.charAt(i) != 'l'){

          continue; // skip the rest count++, go back to for loop i++
        }
        count++;

      }
      System.out.println(count);



      // 1 - 100, print all numbers, which can be divided by 3 and 4
      // if ( i % 3 == 0 && i % 4 != 0    // event 1)
      //      || i % 4 == 0 && i % 3 != 0 // event 2
      //      || i % 3 != 0 && i % 4 != 0 // enent 3
      // use continue
      for ( int i=1 ; i < 101 ; i++ ){

        if( i % 3 != 0 || i % 4 != 0 ){

          continue;
        }

        System.out.print(i + " ");
      }

      System.out.println();



      // nested loop
      for( int i=0 ; i<3 ; i++){
        for( int j=0 ; j<4 ; j++){

          System.out.print("*");
        }

          System.out.println();
      }

      //Step 5: i = 1, j = 0, print *
      //Step 6: i = 1, j = 1, print *
      //Step 7: i = 1, j = 2, print *
      //Step 8: i = 1, j = 3, print *
      
      //Step 9: i = 2, j = 0, print *
      //Step 10: i = 2, j = 1, print *
      //Step 11: i = 2, j = 2, print *
      //Step 12: i = 2, j = 3, print *

      //Step 13: i = 3, j = 0, print *
      //Step 14: i = 3, j = 1, print *
      //Step 15: i = 3, j = 2, print *
      //Step 16: i = 3, j = 3, print *


      // *                  // 每一行做唔同既事
      // **
      // ***
      // ****
      str = "*";
      for(int i = 0; i < 4; i++){ // outer loop 做轉行

          for( int j = 0 ; j < 4; j++ ){ // inner loop


              System.out.println(str);
              str = str + "*";
              break;

          }

      }

      int n = 6;
      for(int i = 0; i < n; i++){ // outer loop 做轉行

        for( int j = 0 ; j < i+1; j++ ){ // inner loop

            System.out.print("*");
            
        }
        System.out.println();
    }














      //         *
      //        ***
      //       *****
      //      *******
      



































    } // end main
  
} // end class
