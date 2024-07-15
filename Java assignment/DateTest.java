import java.util.Scanner;
public class DateTest{

    public static class Date{
        private int month;
        private int day;
        private int year;

        public Date(int month, int day, int year) {
            this.month = month;
            this.day = day;
            this.year = year;
        }

        public int getMonth() {
            return month;
        }
        public void setMonth(int month) {
            this.month = month;
        }

        public int getDay() {
            return day;
        }
        public void setDay(int day) {
            this.day = day;
        }

        public int getYear() {
            return year;
        }
        public void setYear(int year) {
            this.year = year;
        }

        public void displayDate() {
            System.out.println(month + "/" + day + "/" + year);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month: ");
        int month = scanner.nextInt();
        System.out.print("Enter day: ");
        int day = scanner.nextInt();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        Date date = new Date(month, day, year);

        System.out.print("The date is: ");
        date.displayDate();

        System.out.print("\nEnter new month: ");
        date.setMonth(scanner.nextInt());
        System.out.print("Enter new day: ");
        date.setDay(scanner.nextInt());
        System.out.print("Enter new year: ");
        date.setYear(scanner.nextInt());
        System.out.print("The updated date is: ");
        date.displayDate();
    }
}

