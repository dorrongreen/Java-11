public class Increment {
    public static void main(String[] args) {
        int count = 0;

        count = count + 1;

        System.out.println(count);
        
        count += 1;

        System.out.println(count);

        //postfix
        count++;

        System.out.println(count);
        //prefix
        ++count;

        System.out.println(count);
    }
}
