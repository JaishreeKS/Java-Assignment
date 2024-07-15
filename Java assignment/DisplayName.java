import java.util.Scanner;
public class DisplayName{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String str = scanner.nextLine();
        System.out.println("My name is: "+ str);
    }
}