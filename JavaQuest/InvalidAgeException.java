import java.util.Scanner;


public class InvalidAgeException extends RuntimeException{
    // ExceptionExercise3.java
    // Question: Create a custom exception called InvalidAgeException. Throw this exception if a user
    // enters an age less than 18.

    // 1. If NumberFormatException is caught, print "Error: Please enter a valid number."
    // 2. Pass the age number into a static method checkAge(). 
    // This method will throw a custom exception InvalidAgeException if the age < 18; otherwise, print "Age X is accepted".
    // 3. For the method caller, handle the potential exception by printing "Age is invalid. Please input again later."

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter age: ");
        String age = scanner.nextLine();
        int age1;
      

        // try {
        //     int num = Integer.parseInt("akki");
        //     System.out.println(num);
        // } catch (NumberFormatException e) {
        //     System.out.println("Number format exception");
        // }


        //code here for the caller...
        try {
            age1 = Integer.parseInt(age);
            checkAge(age1);
            //System.out.println("Age " + age1 + " is accepted.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter a valid number.");
        } catch (InvalidAgeException e) {
            System.out.println("Age is invalid. Please input again later.");
        }
    
    
    
    }

    // code here for the method
    //Throw a custom exception called InvalidAgeException if a user enters an age less than 18
    public static void checkAge(int age) {
        
        if (age<18)
            throw new InvalidAgeException();
        else
            System.out.println("Age " + age + " is accepted.");
    }


}
