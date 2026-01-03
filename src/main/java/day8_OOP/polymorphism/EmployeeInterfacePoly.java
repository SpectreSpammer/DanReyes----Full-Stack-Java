package day8_OOP.polymorphism;

public interface EmployeeInterfacePoly {

    String getName();
    int getId();
    double salary();
    double calculateSalary();

    default void displayEmployeeInfo(){
        System.out.println("Id: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Net Salary: " + calculateSalary());
    }
}
