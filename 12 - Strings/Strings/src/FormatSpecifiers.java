public class FormatSpecifiers {
    public static void main(String[] args) {
     

        double value = 1.23458;
        /*
         * Format specifiers
         * %.2f = 2 decimal places
         * %.3f = 3 decimal places
         * 
         * PlaceHolders
         * %s %d = Hello 123
         * %s%d = Hello123
         * %d = "format as decimal"
         */
        System.out.printf("Hello %.2f\n", value);
        System.out.printf("Hello %d\n", 123);
        System.out.printf("%s %d\n", "Hello", 123);
    }

}
