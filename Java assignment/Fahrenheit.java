import java.util.Scanner;
public class Fahrenheit{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter degree in Fahrenheit: ");
        int fahrenheit = scanner.nextInt();
        double celsius = ((fahrenheit - 32) * (5.0/9.0));
        
        System.out.println("The degree in celsius: " + celsius + " C");
    }
}