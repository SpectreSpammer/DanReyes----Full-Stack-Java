package day10_collections_framework.treeMap;

public class MainTreeMap {
    public static void main(String[] args) {


        EmployeeServiceTreemap employees = new EmployeeServiceTreemap();

        //adding of employees
        employees.addEmployee(new EmployeeTreemap(101,"Dan","IT"));
        employees.addEmployee(new EmployeeTreemap(102,"Nand","Security"));
        employees.addEmployee(new EmployeeTreemap(102,"Nan","Security"));
        employees.addEmployee(new EmployeeTreemap(103,"Usopp","Accounting"));
        employees.addEmployee(new EmployeeTreemap(104,"Nami","Marketing"));
        employees.addEmployee(new EmployeeTreemap(105,"Robin","HR"));


        System.out.println("Display all employees");
        employees.printAllEmployees();
        System.out.println();

        System.out.println("First employee: " + employees.getFirstEmployee());

        System.out.println("Last employee: " + employees.getLastEmployee());

        System.out.println("Employee by Id:");
        int searchById = 102;
        EmployeeTreemap emp = employees.getByEmployeeId(searchById);
        System.out.println("Get employee Id: " + searchById + " : " + emp);
        System.out.println();

        System.out.println("Update Employee by Id:");
        employees.updateEmployeById(102, "luffy", "head of security");
        System.out.println("After updating the employee");
        employees.printAllEmployees();
        System.out.println();

        System.out.println("Remove Employee by Id:");
        employees.removeByEmployeeId(102);
        System.out.println("After removing the employee");
        employees.printAllEmployees();
        System.out.println();

        System.out.println("Employee by Id:");
        int checkId = 102;
        employees.hasEmployee(checkId);
        System.out.println("Check if the employee: + " + checkId + " is exist: " + employees.hasEmployee(102) );
        System.out.println();

        System.out.println("Total number of employees: " + employees.getTotalNumberOfEmployees());

    }
}
