public class DemoArray {
    public static void main(String[] args) {

    // java 目的係形容世界所有野
    // array 
        int x = 3;
        int x2 = 10;
        int x3 = 11;

    // declare int array 
    int[] arr = new int [3]; // define 左三間屋
    
    // assign value to array
    arr[0] = 3;              // 用 [], 開始係 0  not 1 但係 define 時係 3
    arr[1] = 10;
    arr[2] = 11;

    // for loop to read array values
    for( int i=0 ; i < arr.length ; i++){ // i = 0 , 1 , 2

        System.out.println(arr[i]);
    }


    // use array, print all values, which >= 10
    for( int i = 0 ; i < arr.length ; i++ ){

        if( arr[i] >= 10 ){

            System.out.println(arr[i]);

        }
    }



    // declare double array, length = 5
    // assign values -> 10.4, 4.3, 3.3, 1.9, 9.9
    // sum up all values in the double array

    // Step 1: declare double array
    double[] arr2 = new double [5];

    // Step 2: assign value to array
    arr2[0] = 10.4;
    arr2[1] = 4.3;
    arr2[2] = 3.3;
    arr2[3] = 1.9;
    arr2[4] = 9.9;

    //
    double sum = 0;
    for( int i = 0; i < arr.length; i++){

        sum = sum + arr2[i];
    }
    System.out.println(sum);


    // "abc", "asdflkajsdfl", "alsdjlkjdflknlkenlk", 'abcdladsjfd", "        "
    
    // declare string array with 5 間屋
    String[] err3 = new String[5];

    // // assign string to string array
    // err3[0] = "abc";
    // err3[1] = "assdfl";
    // err3[2] = "alsdjlclkenlk";
    // err3[3] = "abcdladsjfdakjdfabbc";
    // err3[4] = "        ";

    // // use for loop to find target string 'abc'
    // String target = "abc";
    // boolean find = false;
    // for( int i=0 ; i<err3.length ; i++ ){

 
    //     if( target.equals(err3[i])){
    //         find = true;
    //         System.out.println(find);
    //         System.out.println(err3[i]);
    //     }
    // }





//*******************************************************************************************//

    // declare 三間屋的 char array
    char[] arr4 = new char[] {'b', 'c', 'a'};        //同呢個一樣
                                                     // char[] arr4 = new char[]
                                                     //arr4[0] = 'b'
                                                     //arr4[1] = 'c'
                                                     //arr4[2] = 'a'

    // convert char value to int value, and then assign them to a new int array
    // answer should return 98, 99, 97

    // declare a new int array 要有三間屋, 可以用 char arr4 既長度做 int array 既長度
    int arr5[] = new int[arr4.length];

    // use for loop to convert value and assign them to int array
    // 好多時 for loop 都用 i, j, k 所以出面唔用 i j k
    for( int i = 0; i < arr4.length; i++ ){  
        arr5[i] = arr4[i];                  // char value -> int variable (upcasting)
        System.out.println(arr5[i]);
    }





    //*************************************************************************************** */
    // find the max value in the int array

    // declare a variable for storing max value
    int max = 0;

    //use for loop to compare each value in err5[] array to max value
    // array length 三間屋, length 係 3
    for( int i = 0 ; i < arr5.length-1 ; i++ ){
        if( arr5[i] <= arr5[i + 1] ){
            max = arr5[i+1];
        }else 
            max = arr5[i];
    }
    System.out.println("the max value in array is " + max);

    //test cases
    // 






    //****************************************************************************************** */
    // find the min value in the array
    // 9,-8,-99,-98

    int[] arr6 = new int[] {-100, 9, -8,-200, -99, -98, -300};
    int min = arr6[0];

    //use for loop to compare each value in an array to find min value
    for( int i = 0 ; i < arr6.length-1 ; i++ ){
        if( arr6[i + 1] <= min ){
            min = arr6[i+1];
        }
    }
    System.out.println("the min value in array is " + min);


    arr6 = new int[] {300, 9, -8, -99, 400, -98, 100, 200};
    max = arr6[0];

    //use for loop to compare each value in an array to find max value
    for( int i = 0 ; i < arr6.length-1 ; i++ ){
        if( max <= arr6[i+1]){
            max = arr6[i+1];
        }
    }
    System.out.println("the max value in array is " + max);















    }
}
