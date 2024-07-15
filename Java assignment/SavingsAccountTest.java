import java.util.Scanner;

public class SavingsAccountTest{

    public static class SavingsAccount{
        private static double annualInterestRate;
        private double savingsBalance;
        public SavingsAccount(double savingsBalance) {
            this.savingsBalance = savingsBalance;
        }

        public void calculateMonthlyInterest() {
            double monthlyInterest = (savingsBalance * annualInterestRate)/12;
            savingsBalance += monthlyInterest;
        }

        public double getSavingsBalance() {
            return savingsBalance;
        }

        public static void modifyInterestRate(double newInterestRate) {
            annualInterestRate = newInterestRate;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);
        SavingsAccount.modifyInterestRate(0.04);

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.printf("Saver 1 balance after 4%% interest: $%.2f%n", saver1.getSavingsBalance());
        System.out.printf("Saver 2 balance after 4%% interest: $%.2f%n", saver2.getSavingsBalance());

        SavingsAccount.modifyInterestRate(0.05);

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.printf("Saver 1 balance after 5%% interest: $%.2f%n", saver1.getSavingsBalance());
        System.out.printf("Saver 2 balance after 5%% interest: $%.2f%n", saver2.getSavingsBalance());
    }
}

