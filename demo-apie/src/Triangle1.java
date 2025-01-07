import java.math.BigDecimal;

public class Triangle1 extends Shape1 {

    private String color;
    private double base;
    private double height;

    public Triangle1(String color, double base, double height) {

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


}
