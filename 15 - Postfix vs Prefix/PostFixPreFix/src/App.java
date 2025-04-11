public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Postfix
         * Increment after use.
         */
        int cats = 5;
        System.out.println(cats++);
        System.out.println(cats);

        /*
         * Prefix
         * Increment before use.
         */
    
        int dogs = 3;
        System.out.println(++dogs);

        int giraffes = 10;
        int animals = cats + giraffes++;

        System.out.println(animals);

        int apples = 5;
        int bananas = 4;

        int fruits = ++apples + bananas++;
        System.out.println(fruits);
    }
}
