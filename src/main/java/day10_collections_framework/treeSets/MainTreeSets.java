package day10_collections_framework.treeSets;

import java.util.Comparator;

public class MainTreeSets {
    public static void main(String[] args) {



        EmployeeServiceTreeSets employees = new EmployeeServiceTreeSets();

        employees.addEmployee(new EmployeeTreeSets(101,"Dan","IT"));
        employees.addEmployee(new EmployeeTreeSets(102,"Nan","Security"));
        employees.addEmployee(new EmployeeTreeSets(103,"Usopp","Accounting"));
        employees.addEmployee(new EmployeeTreeSets(104,"Nami","Marketing"));
        employees.addEmployee(new EmployeeTreeSets(105,"Robin","HR"));

        System.out.println("-----After adding of employees-----");
        employees.printAllEmployees();

        System.out.println();
        System.out.println("First Employee" + employees.getFirstEmployee());
        System.out.println("First Employee" + employees.getLastEmployee());
        System.out.println();


        EmployeeServiceTreeSets employeeByName = new EmployeeServiceTreeSets(
                Comparator.comparing(EmployeeTreeSets::getName)
        );
        employeeByName.addEmployee(new EmployeeTreeSets(201,"Dan","IT"));
        employeeByName.addEmployee(new EmployeeTreeSets(202,"Nan","Security"));
        employeeByName.addEmployee(new EmployeeTreeSets(203,"Usopp","Accounting"));
        employeeByName.addEmployee(new EmployeeTreeSets(204,"Nami","Marketing"));
        employeeByName.addEmployee(new EmployeeTreeSets(205,"Robin","HR"));
        employeeByName.printAllEmployees();

        System.out.println();

        EmployeeServiceTreeSets employeeByDept = new EmployeeServiceTreeSets(
                Comparator.comparing(EmployeeTreeSets::getDept)
        );
        employeeByDept.addEmployee(new EmployeeTreeSets(301,"Dan","IT"));
        employeeByDept.addEmployee(new EmployeeTreeSets(302,"Nan","Security"));
        employeeByDept.addEmployee(new EmployeeTreeSets(303,"Usopp","Accounting"));
        employeeByDept.addEmployee(new EmployeeTreeSets(304,"Nami","Marketing"));
        employeeByDept.addEmployee(new EmployeeTreeSets(305,"Robin","HR"));
        employeeByDept.printAllEmployees();

        System.out.println("-----Other Details -----");
        System.out.println("Total Number of Employees: " + employees.getTotalNumberOfEmployees());
        System.out.println("Is the employee empty?: " + employees.isEmployeeEmpty());
        System.out.println();

    }
}
