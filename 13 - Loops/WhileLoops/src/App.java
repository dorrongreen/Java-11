public class App {
    public static void main(String[] args) throws Exception {
        int counter = 0;
        while (counter < 10) {
            System.out.printf("Counter: %d\n", counter);

            // Take counter add 1 to it and then set the new value to counter
            counter = counter + 1;

        }
        int num = 1;
        while (num <= 5) {
            System.out.printf("Hello: %d\n", num);

            // Take counter add 1 to it and then set the new value to counter
            num += 1;

        }
    }
}
