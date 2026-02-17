package day9_exception.customizedException;

public class MainCustomizedException {
    public static void main(String[] args) throws InvalidRaiseException {

        EmployeeException employee = new EmployeeException("Dan",100000.75);



        try {
            //valid
            employee.raiseSalary(30);
            System.out.println("30% raise successful.");

            //invalid
            employee.raiseSalary(101);
            System.out.println("This percentage salary wont be printed out.");
        } catch (InvalidRaiseException e) {
            System.out.println("Error: " + e.getMessage());
        }finally {
            System.out.println("Salary processing is completed.");
        }

        System.out.println();

        employee.raiseSalary(10);
        System.out.println("Current salary: " + employee.getSalary());
        System.out.println();

        employee.raiseSalary(-10);
        System.out.println("Current salary: " + employee.getSalary());



    }
}
