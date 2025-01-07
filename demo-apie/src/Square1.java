import java.math.BigDecimal;

public class Square1 extends Shape1 {

    private String color;
    private double side;


    //constructor
    public Square1(String color, double side) {
        super(color);
        this.side = side;
    }

    public double getSide() {
        return this.side;
    }

    //it is not division, no need roundingmode
    public double area() {
        return BigDecimal.valueOf(Math.pow(this.side,2.0)).doubleValue();
    }

    public static void main(String[] args) {
        
    }
}
