import java.util.Scanner;

public class FlagProgram {
    public static void main(String[] args) {

        System.out.println("Enter a user password > ");
        Scanner scanner = new Scanner(System.in);
        String passwordHolder = scanner.nextLine();
        int counter = 0;

        for (;;) {
            System.out.println("Enter the correct user password > ");
            String checkPassword = scanner.nextLine();

            if (passwordHolder.equals(checkPassword)) {
                System.out.println("Access granted. ");
                break;
            } else if (counter != 2) {
                counter++;
                System.out.println("Incorrect password. Try again. ");

            } else {
                System.out.println("Access denied. ");
                break;
            }
            scanner.close();
        }

    }
}
