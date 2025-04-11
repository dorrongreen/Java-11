public class OutputtingAMenu {
    public static void main(String[] args) {
        /*
         * Challenge
         * Select an option:
         * 1. Add an entry
         * 2. View the data base
         * 3. Exit
         */

        int num = 0;
        String prompt = "\tSelect an option: \n";
        String option1 = "\t\t" + (num + 1) + ". Add an entry\n";
        String option2 = "\t\t" + (num + 2) + ". View the database\n";
        String option3 = "\t\t" + (num + 3) + ". Exit\n";

        System.out.println(prompt + option1 + option2 + option3);
    }
}
