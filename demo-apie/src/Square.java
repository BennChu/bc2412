import java.math.BigDecimal;

public class Square extends Shape {

    private String color;
    private double side;


    //constructor
    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    //it is not division, no need roundingmode
    public double area() {
        return BigDecimal.valueOf(Math.pow(this.side,2.0)).doubleValue();
    }

    public static void main(String[] args) {
        Square sq1 = new Square("BLUE", 4);
        
        System.out.println("The area is " + sq1.area());
    }
}
