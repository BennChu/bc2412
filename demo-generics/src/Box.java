import java.math.BigDecimal;

public class Box<T extends Shape> { 
    //因為 extends 所以先可以 .area()
    //鎖住係Shape, 所以 java 先可以確定係 Shape, 所以先可以 .area()
    //this.shape[0].area()
    
    //開個 box 放圖形
    //generic
    //因為唔想寫死個 type
    //compile time 完成確定
    private T[] shapes;

    public Box() {
        //this.shapes = new T[2];//new T 真係一個動作, java 唔 safe
        //              new Shape
        this.shapes = (T[]) new Shape[2];
    }

    public double totalArea() {
        BigDecimal total = BigDecimal.valueOf(0.0);

        for (Shape shape : this.shapes) {
            total = BigDecimal.valueOf(shape.area()).add(total);
        }
        
        return total.doubleValue();
    }

    //the T in instance method refers to the definition T of Class
    public void addShape(int index, T shape) {
        this.shapes[index] = shape;
    }

    //static method totalArea2 要比野佢計數, not related to object
    //the T in static method is not referring the T in Class
    //形容 U extends Shape,
    public static <U extends Shape> double totalArea2(U[] shapes) {
        BigDecimal total = BigDecimal.valueOf(0.0);

        for (Shape shape : shapes) {//this. 唔要因為係 static method not object, 但可以下面 .area, 因為上面 extends Shape, 個範圍包埋 .area()
            total = BigDecimal.valueOf(shape.area()).add(total);
        }
        return total.doubleValue();
    }


    public static void main(String[] args) {

        Box<Circle> box1 = new Box<>();
        box1.addShape(0, new Circle(3.0));
        box1.addShape(1, new Circle(4.0));
        System.out.println(box1.totalArea());

        Box<Shape> box2 = new Box<>();
        box2.addShape(0, new Circle(3.0));
        box2.addShape(1, new Square(4.0));
        System.out.println(box2.totalArea());

    }
    //Team<Hero>
}
