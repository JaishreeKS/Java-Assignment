import java.util.Scanner;
public class LargestOfTenNumbers{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int Largest=0;
		int Counter=0;
     		while(Counter<10){
			int number=scanner.nextInt();
                        
			
			if(number>Largest){
				Largest=number;
			}
			Counter++;
		}

		System.out.println("Largest number is " + Largest);
          }
}
