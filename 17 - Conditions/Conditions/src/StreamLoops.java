import java.util.stream.IntStream;

public class StreamLoops {
    public static void main(String[] args) {
        /*
         * Another way to form a loop.
         */
        IntStream.range(0, 5).forEach(i -> {
            System.out.println(i);
        });
    }
}
