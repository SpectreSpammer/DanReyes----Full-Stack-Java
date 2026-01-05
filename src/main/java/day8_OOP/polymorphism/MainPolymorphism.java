package day8_OOP.polymorphism;

public class MainPolymorphism {
    public static void main(String[] args) {

        EmployeeInterfacePoly fte = new FullTimeEmployeePoly("Nan",102,60000.75,30000);
       fte.displayEmployeeInfo();
        System.out.println();
        EmployeeInterfacePoly contractual = new ContractualEmployeePoly("Dan",101,60000.75,3000.25,5);
        contractual.displayEmployeeInfo();
    }
}
