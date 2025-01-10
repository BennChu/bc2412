import java.math.BigDecimal;

public class Circle {
  
    
    //直徑, 面積, 圓周都可以由半徑計到
    //所以唔需要多D attributes
    //可以有唔同 colour
    //private String color;
    private double radius; 
    

    
    //construtor
    public Circle(double radius) {
        this.radius = radius;
    }

    //getters
    public double getRadius() {
        return this.radius;
    }

    public double getDiameter(){
      return this.radius * 2;
    }

    //setter
    //void no need return
    public void setRadius(double radius){

       this.radius = radius;
    }

    //instance method
    //presentation
    //性能, 唔需要儲, 即計好快
    //唔需要俾 input radius, 因為下面係
    //create new object c1 時已經俾左 radius

    public double calculateArea(){ 

        //return this.radius * this.radius * Math.PI;
        return BigDecimal.valueOf(this.radius)
                         .multiply(BigDecimal.valueOf(this.radius))
                         .multiply(BigDecimal.valueOf(Math.PI))
                         .doubleValue();
    }

    public double circumference(){

        return BigDecimal.valueOf(2)
               .multiply(BigDecimal.valueOf(this.radius))
               .multiply(BigDecimal.valueOf(Math.PI))
               .doubleValue();
    }


    //static method cannot called 'this'
    //design definition, input -> output 
    //formula
    public static double calculateArea(double radius){ //
                                    
    return BigDecimal.valueOf(radius)
          .multiply(BigDecimal.valueOf(radius))
          .multiply(BigDecimal.valueOf(Math.PI))
          .doubleValue();
}




  //*****************main**********************/
    public static void main(String[] args){
    
    //area
    //BigDecimal

    Circle1 c1 = new Circle1(Color.YELLOW, 3.0); //create circle object 俾左 radius
                                 //c1 係 pointer, 指住 3.0

    System.out.println(c1.calculateArea());
    System.out.println(c1.circumference());

    //static method, both are the same
    System.out.println(Circle1.calculateArea(3.0));
    System.out.println(calculateArea(3.0));





    }//main





}//class
