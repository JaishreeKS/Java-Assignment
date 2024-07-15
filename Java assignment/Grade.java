import java.util.Scanner;
import java.util.Scanner;

public class Grade {
    public static double Average(int[] grades) {
        int sum = 0;
        double avg;
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }
        avg = sum / (double) grades.length; // Cast to double for accurate division
        return avg;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int grades[] = new int[20];
        int count = 0;
	while (count < grades.length) {
   		 int num = scanner.nextInt();
   		 if (num == -1) {
       			 break; // Exit the loop if -1 is entered
    }
    grades[count] = num;
    count++;
}

        // Check if any grades were entered
        if (count > 0) {
            double average = Average(grades);
            System.out.println("The average is: " + average);
        } else {
            System.out.println("No grades entered.");
        }
    }
}
