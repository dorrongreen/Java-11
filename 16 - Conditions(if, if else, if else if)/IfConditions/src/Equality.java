public class Equality {
    public static void main(String[] args) {
        int cats = 42;
        int dogs = 23;
        int weasels = 42;

        boolean evaluateCatToDogs = cats > dogs;
        System.out.println("More cats then dogs: " + evaluateCatToDogs);
        System.out.printf("Same number of cats and weasels: %b\n", cats == weasels);
        System.out.printf("Same number of cats and dogs: %b\n", cats == dogs);
    }
}
