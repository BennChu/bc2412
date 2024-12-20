import java.math.BigDecimal;
import java.math.RoundingMode;

public class DemoBigDecimal {

    public static void main(String[] args){

      // double + doubld
      // 0.2 + 0.1 is not 0.3, is 0.3000000000000000000000004
      double result = 0.2 + 0.1;
      System.out.println(result); // 0.30000000000000000000000004

      if (result == 0.3){
        System.out.println("result is 0.3");
      } else {
        System.out.println("result is not 0.3");
      }


      //Solution is use BigDecimal, 有一個工具
      BigDecimal bd1 = BigDecimal.valueOf(0.2); // 係一個波, 有工具
      BigDecimal bd2 = BigDecimal.valueOf(0.1);
      BigDecimal bd3 = bd1.add(bd2);
      
      System.out.println("bd3 = " + bd3.doubleValue()); // 0.3

      BigDecimal bd4 = BigDecimal.valueOf(0.3);
      BigDecimal bd5 = BigDecimal.valueOf(0.1);
      BigDecimal bd6 = bd4.subtract(bd5);


      //subtract
      System.out.println("bd6 = " + bd6.doubleValue());

      //multiply
      System.out.println("0.1*0.2 = " + 0.1 * 0.2); // 0.02000000000000004
      System.out.println( "bd2.multiply(bd1) = " + bd2.multiply(bd1));


      // divide
      System.out.println(0.3/0.1); // 2.999999999999999999996
      BigDecimal bd10 = BigDecimal.valueOf(0.3);
      BigDecimal bd11 = BigDecimal.valueOf(0.1);
      BigDecimal bd12 = bd10.divide(bd11);

      //10 / 3
      BigDecimal bd13 = BigDecimal.valueOf(10);
      BigDecimal bd14 = BigDecimal.valueOf(3);
      //BigDecimal bd15 = bd13.divide(bd14);
      BigDecimal bd15 = bd13.divide(bd14, BigDecimal.ROUND_DOWN);
      System.out.println(bd15.doubleValue()); // 3.0 non


      BigDecimal bd16 = BigDecimal.valueOf(4.565).setScale(2, RoundingMode.HALF_DOWN);
      System.out.println(bd16.doubleValue()); // 4.56 五捨六入

      BigDecimal bd17 = BigDecimal.valueOf(4.566).setScale(2, RoundingMode.HALF_DOWN);
      System.out.println(bd17.doubleValue()); // 4.57

      BigDecimal bd18 = BigDecimal.valueOf(4.565);
      System.out.println(bd18.setScale(2, RoundingMode.HALF_DOWN)); // 4.56
      System.out.println(bd18.setScale(2, RoundingMode.HALF_UP)); // 4.57


      // RoundingMode.DOWN
      


      // 
      double length = 4.2;

      BigDecimal bd19 = BigDecimal.valueOf(length);
      System.out.println("multiply " + bd19.multiply(bd19));

      double squareArea = BigDecimal.valueOf(length)
                    .multiply(BigDecimal.valueOf(length))
                    .doubleValue();

      System.out.println(squareArea);

      //Math
      double pi = 3.14159;
      double radius = 4.5;

      //circle area p * r^2
      double circleArea = BigDecimal.valueOf(pi)
                        .multiply(BigDecimal.valueOf(radius))
                        .multiply(BigDecimal.valueOf(radius))
                        .doubleValue();
      System.out.println("circle area " + circleArea);

      circleArea = BigDecimal.valueOf(Math.pow(radius, 2.0))  //this is power function
                .multiply(BigDecimal.valueOf(Math.PI))        // pi value
                .doubleValue();

      System.out.println(circleArea);

      int x = 8;
      int y = 9;
      int max = Integer.MIN_VALUE;

      max = Math.max(x, max); //if(x>max) {max = 3}
      max = Math.max(y, max);


      int[] arr = new int[] {10, 9, 3};
      for( int i = 0 ; i< arr.length; i++){
        max = Math.max(arr[i], max);
      }


      //Math
      Math.sqrt(9);
      System.out.println(Math.sqrt(9));  //Java auto convert int value to double value
      System.out.println(Math.sqrt(10));  // 3.1622776601683795
      System.out.println(Math.sqrt(-10)); //NaN, undefined


      //round(), nearest to integer object is like tool box, 有工具
      double u = 3.456;
      System.out.println(Math.round(u));  //3

      //round to nearest 2 d.p. return 3.46
      //step 1: u*100 = 345.6
      //step 2: round() return 346
      //step 3: 346 / 100
      //step 4: 入 double, 
      System.out.println(Math.round(u*100.0) / 100.0);  // 可入 double, return long


      System.out.println(Math.abs(-9L)); // L long, absolute value 負變正











    }
  
}
