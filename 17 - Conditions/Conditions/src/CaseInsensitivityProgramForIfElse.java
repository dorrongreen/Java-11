import java.util.Scanner;

public class CaseInsensitivityProgramForIfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // switch (enteredCommand) {
        // case "start" :
        // System.out.println("Machine Starting ....");
        // break;
        // case "stop":
        // System.out.println("Machine stopping ....");
        // break;
        // case "quit":
        // System.out.println("Exiting .... ");
        // case "":
        // System.out.println("Enter a command please > ");
        // default:
        // System.out.println("Unrecognized command");
        // break;
        // }

        for (;;) {
            System.out.println("Enter a command > ");
            String enteredCommand = scanner.nextLine();

            if (enteredCommand.length() == 0) {
                System.out.println("Nice try, enter a command");
            } else if (enteredCommand.equalsIgnoreCase("start")) {
                System.out.println("Machine starting ....");
            } else if (enteredCommand.equalsIgnoreCase("stop")) {
                System.out.println("Machine stopping ....");
            } else if (enteredCommand.equalsIgnoreCase("quit")) {
                System.out.println("Exiting ....");
                scanner.close();
                break;
            } else {
                System.out.println("Unrecognized command.");
            }
        }
        
    }
    
}
