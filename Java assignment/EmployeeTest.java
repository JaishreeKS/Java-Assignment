import java.util.Scanner;
public class EmployeeTest{

    public static class Employee{
        private String firstName;
        private String lastName;
        private double monthlySalary;

        public Employee(String firstName, String lastName, double monthlySalary){
            this.firstName = firstName;
            this.lastName = lastName;
            setMonthlySalary(monthlySalary);
        }

        public String getFirstName(){
            return firstName;
        }
        public void setFirstName(String firstName){
            this.firstName = firstName;
        }

        public String getLastName(){
            return lastName;
        }
        public void setLastName(String lastName){
            this.lastName = lastName;
        }

        public double getMonthlySalary(){
            return monthlySalary;
        }
        public void setMonthlySalary(double monthlySalary){
            if (monthlySalary > 0) {
                this.monthlySalary = monthlySalary;
            }
            else{
                this.monthlySalary = 0.0;
            }
        }

        public double getYearlySalary() {
            return monthlySalary * 12;
        }

        public void giveRaise(double percentage) {
            if (percentage > 0) {
                this.monthlySalary += this.monthlySalary * percentage / 100;
            }
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first name of employee 1: ");
        String firstName1 = scanner.nextLine();
        System.out.print("Enter last name of employee 1: ");
        String lastName1 = scanner.nextLine();
        System.out.print("Enter monthly salary of employee 1: ");
        double monthlySalary1 = scanner.nextDouble();
        scanner.nextLine();
        Employee employee1 = new Employee(firstName1, lastName1, monthlySalary1);

        System.out.print("Enter first name of employee 2: ");
        String firstName2 = scanner.nextLine();
        System.out.print("Enter last name of employee 2: ");
        String lastName2 = scanner.nextLine();

        System.out.print("Enter monthly salary of employee 2: ");
        double monthlySalary2 = scanner.nextDouble();

        Employee employee2 = new Employee(firstName2, lastName2, monthlySalary2);

        System.out.println("\nYearly Salaries:");
        System.out.println(employee1.getFirstName() + " " + employee1.getLastName() + ": Rs." + employee1.getYearlySalary());
        System.out.println(employee2.getFirstName() + " " + employee2.getLastName() + ": Rs." + employee2.getYearlySalary());

        employee1.giveRaise(10);
        employee2.giveRaise(10);

        System.out.println("\nYearly Salaries after 10% raise: ");
        System.out.println(employee1.getFirstName() + " " + employee1.getLastName() + ": Rs." + employee1.getYearlySalary());
        System.out.println(employee2.getFirstName() + " " + employee2.getLastName() + ": Rs." + employee2.getYearlySalary());

    }
}

