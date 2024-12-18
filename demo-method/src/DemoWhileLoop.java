import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class DemoWhileLoop {

  public static boolean isDuplicated( int[] arr, int newValue){

    for( int i = 0 ; i < arr.length ; i++ ){
      if( newValue == arr[i]){
        return true;
      }

    
    }
  return false;
  }

 
  public static void main(String[] args){

    for( int i = 0 ; i < 3 ; i++ ){

      System.out.println(i);
    }

    // while loop vs for loop
    //declare teh counter outside the loop
    //flexible to control the j, 可以 j++, j++, again j++=
    //都可以 break
    int j = 0;
    while( j < 3 ){
      System.out.println(j);
      j++;
    }


    //string "Hello", find target 'e'
    String s = "Hello";
    char target = 'e';
    int whileCount = 0; //count the while loop
    int count = 0; //count the target

    while( whileCount < s.length()){
      if( target == s.charAt(whileCount)){
      count++;
      whileCount++;
      }else
        whileCount++;

    }// end while loop

    System.out.println("this is s count " + count);




    //Random(3), 係 0 - 2
    int number = new Random().nextInt(3);
    System.out.println(number);

    //use Random function to get 1-49 numbers
    int number1 = new Random().nextInt(49) + 1; // (0-48) + 1, 唔要0所以 + 1
    System.out.println(number1);


    //use random() function to generate 6 numbers and not repeat
    int[] marksixArr = new int[6];
    int marksix = 0;
    int value = 0;

    count = 0;

    while( count<marksixArr.length ){ //length = 6, stop at index 5
      value = new Random().nextInt(49) + 1; //會 49 is generate 0 - 48, 唔要0所以 + 1
        if( !isDuplicated(marksixArr, value)){
          marksixArr[count] = value;
          count++;

        }

    }

    System.out.println(Arrays.toString(marksixArr));


    //1-100
    //bomb - 47
    //User: 4, please pick a number between 5 - 100
    //User: 67, Please pick a number between 5 - 66
    //User: 47, 

    int bomb = 0;
    int input = 0;
    int minValue = 1;
    int maxValue = 100;
    Scanner scanner = new Scanner(System.in); //scanner need this
    

    bomb = new Random().nextInt(100) + 1; //100 means bomb will be a number between 0 - 99, so we need to +1

    //System.out.println("Please input a number between 1 - 100: ");
    //input = scanner.nextInt();

    //While(........)
    // 





    while( input != bomb){
      System.out.println("Please input a number between " + minValue + " - " + maxValue);
      input = scanner.nextInt();
      System.out.println();
      
      if(input > minValue && input < maxValue){
        if( input > bomb ){
          maxValue = input - 1;
          //System.out.println("Please input a number between " + minValue + " - " + maxValue);
          //input = scanner.nextInt();
          //System.out.println();
          
        }else{
          minValue = input + 1;
          //System.out.println("Please input a number between " + minValue + " - " + maxValue);
          //input = scanner.nextInt();
          //System.out.println();
        }
      }
    }

    System.out.println("bomb");















    // for( int i = 0 ; i < marksixArr.length ; i++ ){
    //   marksixArr[i] = new Random().nextInt(49) + 1; //49 is 會 generate 0 - 48, 唔要0所以 + 1

    // }




  }

}
