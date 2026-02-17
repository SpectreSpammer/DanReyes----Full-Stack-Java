package day8_OOP.abstraction;

public class FullTimeEmployeeAbstract extends EmployeeAbstraction{

    private double bonus;

    public FullTimeEmployeeAbstract(int id, String name, double salary, double bonus) {
        super(id, name, salary);
        this.bonus = bonus;
    }

    @Override
    double calculateSalary() {
        return salary + bonus ;
    }
}
