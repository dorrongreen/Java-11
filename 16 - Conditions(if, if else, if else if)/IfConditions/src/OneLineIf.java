public class OneLineIf {
    public static void main(String[] args) {
        boolean isRaining = false;
        
        if(isRaining)
            System.out.println("It's raining");
            /* Because this if statement doesn't use brackets, 
             * the second system out statement gets ran.
             */
        System.out.println("Take an umbrella");
        
    }
}
