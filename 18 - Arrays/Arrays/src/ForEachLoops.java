import java.util.stream.IntStream;

public class ForEachLoops {
    public static void main(String[] args) {
        int[] numbers = new int[3];

        String[] fruits = {"Banana, Pineapple, Strawberry, Blueberry"};

        for(String fruit: fruits){
            System.out.println(fruit);
        }
    }
}
