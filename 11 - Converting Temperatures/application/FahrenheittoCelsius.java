package application;

public class FahrenheittoCelsius {

    public static void main(String[] args) {
        double fahrenheit = 91;
        double celsius = (fahrenheit-32) * (5.0/9.0);

    
        System.out.println(fahrenheit + " degrees Fahrenheit is " + celsius + "degrees celsius. ");
    }

}
