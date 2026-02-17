package day8_OOP.abstraction;

public class MainAbstraction {
    public static void main(String[] args) {

       EmployeeAbstraction fte = new FullTimeEmployeeAbstract(101,"Nan",70000.75, 45000);
       fte.displayEmployeeInfo();
       fte.displayTotalSalary();

        System.out.println();
        EmployeeAbstraction contractual = new ContractualEmployeeAbstract(102,"Dan",90000.75, 500,4);
        contractual.displayEmployeeInfo();
        contractual.displayTotalSalary();


    }
}
