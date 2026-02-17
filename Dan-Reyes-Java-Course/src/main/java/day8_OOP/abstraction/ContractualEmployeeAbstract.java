package day8_OOP.abstraction;

public class ContractualEmployeeAbstract extends EmployeeAbstraction{

    private double hourlyRate;
    private int workingHours;

    public ContractualEmployeeAbstract(int id, String name, double salary,double hourlyRate, int workingHours) {
        super(id, name, salary);
        this.hourlyRate = hourlyRate;
        this.workingHours = workingHours;
    }

    @Override
    double calculateSalary() {
        return salary + ( hourlyRate * workingHours);
    }
}
