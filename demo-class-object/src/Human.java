import java.math.BigDecimal;
import java.math.RoundingMode;

public class Human {


    private double weight; //instance variable unit is Kg, instance 係 object 既意思
    private double height; //should unit is m
    private char gender;


    //constructor, nothing return, but no need void
    //係一個 type
    //用家 pass value 入黎, construct 個 value
    //可以多個 constructor
    public Human(double height, double weight, char gender){

        this.weight = weight;
        this.height = height;
        this.gender = gender;

    }

    //empty constructor
    public Human(){

    }




    //constructor is same as method, not allow same constructor signature
    // public Human(double height){


    // }


    // public Human()





    //method return double
    //instance method
    public double calculateBmi(){

        //可以咁寫
        //Math.pow(this.weight, 2.0))
        //return BigDecimal.valueOf(this.weight)
        //                 .divide(BigDecimal.valueOf(Math.pow(this.weight, 2.0)), 2, RoundingMode.HALF_UP);


        //除數可能有問題, 10/3
        return BigDecimal.valueOf(this.weight)
                         .divide(BigDecimal.valueOf(this.height), 2, RoundingMode.HALF_UP)
                         .divide(BigDecimal.valueOf(this.height), 2, RoundingMode.HALF_UP)
                         //.setScale(2, RoundingMode.HALF_DOWN) //for other operation + - *
                         .doubleValue();
                       
    }//method calculateBmi


    //instance method
    //able to call object attribute & instance method
    public String bmiIndex(){

        double bmiValue = this.calculateBmi();
        if( bmiValue >= 35.0 ){
            return "Extremely Obese";
        }else if( bmiValue >= 30.0 && bmiValue < 35){
            return "Obese";
        }else if( bmiValue >= 25 && bmiValue < 30){
            return "Overweight";
        }else if( bmiValue >= 18.5 && bmiValue < 25){
            return "Normal";
        }else
            return "Under weight";

    }//instance method bmiIndex()








    //寫一個一樣 method but static
    public static double calculateBmi( double height, double weight){


        return BigDecimal.valueOf(weight)
               .divide(BigDecimal.valueOf(height), 2, RoundingMode.HALF_UP)
               .divide(BigDecimal.valueOf(height), 2, RoundingMode.HALF_UP)
               .doubleValue();


    }//static method calculateBmi

    //getter, no getter, 意思唔想data reveal 出黎
    public double getHeight(){
        return this.height;
    }


    public double getWeight(){
        return this.weight;
    }

    public char getGender(){
        return this.gender;
    }

    //static method
    public static char getGender(Human human){

        return human.getGender();
    }




//****************************main************************************ */

    public static void main(String[] args){ //static 係公家地方


        Human h1 = new Human( 1.74, 68, 'M');

        System.out.println(h1.calculateBmi());
        System.out.println(h1.bmiIndex());
        System.out.println(h1.getGender());
        System.out.println(Human.calculateBmi(1.74, 68));

        //h2 is local variable, h2 is a pointer, point to an object, run then get the value in the object
        Human h2 = new Human();
        System.out.println(h2.getHeight());
        System.out.println(h2.getWeight());
        System.out.println(h2.getGender());

        //char default value not space " "
        if( h2.getGender() == '\u0000')
            System.out.println("default value");

        //for local variable, you cannot get the value before initialization
        double x;


        

    }//main
  
}//class
