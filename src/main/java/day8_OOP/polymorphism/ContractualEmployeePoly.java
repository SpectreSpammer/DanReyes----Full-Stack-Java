package day8_OOP.polymorphism;

public class ContractualEmployeePoly implements EmployeeInterfacePoly {

    private String name;
    private int id;
    private double salary;
    private double overtimePay;
    private int workingHours;

    public ContractualEmployeePoly(String name, int id, double salary, double overtimePay, int workingHours) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.overtimePay = overtimePay;
        this.workingHours = workingHours;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public double salary() {
        return salary;
    }

    @Override
    public double calculateSalary() {
        return salary + (overtimePay * workingHours);
    }
}
