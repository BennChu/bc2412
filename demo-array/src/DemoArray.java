public class DemoArray {
    public static void main(String[] args) {


    // java 目的係形容世界所有野
    // array 
        int x = 3;
        int x2 = 10;
        int x3 = 11;

    // declare int array new int [], define 左三間屋 [3], arr 係array 個名
    int[] arr = new int [3];
    
    // assign value to array
    arr[0] = 3;              // 用 [], 開始係 0  not 1 但係 define 時係 3
    arr[1] = 10;
    arr[2] = 11;

    // for loop to read array values, array length 係冇 (), 長度係 3
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
    // String[] err3 = new String[5];

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

    int[] arr6 = new int[] {-100, 9, -8,-200, -99, -98, -300};
    int min = arr6[0]; // int min = Integer.MAX_VALUE;  int max value

    //use for loop to compare each value in an array to find min value
    for( int i = 0 ; i < arr6.length-1 ; i++ ){
        if( arr6[i + 1] <= min ){
            min = arr6[i+1];
        }
    }
    System.out.println("the min value in array is " + min);


    arr6 = new int[] {300, 9, -8, -99, 400, -98, 100, 200};
    max = arr6[0]; // int max = Integer.MIN_VALUE

    //use for loop to compare each value in an array to find max value
    for( int i = 0 ; i < arr6.length-1 ; i++ ){
        if( max <= arr6[i+1]){
            max = arr6[i+1];
        }
    }
    System.out.println("the max value in array is " + max);


    //array sum
    int[] arr66 = new int[] {9,8,99,98};
    sum = 0;

    for( int i = 0 ; i < arr66.length ; i++){
        sum = sum + arr6[i];
    }

    System.out.println(sum);

    //swap
    int left = 7;
    int right = 9;

    int middle = left;
    left = right;
    right = middle;

    System.out.println("left" + left + "," + "right" + right);


    // array
    int[] arr8 = new int[] {9, -8, 109, 99, 98};
    
    // print 1 (9 + -8)
    // print 2 ( 109 + -8)
    // print ( 99 + 109)
    // print (98 + 99)
    int sum1 = 0; // for temp storing
    for( int i = 0 ; i < arr8.length-1 ; i++ ){
        sum1 = arr8[i] + arr8[i+1];         // arr8[arr8.length]
        System.out.println(sum1);           // System.out.println( arr8[i] + arr8[i+1] )
    }





//****************************************************************************** */
    // array swap
    // move max value to the tail
    // for loop + sway
    int[] arr7 = new int[] {9, -8, 109, 99, 98};

    int temp = 0; // for temp storing

    for( int i = 0 ; i < arr7.length-1 ; i++ ){
        if( arr7[i] > arr7[i+1]){
            temp = arr7[i];
            arr7[i] = arr7[i+1];
            arr7[i+1] = temp;
        }
    //System.out.println(arr7[i]);
    }

    // for( int i = 0 ; i < arr7.length ; i++ ){
    //     System.out.println(arr7[i]);
    // }

    //System.out.println(Arrays.toString(arr7));

    // should return (x, x, x, 109)



    Integer[] arr11 = new Integer[] {9, 6 ,4};

    //Product of all numbers
    int product = 1;
    for( int i = 0 ; i < arr11.length ; i++ ){
        product *= arr11[i];
    }
    System.out.println(product);


    double[] prices = new double[] {8.2, 6.5, 10.5};
    int[] quantities = new int[] {9, 8, 3};
    double totalAmount = 0;
    // 8.2 * 9, 6.5 * 8, 10.5 * 3
    for( int i = 0 ; i < prices.length ; i++ ){
        totalAmount = totalAmount + prices[i] * quantities[i];
    }
    System.out.println(totalAmount);





    String s = String.valueOf(123); // valueOf 將 123 變 string 形態
    System.out.println(s);
    s = String.valueOf(true);
    System.out.println(s);

    Integer i1 = Integer.valueOf("123");
    System.out.println(i1);

    //Integer i2 = Integer.valueOf("h") // cannot, h is char cannot assign to Integer 

    //"Hello" -> 'h' 'e' 'l' 'l' 'o'
    char[] chArr = "Hello".toCharArray();
    System.out.println(chArr[0]);
    System.out.println(chArr[1]);
    System.out.println(chArr[2]);
    System.out.println(chArr[3]);

    //olleh
    //swap
    char temp1 = ' ';
    
        for( int i = 0 ; i < chArr.length /2 ; i++ ){
            temp1 = chArr[i];
            chArr[i] = chArr[chArr.length-1-i];
            chArr[chArr.length-1-i] = temp1;
        }
    
    String result = "";
    for( int i = 0 ; i < chArr.length ; i++ ){
        result = result + chArr[i];
    }

    System.out.println(result);


    //h -> i, e -> f, l -> m, o -> p
    //ifmmp
    //like encryption, 叫 mask
    
    chArr = "hello".toCharArray();
    for( int i = 0 ; i < chArr.length ; i++ ){

        chArr[i] = (char) (chArr[i] + 1);
    }
    System.out.println(String.valueOf(chArr)); //"ifmmp", char Array -> String


    //**************************************************** */

    char[] arr12 = new char[] {'p', 'a', 'p', 'b', 'a', 'p'};;

    int[] arr13 = new int[arr12.length];
    
    //
    for( int j = 0; j < arr13.length ; j++ )
    {
        for( int i = j ; i < arr12.length ; i++ ){
            if(arr12[i] == arr12[j]){
                arr13[j]++;
            }
        
        }

    }

    //find the max value and put to last index
    //at the same time, put the corresponding char to the last index
    char charTemp = ' ';
    for( int i = 0 ; i < arr13.length-2 ; i++){
        if(arr13[i+1] < arr13[i]){
            temp = arr13[i];
            arr13[i] = arr13[i+1];
            arr13[i+1] = temp;

            charTemp = arr12[i];
            arr12[i] = arr12[i+1];
            arr12[i+1] = charTemp;

        }


    }
    //System.out.println(arr13[1]);
    //System.out.println(arr13[2]);
    //System.out.println(arr13[3]);
    System.out.println(arr12[arr12.length -1]);


    //more than 1 loop
    //System.out.println(maxNumChar); // p


    }
}
