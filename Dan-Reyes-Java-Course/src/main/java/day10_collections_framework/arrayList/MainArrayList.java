package day10_collections_framework.arrayList;

public class MainArrayList {
    public static void main(String[] args) {

//        EmployeeTreeSets employees = new EmployeeTreeSets(101,"Dan","IT");

        EmployeeServiceArrayList employees = new EmployeeServiceArrayList();

        employees.addEmployee(new EmployeeArrayList(101,"Dan","IT"));
        employees.addEmployee(new EmployeeArrayList(102,"Nan","Security"));
        employees.addEmployee(new EmployeeArrayList(103,"Usopp","Accounting"));
        employees.addEmployee(new EmployeeArrayList(104,"Nami","Marketing"));
        employees.addEmployee(new EmployeeArrayList(105,"Robin","HR"));

        System.out.println("-----After adding of employees-----");
        employees.printAllEmployees();
        System.out.println();

        System.out.println("-----After adding first employee in first index -----");
        employees.addEmployeeByFirstIndex(new EmployeeArrayList(106,"Luffyy","Head of Security"));
        employees.printAllEmployees();
        System.out.println();

        System.out.println("-----After adding last employee in last index -----");
        employees.addEmployeeByLastIndex(new EmployeeArrayList(105,"Robin","HR"));
        employees.printAllEmployees();
        System.out.println();

        System.out.println("-----After adding middle employee in 2nd index -----");
        employees.addEmployeeByIndex(2,new EmployeeArrayList(107,"Sanji","Kitchen"));
        employees.printAllEmployees();
        System.out.println();

        System.out.println("-----Update employee in 2nd index -----");
        employees.updateEmployeeByIndex(7,new EmployeeArrayList(108,"Chopper","Clinic"));
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
