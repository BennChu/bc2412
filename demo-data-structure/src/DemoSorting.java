import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DemoSorting {

    public static void main(String[] args) {
        //when we do sorting, we use bubble sort (Nested Loop)
        //take time very long
        //other sorting, selection sort and quick sort

        //collection sort
        //以後用 Collection sort
        //Integer class already implement Comparable
        List<Integer> integers = Arrays.asList(1,3,10,-4,2);
        
        //sort() is a static method inside Collections class
        Collections.sort(integers);//why return void
                                   //suppose you give sth to sort, should return you sorted integer
                                    //then why return void
                                    //because this is pass by reference
        System.out.println(integers);//[-4, 1, 2, 3, 10]

        
        int[] arr = new int[] {10,2,9};
        //無論你點 new , 你都係 pass 地址
        //就算 pass by reference, 都可以冇改因為仲有 setters, private, final
        allZero(arr);
        System.out.println(Arrays.toString(arr));//[0, 0, 0]

        //in java, array always pass by reference
        //17 classes, primitive , wrapper class & String are always pass by value(0 copy of value)
        //pass by reference or pass by value

        //custom Type
        //pass by reference
        Book book = new Book("Sun");
        System.out.println(book);
        changeBookName(book);
        System.out.println(book);

        int a = 3;
        int b = 4;
        sum(a,b);

        System.out.println(sum(a,b));//300, pass the copy of value to the method
        System.out.println(a);//3, but not 100, because we pass by value for primitives, make more sence
        System.out.println(b);//4, but not 200, because we pass by value for primitives, make more sence

        //sort string by Collections.sort(), try other types

        BigDecimal bd1 = BigDecimal.valueOf(10);
        BigDecimal bd2 = BigDecimal.valueOf(3);
        System.out.println(addBigDecimal(bd1, bd2).doubleValue());//13
        System.out.println(bd1.add(bd2).doubleValue());//13, method 2
        System.out.println(bd1.doubleValue());//10, 原本數值冇改
        System.out.println(bd2.doubleValue());//3, 原本數值冇改

    }//main
    




    //就算 change a and b, result not change to original a and b
    public static int sum(int a, int b) {
        a = 100;
        b = 200;
        return a+b;
    }


    public static String concat(String x, String y) {
        return x+y;
    }

    //overflow -> int * int -> int, (long) x * y
    //long * long -> long -> Long auto up to wrapper class
    //
    public static Long multiply(int x, int y) {
        return (long)x * (long)y;//aviod overflow
    }

    //int[] arr paramether, pass by object reference
    //can void
    //唔好俾地址人用
    public static void allZero(int[] arr) {
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = 0;
        }
    }

    public static void changeBookName(Book book) {
        book.setName("hello");
    }

    //similar to BigDecimal design
    // public static Book changeBookName(Book book) {
    //     return new Book("Hello");
    // }




    //BigDecimal? pass by value? pass by reference?
    //similar to String, whatever you do , will return a new object, will not change the value inside a BigDecimal object
    //so cannot original.setValue()
    public static BigDecimal addBigDecimal(BigDecimal original, BigDecimal delta) {
        BigDecimal temp = original.add(delta); //always return a new BigDecimal object, will not change the value inside original, 作者設計係咁
                            //所以只可以 return 一個 new BigDecimal
                            //唔可以 void, 要 return BigDecimal type
        
        return temp;//or return original.add(delta);
    }

}
