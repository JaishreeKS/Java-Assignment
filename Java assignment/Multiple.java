import java.util.Scanner;
public class Multiple{
	public static void main(String[] args){
 		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int num1 = scanner.nextInt();
		System.out.println("Enter second number: ");
		int num2 = scanner.nextInt();	
		if (num2 % num1 == 0){
			System.out.println(num1 + " is a multiple of " + num2);
		}
		else{
			System.out.println("Not a Multiple");
		}
	}
}

			