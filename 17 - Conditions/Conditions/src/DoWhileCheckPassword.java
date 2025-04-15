import java.util.Scanner;

public class DoWhileCheckPassword {
    public static void main(String[] args) {
        
    System.out.println("Enter a desired password > ");
    Scanner scanner = new Scanner(System.in);
    final String USER_PASSWORD = scanner.nextLine();

   String checkPassword = null;
    do{
        System.out.println("Enter the correct password > ");
        checkPassword = scanner.nextLine();

    }while(!USER_PASSWORD.equals(checkPassword));

    scanner.close();

    System.out.println("Access granted");
    }
}
