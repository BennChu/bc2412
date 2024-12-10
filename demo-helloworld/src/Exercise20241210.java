public class Exercise20241210 {
  public static void main (String[] args){
    
    double priceForApple = 7.3;
    double priceForOrange = 6.5;
    int quantityOfApple = 3;
    int quantityOfOrange = 4;


    double totalAmount;
    // Step 1: quantityOfApple -> int, priceForApple -> double
    // Step 2: int * double
    // Step 3: 3 * 7.3 ->21.9
    // Step 4: assign 21.9 (double value) to double type variable


    totalAmount = quantityOfApple * priceForApple + quantityOfOrange * priceForOrange;

    System.out.println("The total amount is");
    System.out.println(totalAmount);


    int mathScore = 73;
    int englishScore = 60;
    int historyScore = 61;

    double averageScore = (mathScore + englishScore + historyScore)/3.0;
    //Step 1: mathScore englishScore historyScore -> int, 3 -> int but 3.0 -> double
    //Step 2: int value / int value -> int, int value / double value -> double
    //Step 3: (mathScore + englishScore + historyScore)/3.0 -> double
    //Step 4: assign 64.66666 (double value) to double


    System.out.println("average score is");
    System.out.println(averageScore);



  }  




}
