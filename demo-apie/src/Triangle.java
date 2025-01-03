import java.math.BigDecimal;

public class Triangle extends Shape {

    private String color;
    private double base;
    private double height;

    public Triangle(String color, double base, double height) {

        super(color);
        this.base = base;
        this.height = height;
    }
    

    public double area() {

        return BigDecimal.valueOf(this.base)
                .multiply(BigDecimal.valueOf(this.height))
                .divide(BigDecimal.valueOf(2))
                .doubleValue();
    }


    public static void main(String[] args) {

        Triangle tri1 = new Triangle("RED", 5.3, 6.2);

        System.out.println(tri1.area());
   
    }

}
