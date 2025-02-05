package Animal1;
import java.math.BigDecimal;

public class Triangle1 extends Shape1 {

    //private Color color; super 左唔使 declara
    private double base;
    private double height;

    public Triangle1(Color color, double base, double height) {

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
