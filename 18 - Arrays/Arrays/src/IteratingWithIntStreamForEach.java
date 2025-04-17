import java.util.stream.IntStream;

public class IteratingWithIntStreamForEach {
    public static void main(String[] args) {
        String[] species = { "Cat", "Caterpillar", "Dog" };

        IntStream.range(0, species.length).forEach(i -> {
            System.out.printf("%d. %s\n", i, species[i]);
        });

    }
}
