public class DoWhile {
    public static void main(String[] args) {
        boolean loopCondition = true;
        int count =0;

        do{
            System.out.println("Hello");
            loopCondition = false;
        }
       while(loopCondition);

       System.out.println("Loop2: ");
        do{
            System.out.println("Count is "+ count);
            count++;
        }
        while(count <5);

        System.out.println("Loop3: ");
        count = 0;
        do{
            System.out.println( "Count is "+ count);
            
        }
        while(count++ <5);


    }
}
