import java.math.BigDecimal;

public class Circle extends Shape {

    /* Parent class: color
     * Square.class, Triangle.class, circle.class ...
     * area() return double
     */
    
    private String color;
    private double radius;

    //constructor
    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double area() {

        return BigDecimal.valueOf(this.radius)
               .multiply(BigDecimal.valueOf(this.radius))
               .multiply(BigDecimal.valueOf(Math.PI))
               .doubleValue();
    }

    public static void main(String[] args) {

        Circle c1 = new Circle("Yellow", 2.5);

        System.out.println(c1.area());
    }

}
