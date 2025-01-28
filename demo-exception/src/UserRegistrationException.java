import java.util.Scanner;

    public class UserRegistrationException extends RuntimeException{
        // Follow the instructions below to complete the User Registration Process.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        System.out.print("Enter email: ");
        String email = scanner.nextLine();

        // code here ...
        try {
            registerUser(username, password, email);
            System.out.println("User Registeration is Success.");
        } catch (UserRegistrationException e) {
            System.out.println("User Registeration is Fail.");//說明
        }
        

        
        // call method registerUser(), handle the exception to print "User Registeration is Fail."
        // or "User Registeration is Success."

        scanner.close();

    }

    // Call validateUsername(), validatePassword() and validateEmail()
    // if anyone of the above throw exception, this method registerUser() should throw custom
    // exception UserRegistrationException.
    // otherwise, print "User registered successfully: jackywong", where jackywong is the username.
    public static void registerUser(String username, String password, String email) {

        try {
            validateUsername(username);
            validatePassword(password);
            validateEmail(email);
            System.out.println("User registered successfully: " + username);
        } catch (IllegalArgumentException e) {
            //re throw
            throw new UserRegistrationException();
        }
        
        // try {
        //     validateUsername(username);
        // } 
            
        //     throw new UserRegistrationException();

        // if (validatePassword())
        //     throw new UserRegistrationException();

        // if (validateEmail())
        //     throw new UserRegistrationException();

    }

    // Throw IllegalArgumentException if String username is null or empty string
    private static void validateUsername(String username) {
        if (username == null || username.isEmpty())//null 空指針, 冇指住野, 有風險
            throw new IllegalArgumentException(); //要 new, from java point of view, exception 係物件
        
    }

    // Throw IllegalArgumentException
    // if password is null or password length < 8 or it does not contain
    // any special characters of !@$&_
    private static void validatePassword(String password) {
        //先 check null, 唔係 null 有指野, 先 check length
        if (password == null || password.length()<8 || !password.matches(".*[!@$&_].*"))
        //or !(password.contains("!") || password.contains("@") || password.contains("$") || password.contains("&") || password.contains("_")))
        //or !(password.contains("!") && password.contains("@") && password.contains("$") && password.contains("&") && password.contains("_")))
        throw new IllegalArgumentException();
    }

    // Throw IllegalArgumentException if String email is null or it does not contain character @
    private static void validateEmail(String email) {
        if (email == null || !email.contains("@"))
            throw new IllegalArgumentException();
    }


    // public static class InvallidAgeException extends RuntimeException {
        
    // }

}
