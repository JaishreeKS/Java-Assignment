a.)

import java.util.Scanner;
public class ArrayOperations{
	public static void main(String args[]){
		int arr[] = new int[10];
		for(int i = 0; i<10 ; i++){
			arr[i] = 0;
		}
		for(int i = 0; i < 10; i++){
			System.out.print(arr[i] + " ");
		}
	}
}


b.)
public class ArrayOperations{
	public static void main(String args[]){
		int arr[] = new int[15];
		for(int i = 0; i<15 ; i++){
			arr[i] = 0;
		}
		for(int i = 0; i < 15; i++){
			arr[i] += 1;
		}
		for(int i = 0; i < 15; i++){
			System.out.print(arr[i] + " ");
		}
	}
}

c.)
import java.util.Scanner;
public class ArrayOperations{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		int bestScores[] = new int[5];
		for(int i = 0; i<5 ; i++){
			int number = scanner.nextInt();
			bestScores[i] = number;
		}
		for(int i = 0; i < 5; i++){
			System.out.println(bestScores[i]);
		}
	}
}