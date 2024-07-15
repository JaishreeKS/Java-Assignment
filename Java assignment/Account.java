import java.util.Scanner;

public class Account {

  private double balance;
  public Account(double initialBalance) {
    this.balance = initialBalance;
  }

  public void debit(double amount) {
    if (amount > balance) {
      System.out.println("Debit amount exceeded account balance.");
    } else {
      balance -= amount;
      System.out.println("Debited Rs." + amount + ". \nNew balance: Rs." + balance);
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter initial balance: ");
    double initialBalance = scanner.nextDouble();

    Account account = new Account(initialBalance);
    System.out.print("Enter debit amount: ");
    double debitAmount = scanner.nextDouble();

    account.debit(debitAmount);
  }
}
