import java.util.Scanner;
public class ProductOfThreeIntegers{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st integer: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter 2nd integer: ");
        int num2 = scanner.nextInt();
        System.out.println("Enter 3rd integer: ");
        int num3 = scanner.nextInt();
        
        System.out.println("The product is: "+ num1*num2*num3);
    }
}