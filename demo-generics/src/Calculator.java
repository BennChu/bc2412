public class Calculator<T extends Number> {//Number is Byte, Short, Integer, Long, Float, Double

    //if we achieve the same purpose without generics
    //ByteCalculator.class
    //Short
    //Integer
    //Long
    //Float
    //Double
    //Numbercalculator.class
    
    
    
    
    
    
    
    
    
    
    
    private T x; //T 唔知係乜, 所以唔可以加
                // extends parent class Number
    private T y;

    public Calculator(T x, T y) {
        this.x = x;
        this.y = y;
    }

    public Number sum() {
        if (this.x instanceof Byte && this.x instanceof Byte) {
            return (byte) this.x + (byte) this.y; //byte + byte -> int -> Integer
        } else if (this.x instanceof Short && this.x instanceof Short) {

        } else if (this.x instanceof Integer && this.x instanceof Integer) {

        } else if (this.x instanceof Long && this.x instanceof Long) {

        } else if (this.x instanceof Float && this.x instanceof Float) {

        }else if (this.x instanceof Double && this.x instanceof Double) {

        }
    
    }


    // public T sum() {
    //     return this.x + this.y;
    // }


    public static void main(String[] args) {

        Calculator<Byte> calculator = 
            new Calculator<>(Byte.valueOf("10"), Byte.valueOf("20"));

        Calculator<Number> calculator2 = 
            new Calculator<>(Byte.valueOf("10"), Short.valueOf("20"));
        //private Number x
        //private Number y
    
    }
    
}
