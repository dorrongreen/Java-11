/*
 * In the java.util package give me the scanner class.
 */
import java.util.Scanner;


public class UserInputFahrenheit {
    public static void main(String[] args) {
        /*In the system class
         * create a "new instance of " Scanner or a "copy of scanner"
         */
        Scanner scanner = new Scanner(System.in);
        // close the scanner class after use.
        scanner.close();

        System.out.println("Enter value in fahrenheit to convert >");
        double fahrenheit = scanner.nextFloat();
        double celsius = (fahrenheit - 32) * (5.0 / 9.0);

        System.out.printf("%.1f degrees Fahrenheit is %.1f degrees celsius.\n",fahrenheit,celsius);


    }

}
