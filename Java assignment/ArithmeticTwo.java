import java.util.Scanner;
public class ArithmeticTwo{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int num1 = scanner.nextInt();
                System.out.println("Enter the second number: ");
		int num2 = scanner.nextInt();
		System.out.println("Enter the third number: ");
		int num3 = scanner.nextInt();

		if (num1>num2 && num1>num3){
			System.out.println(num1 + " is greatest");
		}
		else if(num2>num3){
			System.out.println(num2 + " is greatest");
		}
		else{
			System.out.println(num3 + " is greatest");
		}

		System.out.println("Sum is: " + (num1+num2+num3));
		System.out.println("Average is: " + (num1+num2+num3)/3);
		System.out.println("Product is: " + (num1*num2*num3));
     }
}

		
