import java.util.Arrays;

public class StreamForEachLoop {
    public static void main(String[] args) {
        String[] animals = {"dog", "bear", "horse"};

        /*
         * Lookup oracle "Java 11 Arrays API documentation" then click "method" at the top.
         */
        Arrays.stream(animals).forEach(animal -> {
            System.out.println(animal);
        });
    }
}
