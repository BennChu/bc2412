import java.util.Arrays;

public class DemoArray {
    public static void main(String[] args) {


        // java 目的係形容世界所有野
        // array
        int x = 3;
        int x2 = 10;
        int x3 = 11;

        //declare int array new int[], variable is arr
        //define 左三間屋[3], arr 係array 個 variable store reference address
        int[] arr = new int[3];

        //assign value to array
        //用 [], index 開始係 0 not 1, 長度係係 3, 3間屋
        //arr[0] also is an address
        arr[0] = 3;     
        arr[1] = 10;
        arr[2] = 11;

        //for loop to read array values, array length 係冇 (), 長度係 3
        // i = 0 , 1 , 2
        for (int i = 0; i < arr.length; i++) {  
            System.out.println(arr[i]);//3, 10, 11
        }

        //if we use for each loop
        for (int i : arr) {
            System.out.println(i);//3, 10, 11
        }


        //example, use array, print all values, which >= 10
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 10) {
                System.out.println(arr[i]);//10, 11
            }
        }

        //for each loop
        for (int i : arr) {
            if (i>=10)
                System.out.println(i);//10, 11
        }



        //declare double array, length = 5
        //assign values -> 10.4, 4.3, 3.3, 1.9, 9.9
        //sum up all values in the double array

        // Step 1: declare double array
        double[] arr2 = new double[5];

        // Step 2: assign value to array
        arr2[0] = 10.4;
        arr2[1] = 4.3;
        arr2[2] = 3.3;
        arr2[3] = 1.9;
        arr2[4] = 9.9;

        //
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr2[i];
        }
        System.out.println(sum);



        // "abc", "asdflkajsdfl", "alsdjlkjdflknlkenlk", 'abcdladsjfd", " "

        // declare string array with 5 間屋
        // String[] err3 = new String[5];

        // // assign string to string array
        // err3[0] = "abc";
        // err3[1] = "assdfl";
        // err3[2] = "alsdjlclkenlk";
        // err3[3] = "abcdladsjfdakjdfabbc";
        // err3[4] = " ";

        // // use for loop to find target string 'abc'
        // String target = "abc";
        // boolean find = false;
        // for( int i=0 ; i<err3.length ; i++ ){


        // if( target.equals(err3[i])){
        // find = true;
        // System.out.println(find);
        // System.out.println(err3[i]);
        // }
        // }



// *******************************************************************************************//

        // 第二個方法, declare 三間屋的 char array, 名係 arr4
        char[] arr4 = new char[] {'b', 'c', 'a'}; // 同呢個一樣
                                                  // char[] arr4 = new char[]
                                                  // arr4[0] = 'b'
                                                  // arr4[1] = 'c'
                                                  // arr4[2] = 'a'

        // convert char value to int value, and then assign them to a new int array
        // answer should return 98, 99, 97

        // declare a new int array 要有三間屋, 可以用 char arr4 既長度做 int array 既長度
        int arr5[] = new int[arr4.length];

        // use for loop to convert value and assign them to int array
        // 好多時 for loop 都用 i, j, k 所以出面唔用 i j k
        for (int i = 0; i < arr4.length; i++) {
            //char value -> int variable (upcasting)
            arr5[i] = arr4[i]; 
            System.out.println(arr5[i]);//98 b, 99 c, 97 a
        }



        // find the max value in the int array

        // declare a variable for storing max value
        //唔應該用0, 用 Integer.MIN_VALUE, integer 最細既數
        int max = 0;    

        // use for loop to compare each value in err5[] array to max value
        // array length 三間屋, length 係 3
        // arr5 length 係3, i 要幾時停? index 要2停, 因為下面有 i+1, 所以 3 - 1 = 2
        for (int i = 0; i < arr5.length - 1; i++) {
            if (arr5[i] <= arr5[i + 1]) {
                max = arr5[i + 1];
            } else
                max = arr5[i];
        }
        System.out.println("the max value in array is " + max);



        // **************************** */
        // find the min value in the array

        int[] arr6 = new int[] {-100, 9, -8, -200, -99, -98, -300};
        
        //int min = Integer.MAX_VALUE; int max value
        //find min value, 所以一開始搵最大比較去搵細
        int min = arr6[0]; 

        //use for loop to compare each value in an array to find min value
        for (int i = 0; i < arr6.length - 1; i++) {
            if (arr6[i + 1] <= min) {
                min = arr6[i + 1];
            }
        }
        System.out.println("the min value in array is " + min);


        arr6 = new int[] {300, 9, -8, -99, 400, -98, 100, 200};

        //int max = Integer.MIN_VALUE is better
        //搵最大, 一開始用最細去做比較
        max = arr6[0]; 

        //use for loop to compare each value in an array to find max value
        for (int i = 0; i < arr6.length - 1; i++) {
            if (max <= arr6[i + 1]) {
                max = arr6[i + 1];
            }
        }
        System.out.println("the max value in array is " + max);


        // array sum
        int[] arr66 = new int[] {9, 8, 99, 98};
        sum = 0;

        for (int i = 0; i < arr66.length; i++) {
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


        //array
        int[] arr8 = new int[] {9, -8, 109, 99, 98};

        // print 1 (9 + -8)
        // print 2 ( 109 + -8)
        // print ( 99 + 109)
        // print (98 + 99)
        int sum1 = 0; // for temp storing
        for (int i = 0; i < arr8.length - 1; i++) {
            //arr8[arr8.length]
            sum1 = arr8[i] + arr8[i + 1]; 
            // System.out.println(arr8[i] + arr8[i+1])
            System.out.println(sum1); 
        }


        //***************important******************* */
        //array swap
        //move max value to the tail
        //for loop + swap
        int[] arr7 = new int[] {9, -8, 109, 99, 98};

        //for temp storing
        int temp = 0; 

        for (int i = 0; i < arr7.length - 1; i++) {
            if (arr7[i] > arr7[i + 1]) {
                temp = arr7[i];
                arr7[i] = arr7[i + 1];
                arr7[i + 1] = temp;
            }
            // System.out.println(arr7[i]);
        }

        // for( int i = 0 ; i < arr7.length ; i++ ){
        // System.out.println(arr7[i]);
        // }

        // System.out.println(Arrays.toString(arr7));

        // should return (x, x, x, 109)


        //Integer 係大楷, 係 object, Integer[] 係 object array
        Integer[] arr11 = new Integer[] {9, 6, 4};

        // Product of all numbers
        int product = 1;
        for (int i = 0; i < arr11.length; i++) {
            product *= arr11[i];
        }
        System.out.println(product);


        double[] prices = new double[] {8.2, 6.5, 10.5};
        int[] quantities = new int[] {9, 8, 3};
        double totalAmount = 0;
        // 8.2 * 9, 6.5 * 8, 10.5 * 3
        for (int i = 0; i < prices.length; i++) {
            totalAmount = totalAmount + prices[i] * quantities[i];
        }
        System.out.println(totalAmount);


        //valueOf 將 123 變 string 形態
        //String is a class, has method
        String s = String.valueOf(123);//int form to String form
        System.out.println(s);//123
        s = String.valueOf(true);
        System.out.println(s);//true

        String s1 = Integer.toString(123);
        System.out.println(s1);//123

        //below has a method String.valueOf(char, offset, count);

        //Integer is a class, has method
        //no new, is not creating an object
        //string type turn value int form
        Integer i1 = Integer.valueOf("123"); 
        System.out.println(i1 + " int type");

        //testing
        x=0;
        int y=0;

        y = 0 + Integer.valueOf("1");






        //做大工程, swap
        // Integer i2 = Integer.valueOf("h") // cannot, h is char cannot assign to Integer

        //"Hello" is a string, string class has method
        //toCharArray(), 其實都係 for loop
        // "Hello" -> 'h' 'e' 'l' 'l' 'o'
        char[] chArr = "Hello".toCharArray();
        System.out.println(chArr[0]);
        System.out.println(chArr[1]);
        System.out.println(chArr[2]);
        System.out.println(chArr[3]);

        System.out.println("String.valueOf " + String.valueOf(chArr, 1, 2));//el

        //olleh
        //swaping
        //char default is '\u0000'
        //唔 initialization 都冇問題
        char temp1;

        for (int i = 0; i < chArr.length / 2; i++) {
            temp1 = chArr[i];
            chArr[i] = chArr[chArr.length - 1 - i];
            chArr[chArr.length - 1 - i] = temp1;
        }

        //String 要 initialized
        String result = "";
        for (int i = 0; i < chArr.length; i++) {
            result = result + chArr[i];
        }

        System.out.println(result);


        // h -> i, e -> f, l -> m, o -> p
        // ifmmp
        // like encryption, 叫 mask

        chArr = "hello".toCharArray();
        for (int i = 0; i < chArr.length; i++) {

            //強行轉 char
            chArr[i] = (char) (chArr[i] + 1);
        }
        System.out.println(String.valueOf(chArr)); // "ifmmp", char Array -> String



        // 因為英文字母只有 26 個, 所以 create int[26]
        
        char maxNumChar = ' ';
        char[] arr12 = new char[] {'p', 'a', 'p', 'b', 'a', 'p'};
        
        //declare int array with 26 houses, each house for each letter for counting
        int[] counters = new int[26]; // int default value is 0
        
        for( int i = 0 ; i < arr12.length ; i++ ){
            //用一個位比佢減
            //因為 a-a = 0, 會放係 counters[0] 位置
            //b-a = 1, 會放係 counters[1] 位置
            //then counters[0] + 1
            counters[arr12[i] - 'a']++;
        }
        int max2 = Integer.MIN_VALUE;
        for( int i = 0 ; i < counters.length ; i++){
            //max2 = Math.max(counters[i], max2);
            if( counters[i] > max2 ){
                maxNumChar = (char) (i + 97); // force convert to char, a = 97
                max2 = counters[i];
            }
        
        }
        System.out.println(maxNumChar);





        // int[] arr13 = new int[arr12.length];

        // //
        // for (int j = 0; j < arr13.length; j++) {
        //     for (int i = j; i < arr12.length; i++) {
        //         if (arr12[i] == arr12[j]) {
        //             arr13[j]++;
        //         }

        //     }

        // }

        // // find the max value and put to last index
        // // at the same time, put the corresponding char to the last index
        // char charTemp = ' ';
        // for (int i = 0; i < arr13.length - 2; i++) {
        //     if (arr13[i + 1] < arr13[i]) {
        //         temp = arr13[i];
        //         arr13[i] = arr13[i + 1];
        //         arr13[i + 1] = temp;

        //         charTemp = arr12[i];
        //         arr12[i] = arr12[i + 1];
        //         arr12[i + 1] = charTemp;

        //     }


        // }
        // // System.out.println(arr13[1]);
        // // System.out.println(arr13[2]);
        // // System.out.println(arr13[3]);
        // System.out.println(arr12[arr12.length - 1]);

        // // System.out.println(maxNumChar); // p


        // int[] arr14 = new int[3];
        // System.out.println(arr14[0]);


        //sorting, without create a new array
        //20, -20, 90, 50
        //move the max value to tail
        //bubble sort, 有java method
        int[] arr20 = new int[] {20, -20, 90, 50, -40};

        temp = 0;  

            for (int i = 0; i < arr20.length-1; i++) { 
            
                //arr20 length is 5, 做 4次 sorting, 下面有 j+1, 要 =4, 所以 j=3 就要停
                //i = 0; j = 0, 1, 2, 3
                //i = 3; j = 0
                for( int j = 0 ; j < arr20.length-1-i ; j++ ){ 

                    if (arr20[j] > arr20[j + 1]) {
                    temp = arr20[j];
                    arr20[j] = arr20[j + 1];
                    arr20[j + 1] = temp;
                    }
                }
            }
            System.out.println(Arrays.toString(arr20)); //print array
    }
}