package day10_collections_framework.linkedList;

public class MainLinkedList {
    public static void main(String[] args) {

//        EmployeeTreeSets employees = new EmployeeTreeSets(101,"Dan","IT");

        EmployeeServiceLinkedList employees = new EmployeeServiceLinkedList();

        employees.addEmployee(new EmployeeLinkedList(101,"Dan","IT"));
        employees.addEmployee(new EmployeeLinkedList(102,"Nan","Security"));
        employees.addEmployee(new EmployeeLinkedList(103,"Usopp","Accounting"));
        employees.addEmployee(new EmployeeLinkedList(104,"Nami","Marketing"));
        employees.addEmployee(new EmployeeLinkedList(105,"Robin","HR"));

        System.out.println("-----After adding of employees-----");
        employees.printAllEmployees();
        System.out.println();

        System.out.println("-----After adding first employee in first index -----");
        employees.addEmployeeByFirstIndex(new EmployeeLinkedList(106,"Luffyy","Head of Security"));
        employees.printAllEmployees();
        System.out.println();

        System.out.println("-----After adding last employee in last index -----");
        employees.addEmployeeByLastIndex(new EmployeeLinkedList(105,"Robin","HR"));
        employees.printAllEmployees();
        System.out.println();

        System.out.println("-----After adding middle employee in 2nd index -----");
        employees.addEmployeeByIndex(2,new EmployeeLinkedList(107,"Sanji","Kitchen"));
        employees.printAllEmployees();
        System.out.println();

        System.out.println("-----Update employee in 2nd index -----");
        employees.updateEmployeeByIndex(7,new EmployeeLinkedList(108,"Chopper","Clinic"));
        employees.printAllEmployees();
        System.out.println();

        System.out.println("-----Remove employee in 1st index -----");
        employees.deleteEmployeeByIndex(0);
        employees.printAllEmployees();
        System.out.println();

        System.out.println("-----Other Details -----");
        System.out.println("Total Number of Employees: " + employees.getTotalNumberOfEmployees());
        System.out.println("Is the employee empty?: " + employees.isEmployeeEmpty());
        System.out.println("First employee: " + employees.getFirstEmployee());
        System.out.println("Last employee: " + employees.getLastEmployee());
        System.out.println("Employee at index 4: " + employees.getEmployeeByIndex(4));
        System.out.println();

    }
}
