public class FormattingDecrement {
    public static void main(String[] args) {
        int otters = 5;
        int giraffes = 10;
        int elephants = 3;

        // animals is equal to 5 with postfix
        // store value first then increment
        int animals = otters++;
        // mammals is equal to 7 with prefix
        // increment values then store.
        int mammals = ++otters;

        int fish = --elephants + ++otters + giraffes++ + elephants;

        System.out.printf("Otters: %d\n", otters);
        System.out.printf("Giraffes: %d\n", giraffes);
        System.out.printf("Elephants: %d\n", elephants);
        System.out.printf("Animals: %d\n", animals);
        System.out.printf("Mammals: %d\n", mammals);
        System.out.printf("Fish: %d\n", fish);

    }
}
