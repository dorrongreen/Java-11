import java.util.Scanner;

public class VariableScope {
    public static void main(String[] args) {
        /*
         * What is scope of a variable?
         * 
         * A: The area where you can refer to a variable and actually use it.
         */

        /*
         * These curly brackets limit the scope of the variable
         * A: I can only refer to this variable inside the curly brackets.
         */
        {
            int value = 0;
            System.out.println(value);
        }

        // the scope of i is inside these curly brackets
        for(int i =0; i<4; i++){

        }

        Scanner scanner = new Scanner(System.in);

        /*
         * if "String input" was declared inside of the "do-while" curly brackets, the code would produce an error.
         * 
         * Why?
         * 
         * A: The scope of the variable is inside the curly brackets.
         * 
         */
        String input = null; 
        do{
            System.out.println("type 'quit' to quit the program");
            input = scanner.nextLine();
        }while(!input.equals("quit"));

        scanner.close();
        System.out.println();
    }
}
