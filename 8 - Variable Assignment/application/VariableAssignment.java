package application;

public class VariableAssignment {

    public static void main(String[] args) {
        int dogs = 9;
        int cats = 3;

        System.out.println("Dogs: " + dogs);
        System.out.println("Cats: " + cats);

        dogs = cats; // assignment operator
        cats = 10;

        System.out.println("Dogs: " + dogs);
        System.out.println("Cats: " + cats);
    }

}
