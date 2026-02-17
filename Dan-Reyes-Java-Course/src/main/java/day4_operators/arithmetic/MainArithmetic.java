package day4_operators.arithmetic;

public class MainArithmetic {

    public static void main(String[] args) {

        String employeeName = "Dan";
        double salary = 50000.75;
        double hourlyRate = 500.95;
        int hoursOfWork = 8;
        int yearsOfExperience = 7;
        double governmentTax = 5000.25;

        System.out.println("Employee name: " + employeeName);
        System.out.println();

        //addition
        double bonus = 25000.75;
        double totalPay = salary + bonus;
        System.out.println("1. Addition");
        System.out.println(" - Total Gross Pay: " + totalPay);
        System.out.println();

        //subtraction
        double netPay = salary - governmentTax;
        System.out.println("2. Subtraction");
        System.out.println(" - Total Net Pay: " + netPay);
        System.out.println();

        //multiplication
        double dailyIncome = hourlyRate * hoursOfWork;
        System.out.println("3. Multiplication");
        System.out.println(" - Daily Income: " + dailyIncome);
        System.out.println();

        //division
        double averageSalaryIncreasePerYear = salary / yearsOfExperience;
        System.out.println("4. Division");
        System.out.println(" - Average Salary per Annum: " + averageSalaryIncreasePerYear);
        System.out.println();

        //modulus %
        int nextPayRaise = 365 %  90;
        System.out.println("5. Modulus");
        System.out.println(" - Days until next pay raise: " + nextPayRaise);
        System.out.println();
    }
}
