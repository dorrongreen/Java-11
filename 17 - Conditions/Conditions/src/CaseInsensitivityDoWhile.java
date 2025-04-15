import java.util.Scanner;

public class CaseInsensitivityDoWhile {
    public static void main(String[] args) {
        final String STOP = "stop";
        final String START = "start";
        final String QUIT = "quit";

        boolean running = true;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter a command >");
            String input = scanner.nextLine();

            if(input.length()== 0){
                System.out.println("You didn't enter anything. Try again.");
                continue;
            }

            if (input.length() != 0) {
                if (input.equalsIgnoreCase(START)) {
                    System.out.println("Machine starting ....");
                } else if (input.equalsIgnoreCase(STOP)) {
                    System.out.println("Machine stopping ....");
                } else if (input.equalsIgnoreCase(QUIT)) {
                    running = false;
                } else {
                    System.out.println("Unrecognized command.");
                }

            }
        } while (running);
        scanner.close();
    }
}
