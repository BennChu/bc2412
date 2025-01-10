


public class Circle extends Shape {

    import java.math.BigDecimal;
    /* Parent class: color
     * Square.class, Triangle.class, circle.class ...
     * area() return double
     */
    
    private double radius;

    //if you dont specify the constructor, implicitly you have a default empty constructor
    //不論你係 empty constructor or constructor, 你都要 call

    //constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public double area() {

        return BigDecimal.valueOf(this.radius)
            .multiply(BigDecimal.valueOf(this.radius))
            .multiply(BigDecimal.valueOf(Math.PI))
            .doubleValue();
    }

   

}
