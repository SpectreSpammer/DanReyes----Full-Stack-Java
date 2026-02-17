package day8_OOP.encapsulation;

public class MainEncapsulation {
    public static void main(String[] args) {

        EmployeeEncapsulation employee = new EmployeeEncapsulation(101,"Dan", 90000.75);

        System.out.println("Id:" + employee.getId());
        System.out.println("Name:" + employee.getName());
        System.out.println("Salary:" + employee.getSalary());

        System.out.println();


        employee.setName("Dan Reyes");
        employee.setSalary(100000.75);

        System.out.println();

        employee.setSalary(-10000);

        System.out.println();

        employee.salaryIncreaseByPercentage(10);

        System.out.println();


        System.out.println("Updated Id:" + employee.getId());
        System.out.println("Updated Name:" + employee.getName());
        System.out.println("Updated Salary:" + employee.getSalary());
    }
}
