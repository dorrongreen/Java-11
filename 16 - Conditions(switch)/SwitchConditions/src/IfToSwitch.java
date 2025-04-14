import java.util.Scanner;

public class IfToSwitch {
    public static void main(String[] args) {
        System.out.println("Menu");
        System.out.println("====");
        System.out.println("\t1. Print 'hello'");
        System.out.println("\t2. How are you?");
        System.out.println("\t3. Exit program\n");
        System.out.println("Enter an option > ");

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        scanner.close();

        if (input > 100) {
            System.out.println("You've found the hidden easter egg! ");
        } else { //Switch statement could be seperated from if-else statement
            switch (input) {
                case 1:
                    System.out.println("Hello");
                    break;
                case 2:
                    System.out.println("How are you? ");
                    break;
                case 3:
                    System.out.println("Exiting ...");
                    System.exit(0);
                    System.out.println("Hellooooo!");
                    break;
                default:
                    System.out.println("Invalid option.");
                    break;
            }
        }

    }
}
