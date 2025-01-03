public class DemoForEachLoop {

    public static void main(String[] args) {

        //same
        //int[] arr;
        //new = int[] {3,4,5}
        int[] arr = new int[] {3,4,5};
        

        //for loop 可以同一 round get 2 values, [i]+[i+1]
        //for each loop cannot
        for( int i = 0 ; i < arr.length ; i++ ){
            System.out.println(arr[i]);
        }

        //3+4
        //4+5
        for( int i = 0 ; i < arr.length-1 ; i++ ){
          System.out.println(arr[i]+arr[i+1]);
        }
        
        
        //for each loop, 同 for loop 唔一樣
        //安全, 簡單 
        //for loop 都做到同樣 function but for loop 多D變數
        //要用岩既功具, 唔係用最勁功具做簡單野
        //3個數字行3次
        //just get one value for each iteration
        //left side is declaration type + i 
        //rigth side is must be array, like for loop
        for(int integer : arr){
            System.out.println(integer);
        }

        //use for each loop, char to string -> pte
        //c is like declaration
        char[] arr2 = new char[] {'p','t','e'};
        String str = "";

        for(char c : arr2){
            str += c;
        }
        System.out.println(str);


        //check target, use for each loop
        String[] arr3 = new String[] {"abc", "ijk", "def"};
        String target = "ijk";
        boolean find = false;

        for(String s : arr3){

            if(s.equals("ijk"))
                find = true;

        }
        System.out.println(find);







    }//main
  
}//class
