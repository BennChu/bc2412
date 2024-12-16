public class DemoWrapperClass {
    public static void main(String[] args) {

        // total 17 個 type ,  8 data type + wrapper class + string

        int x = 3; // x is a primitive type variable
        Integer x2 = x; // auto-box , x2 係一個波, 係一個 object 就有功能, 第一個係大草就係 object

        System.out.println(x2); // return 3
        System.out.println(x2.doubleValue()); // 3.0, x2 係冇變, 3 變成 double 既狀態 係一個 method


        double d = 3.3;
        Double d2 = d; // auto-box


        System.out.println(d2); // return 3.3
        System.out.println(d2.intValue()); // return 3


        double d3 = d2; // un-box
        double d4 = d2.doubleValue();


        // char -> Character
        char c1 = 'a';
        Character c2 = c1; // auto box
        System.out.println(c2.compareTo('a')); // return 0, distance is 0
                                               //compare 2 characters numerically
        Character c3 = 'c';
        System.out.println(c3.compareTo('c')); // 2 ascii of 'c' > ascii of 'a'
        Character c4 = 'A';
        System.out.println(c4.compareTo('a')); // -32 比較 ascii code distance


        int asciiOfA = 'A';
        int asciiOfa = 'a';

        System.out.println(asciiOfA - asciiOfa);
        System.out.println('a' - 'A'); // 32 char value - char value -> int value -> int value

        char c5 = c4; // un box
        System.out.println(c5);

        // boolean -> Boolean
        boolean b1 = false;
        Boolean b2 = b1;
        System.out.println(b2);




        // byte -> Byte
        // short -> Short
        // long -> Long
        // float -> Float














    }
}
