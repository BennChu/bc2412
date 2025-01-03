public class DemoInteger {

  
    public static void main(String[] args) {


        /* int and string 好常用, 唔 repeat 開一個 */
        Integer x = 3;
        Integer x2 = 3;

        /* 2 reference, 1 object (internal cache) */
        System.out.println(System.identityHashCode(x));
        System.out.println(System.identityHashCode(x2));

        Integer x3 = new Integer(3);
        System.out.println(System.identityHashCode(x3));

        Integer x4 = Integer.valueOf(3);
        /* 因為開過 3, 指住同一個 object */
        System.out.println(System.identityHashCode(x4));

        /* Cache Range: -128 to 127  */
        Integer x5 = 128;
        Integer x6 = 128;
        /* not the same
         * java 看法, 不是常用數, 不用提高性能
         */
        System.out.println(System.identityHashCode(x5));
        System.out.println(System.identityHashCode(x6));

        Integer x7 = new Integer(128);
        Integer x8 = Integer.valueOf(128);

        /* same situation for Byte -128 to 127, short, long
         *  
         */

         Character c = 'a';
         Character c2 = 'a';
         /* should be same object reference */
         System.out.println(System.identityHashCode(c));
         System.out.println(System.identityHashCode(c2));

         Character c3 = '你';
         Character c4 = '你';
         /* should not be the same */
         System.out.println(System.identityHashCode(c3));
         System.out.println(System.identityHashCode(c4));

         Boolean b1 = true;
         Boolean b2 = true;
         System.out.println(System.identityHashCode(b1));
         System.out.println(System.identityHashCode(b2));

         /* float and double not support internal cache  */
         Double d1 = 10.3;
         Double d2 = 10.3;
         /* double 需要既 range 好大
          * 精度要高
          */
         System.out.println(System.identityHashCode(d1));
         System.out.println(System.identityHashCode(d2));

         /* *****************important***********************
          * in reality, 將2個 object 比較
          *
          * >,<,>=,!=  for primitive types
          * 
          * if( d1 > 10.0 ), this is not ok, d1 is object class Double, wrapper class
          *
          * object should use method to do comparsion
          *
          * if(d1.compare(0, 0))
          * 有 method 用 method
          * 
          */
                      
          Double d3 = 10.3;
          Double d4 = 10.3;

            if( d3.compareTo(d4) > 0 ){
              System.out.println("d3 > d4");
            }

          Double d5 = 10.1;
          Double d6 = 10.6;
            if( d5.compareTo(d6) < 0 ) {
              System.out.println("d5 < d6");
            }

          Double d7 = 10.1;
          Double d8 = 10.6;
            if( d7.equals(d8) ) { //d7.compareTo(d8) == 0
              System.out.println("d7 = d8");
            }


            if( d3 > 3.0 ) { //3.0 is double, java auto convert d3 to primitive

            }

    }
}
