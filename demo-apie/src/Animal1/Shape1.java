package Animal1;
public abstract class Shape1 {

    /* abstract class vs class
     * 1.cannot create object for abstract class, 
     *   越精細越好, 你知道唔會俾人 create shape object, 就寫 abstract
     *   cannot new Shape1(), compile error
     * 2.they are both with common attribute for child class
     * 3.abstract class's constructor is for child class to "super"
     */  

    private Color color;//可以唔使用 String

    //constructor, 可以比 child class 用
    public Shape1(Color color) {
        this.color = color;
    }
    
    public Color getColor() {//Color 係一個 type
        return this.color;
    }

    //abstract 一個 method
    //implicitly public
    //implication: 
    //1. if the child class cannot provide area implementation, then it is not a shap
    //shape 計唔到 area, 但 child 要計到
    //no need public, by default is public
    //2. 如果 child class 冇 area() method,
    //   run 會出 the child class must provide the implementation of abstract method
    abstract double area();


    public static Shape1 create(char ref) {//S -> Square, C -> Circle
        switch(ref) {
            case 'S':
                return new Square1(Color.RED, 4);
            case 'C':
                return new Circle1(Color.BLUE, 5);//因為 Circle1 改左用 enum Color type
            default:
                return null;
        }
    }

    public static Circle1 createCircle(Color color, double radius) {
        return new Circle1(color, radius);
    }

    public static double getSide(Shape1 shape) {
        Square1 firstSquare = (Square1) shape;//downcast
        return firstSquare.getSide();
    }
    
    public static void main(String[] args) {
        //如果 create new object, compile error, cannot new Shape1()
        //Shape1 is abstract class, cannot new object
        Shape1 firstShape = Shape1.create('S');
        Shape1.create('C');
        System.out.println(firstShape.getColor());

        Square1 firstSquare = (Square1) firstShape;//downcast bcoz Shape1 does not have getSide()
        System.out.println(firstSquare.getSide());//4.0

        System.out.println(Shape1.getSide(firstShape));//4.0
        
        //Shape1.createCircle() return Circle1 type
        Circle1 c2 = Shape1.createCircle(Color.BLUE, 5);
        System.out.println(c2.getColor());

        //Heros.createArcher();
    }

}
