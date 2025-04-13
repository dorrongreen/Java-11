import java.util.Scanner;

public class UsingIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter room temperature (F) >");

        double temperatureFahrenheit = scanner.nextFloat();

        double toCelsius = (temperatureFahrenheit - 32) * (5.0 / 9.0);

        System.out.printf("Temperature celsius: %.2f ", toCelsius);

        if (toCelsius < 21) {
            System.out.println("\nToo cold!");
        }
        if (toCelsius > 21) {
            System.out.println("\nWarm enough!");
        }

        if (toCelsius < 21) {
            System.out.println("\nToo cold!");
        } else {
            System.out.println("\nWarm enough!");
        }

    }
}
