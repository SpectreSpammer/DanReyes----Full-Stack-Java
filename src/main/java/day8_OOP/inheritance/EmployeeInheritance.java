package day8_OOP.inheritance;

public class EmployeeInheritance {

    protected int id;
    protected String name;
    protected double salary;

    public EmployeeInheritance(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }


    public double calculateSalary(){
        return salary;
    }

    public void displayEmployeeInfo(){
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Base Salary: " + salary);
        System.out.println("New Salary: " + calculateSalary());
    }

}
