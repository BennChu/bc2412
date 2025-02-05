package Animal1;
import java.math.BigDecimal;

public class Square1 extends Shape1 {

    //private Color color; super 左唔洗 declara
    private double side;


    //constructor
    public Square1(Color color, double side) {
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
