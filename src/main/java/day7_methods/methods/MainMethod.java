package day7_methods.methods;

public class MainMethod {
    public static void main(String[] args) {


        displayEmployeeInfo("Dan",30);
        System.out.println();
        double salary = calculateSalary(750.75,9);
        System.out.println(" Calling methods with a return value of 'double and int'");
        System.out.println(" - Salary for a day (double + int): " + salary);
        System.out.println();

        System.out.println(" Calling methods with a return value of 'double and String'");
        System.out.println("Salary based on performance: " + calculateSalary(50000.75,"GoOd"));
        System.out.println();

        System.out.println(" Another example of void method with 1 parameter");
        printDepartment("IT");
    }

    private static void printDepartment(String department) {
        System.out.println("Department: " + department);
    }

    //method overloading with return of double and int
    private static double calculateSalary(double hourlyRate, int hoursOfWork) {
        return  hourlyRate * hoursOfWork;
    }

    //method overloading with return of double and int
    private static String calculateSalary(double salary, String performanceRating) {
        double percentageBonus;

        switch (performanceRating.toLowerCase()){
            case "excellent":
                percentageBonus = 0.1;
                break;
            case "good":
                percentageBonus = 0.05;
                break;
            default:
                percentageBonus = 0.03;
                performanceRating = "average";
        }

        double bonusAmount = salary * percentageBonus;
        return String.format("The employee got a bonus of Php %.2f , Performance Rating of %s",
                                                       bonusAmount,             performanceRating);
    }

    private static void displayEmployeeInfo(String name, int age) {
        System.out.println(" Name: " + name);
        System.out.println(" Age: " + age);
    }


}
