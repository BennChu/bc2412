import java.util.Arrays;
import java.util.Scanner;

/**
 * Input a Index Position: 3
 * Input a new Value: 120
 * Original Array : [25, 14, 56, 15, 36, 56, 77, 18, 29, 49]
 * New Array: [25, 14, 56, 120, 15, 36, 56, 77, 18, 29]
 */
// Insert an elements into a specific position of the array
// The original last element should be removed accordingly
// if the specified position is the last index, return the original array
public class JavaQuest10 {

  public static void main(String[] args) {

    int[] my_array = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };
              //index   0,  1,  2,  3,  4,  5,  6,  7,  8,  9
              //my_array length is 10
    int[] newArr = new int[my_array.length];

    Scanner input = new Scanner(System.in);


    System.out.print("Input an index for inserting the value: ");
    int indexPosition = input.nextInt();

    System.out.print("Input the value: ");
    int newValue = input.nextInt();

    System.out.println("Original Array : " + Arrays.toString(my_array));

    // code here ...
    int count = 0;
    if( indexPosition != my_array.length-1 ){
        
        for(int i = 0 ; i < indexPosition ; i++ ){    //assign value to new array for index smaller than indexposition
            newArr[i] = my_array[i];
        }
      
        newArr[indexPosition] = newValue;   //assign new value to new array in index position
      
        while(my_array.length-indexPosition-1 > count){
            newArr[indexPosition+count+1] = my_array[indexPosition+count];
            count++;
        }


    }else newArr = my_array;

    // my_array = newArr;
    System.out.println("New Array: " + Arrays.toString(newArr));
  }
}