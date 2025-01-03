public class DemoDataType {
  public static void main(String[] args){
    //comment. Welcome to bootcamp.
    // Data type has 8 Primitive -> double 64 bits default 0.0, cannot use for calculation
                                  // float 32 bits 32bits IEEE of 754 float point default 0.0, cannot use for calculation
                                  // long 64 bits (-2^63 to 2^63-1) default 0
                                  // int 32 bits (-2,147,438,648 to 2,147,438,647) default 0
                                  // char 16 bits (0 to 65535) default '\u0000'
                                  // short 16 bits (-32768 to 32767) default 0
                                  // byte 8 bits (-128 to 127) default 0
                                  // boolean, 1 bit, true or false
    // int (date type) -> integer
    // x, dayOfWeek -> variable

    int x =3;
    int dayOfWeek = 7;
    //int y = 3.3; not ok, y is a variable that can store integer only, 3.3 is float or double

    double y2 = 3.2;  // double 2w = 10.0; naming variable 數字唔可以放頭
    
    //variable java naming convension
    //caml case: dayOfWeek, y2

    //Variable declaration
    int x100;
    
    //Value assignment
    x100 = 9;


    //re-assignment, x cannot be declared twice
    x = 101;       //re assign 101 to x
    x = x + 10;    //right 101+10, left: assign 111 to x
    x = x - 40;    //111-40 = 71
    x = x * 3;     //71 * 3 = 213
    x = x / 213;   //213/213

    System.out.println(x);  //1

    x = x + 8 * 2 / 4 + 1;
    System.out.println(x);  //6, java support 先 * / 後 + -

    x = (x+2) * 2 / (3+1);
    System.out.println(x); //4, java support 先計 bracket

    x = ((x+3) / (6+1)) * (x+1);
    System.out.println(x); //5


    //除數要小心
    //divide by 0, 係 undifined
    //int f = 10/0;
    //System.out.println(f);

    // 0/10, 係 0
    System.out.println(0/10); //0


    //divide, 除數既 steps

    int x2 = 3 / 2;
    //step 1: 3 -> int value, 2 -> int value
    //step 2: int value / int value -> int value
    //stpe 3: 3 / 2 -> 1
    //step 4: assign 1 (int value) to int type variable (ok)
    System.out.println(x2); //1

    double x3 = 3/2;
    //step 1: 3 -> int value, 2 -> int value
    //step 2: int value / int value -> int value
    //stpe 3: 3 / 2 -> 1
    //step 4: assign 1 (int value) to double type variable (convert 1 to 1.0)
    System.out.println(x3); //1.0

    double x4 = 3.0 / 2;
    //step 1: 3.0 -> double value, 2 -> int value
    //step 2: double value / int value -> double value
    //stpe 3: 3.0 / 2.0 -> 1.5
    //step 4: assign 1.5 (double value) to double type variable
    System.out.println("this is 3.0/2 = " + x4); //1.5

    double x5 = 3.00000 / 2.00000;
    System.out.println("this is 3.00000 / 2.00000 = " + x5); //1.5


    //int x5 = 3.0 / 2;
    //Step 1: 3.0 -> double value, 2 -> int
    //Step 2: double value / int value -> double value
    //Step 3: 3.0 / 2.0 -> 1.5
    //Step 4: assign 1.5 (double value) to int type variable (downcasting)
    //not allow assign a higher level value to a lower level type of variable

    //int -> double, int 可以 assign to double
    //double -> int, double 唔可以 assign to int

    //Store integer. Java: int, byte, short, long
    int value = 1000000;
    int value2 = 1_000_000; //可以寫 _ 係 int type
    int value3 = 1_00_00_00;
    int maxInteger = 2_100_000_000;
    double value4 = 1_000_000;

    System.out.println(value);
    System.out.println(value2);
    System.out.println(value3); //1000000
    System.out.println(value4); //1000000.0
    System.out.println(maxInteger); //2100000000

    //int maxInteger = 2_147_483_648
    //int minInteger = - 2_147_483_649

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
    double d2 = 10.2d; // 10.2d -> force the value to double value
    float f1 = 10.2f; // 10.2f -> force the value to float value
    float f2 = 12345.12345f;

    System.out.println("float " + f2);
    System.out.println("d1 " + d1); //10.2
    System.out.println("d2 " + d2); //10.2

    //conversion
    float f4 = 12345.12345f;
    System.out.println("this is float value f4 " + f4);

    double d3 = f4; // assign float value to double variable, upcasting, it is safe to java, can do
    System.out.println("assign float value f4 to double variable " + d3);

    // float f5 = d3; // not safe, d3 is double, downcast

    double d4 = 10.2f; // upcasting (float -> double)

    double d5 = f4 + 10.2d;
    // float + double -> double

    double d6 = 0.2 + 0.1;
    System.out.println("0.2 + 0.1 = " + d6); //0.30000000000000000000004 double float cannot use for calculation

    char c = 'x';
    char c2 = '1';
    char c3 = '!';
    char c4 = ' ';    // space ok
                      //char c5 = ''; not ok at least one character
    char c5 = 48;     // for ascii value
    System.out.println("this is char c2 " + c2);
    System.out.println("this is ascii of c5 = "+ c5);

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

    char q2 = 97; // assign no '', is ascii code
    System.out.println(q2);

    // ASCII code, char and int relationship
    char q3 = 48;                                      //48 冇 '', 放 ascii 係 char, q3 = 0
    int u3 = q3;                                       //放 char 係 int, u3 = 48
    System.out.println("q3 = " + q3 + ", u3 = " + u3); // q3 = 0, u3 = 48

    char q4 = 65;
    System.out.println(q4); //A, ascii code 65 is A

    char q5 = 10000;
    System.out.println(q5);

    char q6 = '你';         // 放 '你' 係 char
    int u6 = q6;            // char 轉 
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