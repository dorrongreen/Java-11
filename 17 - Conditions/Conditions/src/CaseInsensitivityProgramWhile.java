import java.util.Scanner;

public class CaseInsensitivityProgramWhile {
    public static void main(String[] args) {
        final String STOP = "stop";
        final String START = "start";
        final String QUIT = "quit";

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a command >");
            String input = scanner.nextLine();

            if (input.length() != 0) {
                if (input.equalsIgnoreCase(START)) {
                    System.out.println("Machine starting ....");
                } else if (input.equalsIgnoreCase(STOP)) {
                    System.out.println("Machine stopping ....");
                } else if (input.equalsIgnoreCase(QUIT)) {
                    break;
                } else {
                    System.out.println("Unrecognized command.");
                }
            }

        }
        scanner.close();
    }
}
