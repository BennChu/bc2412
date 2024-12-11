public class DemoOperator {

  public static void main(String[] args){

    int x = 3;
    x = x +1;   // all the same
    x++;
    ++x;
    x += 1; // += means x = x + 1
    System.out.println(x); // return 7

    // -1, below are all the same
    int y = 10;
    y = y -1;
    y--;
    --y;
    y -= 1;
    System.out.println(y); // should return 6

    // +2
    int b = 20;
    b = b +2;
    b += 2;
    System.out.println(b); // should return 24

    //-2
    int c = 20;
    c = c - 2;
    c -= 2;
    System.out.println(c); // should return 16

    // *= , /=
    int m = 5;
    m = m * 2;
    m *= 5;
    System.out.println(m); // should return 50

    int u = 4;
    u = u / 2;
    u /= 2;
    System.out.println("除數 " + u); // should return 1


    int remainder = 10 % 3;
    System.out.println("remainder function % 10 / 3 is " + remainder); // should return 1


    // ++x vs x++
    int a = 8;
    int result1 = ++a + 3;
    System.out.println(result1); // should return 12
    System.out.println("a is " + a);
    // Step 1: a become 9
    // Step 2: a + 3 (9+3)
    // step 3: assign 12 to result1


    int q = 8;
    int result2 = q++ + 3;
    System.out.println("result2 value is " + result2); // should return 11
    System.out.println("q is " + q); // should return 9
    // Step 1: q + 3, (8+3), return 11
    // Step 2: assign 11 to result2
    // Step 3: q become 9


    // equals h++ +3
    int h = 2;
    int result3 = h + 3;
    h = h +1;
    System.out.println(result3);
    System.out.println(h);

    // String +=
    String s = "hello";
    s += '!';
    System.out.println(s); // should retrun Hello

    // int + double = double
    // String + anything = String
    s += 'a';
    System.out.println(s);

    s += "yuou";
    System.out.println(s);

    // not good
    int x10 = 5;
    int y10 = 10;
    int z10 = x10 += 3 * y10; // not good
    System.out.println("z10 = " + z10);


    int x11 = 3;
    int y11 = (x11++ +3) * x11++;
    System.out.println("x11 = " + x11);
    //Step 1: 3 + 3
    //Step 2: x11 become 4
    //Step 3: (3+3) * 4
    //Step 4: assign
    //Step 5: x11 become 5

    // ++11
    int x12 = 3;
    int y12 = (x12++ +3) * ++x12;
    System.out.println("y12 = " + y12);

    // ++x13
    int x13 = 3;
    int y13 = (++x13 + 3) * ++x13;
    System.out.println("y13 = " + y13);
    //Step 1: ++x13 = 4
    //Step 2: 4+3 = 7
    //Step 3: ++x13 = 5
    //Step 4: 7 * 5



  }
  
}
