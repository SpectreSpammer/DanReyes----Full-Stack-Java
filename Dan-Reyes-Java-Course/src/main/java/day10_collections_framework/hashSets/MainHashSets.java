package day10_collections_framework.hashSets;

public class MainHashSets {
    public static void main(String[] args) {

//        EmployeeTreeSets employees = new EmployeeTreeSets(101,"Dan","IT");

        EmployeeServiceHashSets employees = new EmployeeServiceHashSets();

        EmployeeHashSets emp1 = new EmployeeHashSets(101,"Dan","IT");
        EmployeeHashSets emp2 = new EmployeeHashSets(102,"Nan","Security");
        EmployeeHashSets emp3 = new EmployeeHashSets(103,"Usopp","Accounting");
        EmployeeHashSets emp4 = new EmployeeHashSets(104,"Nami","Marketing");
        EmployeeHashSets emp5 = new EmployeeHashSets(105,"Robin","HR");

        System.out.println("-----After adding of employees-----");
        System.out.println("Added employee #1: " + employees.addEmployee(emp1));
        System.out.println("Added employee #2: " + employees.addEmployee(emp2));
        System.out.println("Added employee #3: " + employees.addEmployee(emp3));
        System.out.println("Added employee #4: " + employees.addEmployee(emp4));
        System.out.println("Added employee #5: " + employees.addEmployee(emp5));


        employees.printAllEmployees();
        System.out.println();





        System.out.println("-----Remove employee in 4th index -----");
        System.out.println("Removing Employee #4: " + employees.removeEmployee(emp4));
        employees.printAllEmployees();
        System.out.println();

        System.out.println("-----Other Details -----");
        System.out.println("Total Number of Employees: " + employees.getTotalNumberOfEmployees());
        System.out.println("Is the employee empty?: " + employees.isEmployeeEmpty());
        System.out.println();

    }
}
