package Shape2;

import java.math.BigDecimal;

public class Circle2 implements Shape2 {

    private double radius;

    public Circle2(double radius) {
        this.radius = radius;
    }

    public double area() {
        return BigDecimal.valueOf(this.radius)
                        .multiply(BigDecimal.valueOf(this.radius))
                        .multiply(BigDecimal.valueOf(Math.PI))
                        .doubleValue();
    }
    
    
}
