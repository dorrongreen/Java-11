public class Break {
    public static void main(String[] args) throws Exception {
        

        int count = 0;

        while(count < 10){
            System.out.println("Hello. " + count);

            if (count == 5){
                break;
            }
            System.out.println("How are you.");
            count++;
        }
        System.out.println("Program finished.");
    }
}
