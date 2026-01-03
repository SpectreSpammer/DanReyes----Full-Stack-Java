package day8_OOP.polymorphism;

public class FullTimeEmployeePoly implements EmployeeInterfacePoly {

    private String name;
    private int id;
    private double salary;
    private double bonus;


    public FullTimeEmployeePoly(String name, int id, double salary, double bonus) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.bonus = bonus;
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
        return salary + bonus;
    }
}
