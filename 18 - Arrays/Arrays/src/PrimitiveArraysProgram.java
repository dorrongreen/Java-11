import java.util.Scanner;

public class PrimitiveArraysProgram {
    public static void main(String[] args) {

        int[] numbers = new int[3];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {

            int input = 0;

            if (i == 0) {
                System.out.print("Enter 1st number > ");
                input = scanner.nextInt();
                // System.out.print("Test: " + input);

                numbers[i] = input;
            } else if (i == 1) {
                System.out.print("Enter 2nd number > ");
                input = scanner.nextInt();
                // System.out.println("Test: " + input);

                numbers[i] = input;

            } else if (i == 2) {
                System.out.print("Enter 3rd number > ");
                input = scanner.nextInt();
                // System.out.println("Test: " + input);
                numbers[i] = input;
                // System.out.println("What the helly" + numbers[i]);
            }

        }
        scanner.close();
        int total = 0;

        System.out.println("Here are the results: ");
        for (int i = 0; i < 3; i++) {
            
            total += numbers[i];
            System.out.println(numbers[i]);
            if (i == 2){
                // total += numbers[i];
                System.out.println("Total: "+ total);
            }

        }

    }
}
