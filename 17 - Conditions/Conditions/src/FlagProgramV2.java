import java.util.Scanner;

public class FlagProgramV2 {
    public static void main(String[] args) {
        final String USER_PASSWORD = "hello";
        boolean accessGranted = false;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter password > ");
            String input = scanner.nextLine();

            if (input.equals(USER_PASSWORD)) {
                System.out.println("Access granted. ");
                accessGranted = true;
                break;
            } else {
                System.out.println("Incorrect password. ");
            }
        }
        if (!accessGranted) {
            System.out.println("Access denied. ");
        }
        scanner.close();
    }
}
