public class ArrayOfStrings {
    public static void main(String[] args) {
        /*
         * 0. Eggs
         * 1. Rice
         * 2. Bell Peppers
         * 3. Cheese
         */

         String[] food = {"Eggs","Rice", "Bell Peppers","Cheese"};

         food[1] = "Onions";

         System.out.println(food[0]);
         System.out.println(food[1]);
         System.out.println(food[2]);
         System.out.println(food[3]);
    }
}
