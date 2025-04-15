import java.util.Scanner;

public class Flags {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean gotCodeword = false;
        /* "gotCodeword" to check if the codeword was entered in a program
         * 
         * Flag : A boolean value or some binary value that you use control the flow 
         * or process of a program or how it operates.
         */

        for(;;){
            System.out.print(" > ");
            String input = scanner.nextLine();

            if(input.equals("quit")){
                break;
            }else if(input.equals("volcano")){
                gotCodeword = true;
            }
        }

        scanner.close();
        /*
         * 
         */
        if(gotCodeword) {
            System.out.println("Codeword entered.");
        }
    }

}
