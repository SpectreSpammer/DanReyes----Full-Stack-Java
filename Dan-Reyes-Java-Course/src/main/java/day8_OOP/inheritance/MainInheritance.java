package day8_OOP.inheritance;

public class MainInheritance {
    public static void main(String[] args) {

        //interace / abstract class = new Object
        EmployeeInheritance regularEmployee = new EmployeeInheritance(101,"Dan", 60000.75);
        System.out.println("Regular Employee:");
        regularEmployee.displayEmployeeInfo();
        regularEmployee.calculateSalary();

        System.out.println();

        // Object = new Object
        FullTimeEmployeeInheritance fte = new FullTimeEmployeeInheritance(102,"Nan",50000.75,25000.25);
        System.out.println("Full Time  Employee:");
        fte.displayEmployeeInfo();
        fte.calculateSalary();

        System.out.println();

        ContractualEmployeeInheritance contractual = new ContractualEmployeeInheritance(103,"Luffy",70000.75,200.25,3);
        System.out.println("Full Time  Employee:");
        contractual.displayEmployeeInfo();
        contractual.calculateSalary();


    }
}
