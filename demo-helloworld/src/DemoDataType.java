public class DemoDataType {
  public static void main(String[] args){
    //comment. Welcome to bootcamp.
    // Data type (8 Primitive)
    // int (date type) -> integer
    // x, dayOfWeek -> variable

    int x =3;
    int dayOfWeek = 7;
    // int y = 3.3; // not ok, y is a variable that can store integer only

    double y2 = 3.2;
    // double 2w = 10.0; // not ok

    // variable java naming convension
    // caml case: dayOfWeek, y2

    // Variable declaration
    int x100;
    // Value assignment
    x100 = 9;


    //re-assignment, x cannot be declared twice
    x = 101;       // re assign 101 to x
    x = x + 10;    // right 101+10, left: assign 111 to x
    x = x - 40;    // 111-40 = 71
    x = x * 3;     // 71 * 3 = 213
    x = x / 213;   // 213/213

    // print out
    System.out.println(x);

    x = x + 8 * 2 / 4 + 1; //

    System.out.println(x); //6

    x = (x+2) * 2 / (3+1);

    System.out.println(x); //4

    x = ((x+3) / (6+1)) * (x+1);
    System.out.println(x); //5


    //divide by 0
    //int f = 10/0;
    //System.out.println(f);

    // 0 /10
    System.out.println(0/10); // 0


    //divide

    int x2 = 3 / 2;
    // step 1: 3 -> int value, 2 -> int value
    // step 2: int value / int value -> int value
    // stpe 3: 3 / 2 -> 1
    // step 4: assign 1 (int value) to int type variable (ok)
    System.out.println(x2); //1

    double x3 = 3/2;
    // step 1: 3 -> int value, 2 -> int value
    // step 2: int value / int value -> int value
    // stpe 3: 3 / 2 -> 1
    // step 4: assign 1 (int value) to double type variable (convert 1 to 1.0)
    System.out.println(x3); //1.0

    double x4 = 3.0 / 2;
    // step 1: 3.0 -> double value, 2 -> int value
    // step 2: double value / int value -> double value
    // stpe 3: 3.0 / 2.0 -> 1.5
    // step 4: assign 1.5 (double value) to double type variable
    System.out.println(x4); //1.5


    // int x5 = 3.0 / 2;
    // Step 1: 3.0 -> double value, 2 -> int
    // Step 2: double value / int value -> double value
    // Step 3: 3.0 / 2.0 -> 1.5
    // Step 4: assign 1.5 (double value) to int type variable (downcasting)
    // ! not allow assign a higher level value to a lower level type of variable

    // int -> double
    // double -> int

    // Store integer. Java: int, byte, short, long
    int value = 1000000;
    int value2 = 1_000_000;
    int maxInteger = 2_100_000_000;

    // int maxInteger = 2_147_483_648
    // int minInteger = - 2_147_483_649

    //byte -128 to 127
    byte b1 = -128;
    byte b2 = 127;

    //short -32768 to 32767
    short s1 = -32768;
    short s2 = 32767;


    //long 
    // 2_147_483_648
    //int value -> double type variable

    //long l1 = 

    // Declare a hardcode long value, you should always add "L"
    //long l1 = 2147483648L; // "L" -> declare it is a long value

    // float, double
    double d1 = 10.2; // 10.2 -> double value
    double d2 = 10.2d; // 10.2d -> double value
    float f1 = 10.2f; // 10.2f -> float value
    float f2 = 100000000000000.222f;


    //conversion
    float f4 = 10.2f;
    double d3 = f4; // safe, assign float value to double variable
    System.out.println("this is float value f4 " + f4);
    System.out.println("this is d3 assign float value to double variable " + d3);

    // float f5 = d3; // not safe

    double d4 = 10.2f; // upcasting (float -> double)

    double d5 = f4 + 10.2d;
    // float + double -> double

    double d6 = 0.2 + 0.1;
    System.out.println(d6); //0.30000000000000000000004 double float cannot use for calculation

    char c = 'x';
    char c2 = '1';
    char c3 = '!';
    char c4 = ' ';    // space ok
                      //char c5 = ''; not ok at least one character
    char c5 = 182;     // for unicode value, refers to symbols
    System.out.println("this is char c2 " + c2);
    System.out.println("this is unicode = "+ c5);

    // boolean
    boolean b = true;
    boolean b10 = false;

    boolean isSmoker = false;
    int age = 66;
    boolean isElderly = age > 65; // "age.65" -> asking if age > 65
    System.out.println(isElderly);


    // all data types double > float > long > int > char > short > byte > boolean

    boolean b8 = true;




    char q = 'a';
    int u = q; // char value can be assigned to int, safe
               // int 
    System.out.println(u); // char 48 is '0'
                           // char 65 is 'A'
                           // char 97 is 'a'

    char q2 = 97;
    System.out.println(q2);

    // ASCII code
    char q3 = 48;
    int u3 = q3;
    System.out.println(q3 +" " + u3);

    char q4 = 65;
    System.out.println(q4);

    char q5 = 10000;
    System.out.println(q5);

    char q6 = '你';
    int u6 = q6;
    System.out.println(u6); // 20320

    char q7 = '好';
    int u7 = q7;
    System.out.println(u7);

    // char q7 = 70000; // out of range of char value

    // byte -> short -> int -> long -> float -> double
    float f11 = 97;
    double d11 = 97;
    // char -> int -> long -> float -> double
    long l10 = 'a';
    float f10 = 'a';
    double d10 = 'a';


    




  }

}