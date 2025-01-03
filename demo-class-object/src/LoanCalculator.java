import java.math.BigDecimal;
import java.math.RoundingMode;

public class LoanCalculator {


    //want to calculate total interest
    private double principle; //the unit is dollar
    private double annualInterestRate; //the unit is %, so need to /100
    private int numberOfYears;


    //constructor
    public LoanCalculator(double principle, double annualInterestRate, int numberOfYears){

        this.principle = principle;
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        
    }


    //intance method totalInterestAfterYears()
    //no return value, no void
    public double totalInterestAfterYears(){

        // BigDecimal power = BigDecimal.valueOf(1).add(BigDecimal.valueOf(this.annualInterestRate/100))
        //                   .pow(this.numberOfYears);

        // BigDecimal power1 = power.subtract(BigDecimal.valueOf(1));

        //一 divide 就要 2, RoundingMode.HALF_UP
        // return BigDecimal.valueOf(this.principle)
        //                  .multiply(BigDecimal.valueOf(this.annualInterestRate/100))
        //                  .multiply(power)
        //                  .divide((power1), 2, RoundingMode.HALF_UP)
        //                  .doubleValue();



         //totalInterest = principle * (1 + annualInterestRate/100) ^ numberOfYears - principle
         return BigDecimal.valueOf(this.principle)
                          .multiply(BigDecimal.valueOf(Math.pow(1 + this.annualInterestRate/100, this.numberOfYears)))
                          .subtract(BigDecimal.valueOf(this.principle))
                          .doubleValue();                

    }


    //static method(), has return value is double
    public static double totalInterestAfterYears(double principle, double annualInterestRate, int numberOfYears){

        return BigDecimal.valueOf(principle)
                         .multiply(BigDecimal.valueOf(Math.pow(1 + annualInterestRate/100, numberOfYears)))
                         .subtract(BigDecimal.valueOf(principle))
                         .doubleValue();

    }



    //***************************main****************************** */
    public static void main(String[] args){

        //instance method() call 法
        //LoanCalculater is a type
        //new LoanCalculator is declaration
        LoanCalculator loan1 = new LoanCalculator(10_000, 2.0, 2);

        System.out.println(loan1.totalInterestAfterYears());        

        //testing 
        System.out.println(Human.calculateBmi(1.74, 68));   //22.46


    }//main
  
}//class
