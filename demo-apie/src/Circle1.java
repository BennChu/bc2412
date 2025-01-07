import java.math.BigDecimal;

public class Circle1 extends Shape1 {

    /* Parent class: color
     * Square.class, Triangle.class, circle.class ...
     * area() return double
     */
    
    private Color color;
    private double radius;

    //if you dont specify the constructor, implicitly you have a default empty constructor
    //不論你係 empty constructor or constructor, 你都要 call

    //constructor
    public Circle1(Color color, double radius) {
        //if you dont specify super() here, implicitly you are calling super()
        super(color); //because you have "extends" you have to "super"
                      //calling Parent class 放 color
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }



    //如果同名 mehtod() 出現, 寫 or 唔寫 @Override 都會 override
    //@Override 只係一個 indication
    //override the parent given method with the same mehtod name
    //記住 abstract 永遠 override
    @Override //compiler will help to check if the parent class has an area() method
    public double area() {

        return BigDecimal.valueOf(this.radius)
            .multiply(BigDecimal.valueOf(this.radius))
            .multiply(BigDecimal.valueOf(Math.PI))
            .doubleValue();
    }




    public static void main(String[] args) {

        //new Circle1() 
        //after you specify a constructor, then the default constructor will be no longer exits

        Circle1 c1 = new Circle1(Color.YELLOW, 2.5);
        System.out.println(c1.getColor() + " Circle area = " + c1.area());

        Square1 sq1 = new Square1("BLUE", 4);
        System.out.println(sq1.getColor() + " Square area = " + sq1.area());

        Triangle1 tri1 = new Triangle1("RED", 5.3, 6.2);
        System.out.println(tri1.getColor() + " Triangle area = " + tri1.area());


    }

}
