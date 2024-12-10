public class Exercise20241210 {
  public static void main (String[] args){
    
    double priceForApple = 7.3;
    double priceForOrange = 6.5;
    int quantityOfApple = 3;
    int quantityOfOrange = 4;


    double totalAmount;

    totalAmount = quantityOfApple * priceForApple + quantityOfOrange * priceForOrange;
    // Step 1: quantityOfApple -> int, priceForApple -> double
    // Step 2: int * double
    // Step 3: 3 * 7.3 ->21.9
    // Step 4: assign 21.9 (double value) to double type variable


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




    //byte -> short -> int -> long
    byte maxByte = 127;
    
    // int value -> byte
    // maxByte = maxByte + 1; // Java is it safe? not safe, overflow
    // maxByte = maxByte - 1; // not safe
    // byte value + int value -> int value
    //can we assign int value to byte variable? (downcasting)

    byte b1 = (byte) (maxByte+2);

    System.out.println(b1);



    //Java: (1) Compile time + (2) Run time
    // (1) Java file (.java) -> class file (.class): java code -> byte code (machine)
      // (1.1) compile fail. for example (missing ; -> syntax error)
      // (1.2) compile success -> class file
    // (2) Java Virtual Machine (JVM) -> convert class file to machine code -> execute machine code

  }  




}
