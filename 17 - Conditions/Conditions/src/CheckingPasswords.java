import java.util.Scanner;

public class CheckingPasswords {
    public static void main(String[] args) {

       

            System.out.println("Enter a desired password > ");
            Scanner scanner = new Scanner(System.in);
            final String USER_PASSWORD = scanner.nextLine();

        while (true) {
            
            System.out.println("Enter the correct password > ");
            String password = scanner.nextLine();
            
            if (USER_PASSWORD.equals(password)) {
                System.out.println("Correct: The passwords match! ");
                break;
            } else {
                System.out.println("Incorrect: The passwords don't match! ");
                
            }
            
        }
        scanner.close();
    }

}
