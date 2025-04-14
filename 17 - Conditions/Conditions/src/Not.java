public class Not {
    public static void main(String[] args) {
        // ! "not operator" unary operator
        System.out.println(!(4==5));


        int value1 = 4;
        int value2 = 3;

        // !(False) = true
        if (!(value1 == value2)){
            System.out.println("Values are not equal");
       
        }

        String fruit1 = "orange";
        String fruit2 = "apple";

        if(!fruit1.equals(fruit2)){
            System.out.println("Fruits are not the same");
        }

        if (fruit1.equals(fruit2) != true){
            System.out.println("Fruits are not the same");
        }

        System.out.println(fruit1.equals(fruit2));
        //does false equal false
        System.out.println(fruit1.equals(fruit2)==false);


    }
}
