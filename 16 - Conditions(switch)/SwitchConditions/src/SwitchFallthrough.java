import java.util.Scanner;

public class SwitchFallthrough {
    public static void main(String[] args) {
        System.out.println("Do you want to proceed (y/n): ");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        switch (input) {
            case "y":
                System.out.println("Proceeding ... ");
                break;
            case "n":
                System.out.println("Not proceeding.");
                break;
            default:
                System.out.println("Unrecognized option");
                break;
        }

    }
}
