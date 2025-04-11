public class FahrenheitFormatSpecifier {
    public static void main(String[] args) {
        double fahrenheit = 91;
        double celsius = (fahrenheit - 32) * (5.0 / 9.0);

        /*
         * Format Specifiers serve as placeholders for the variable.
         */
        System.out.printf("%.1f degrees Fahrenheit is %.1f degrees celsius.\n",fahrenheit,celsius);

        
    }
}
