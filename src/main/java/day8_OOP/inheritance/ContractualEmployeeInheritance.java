package day8_OOP.inheritance;

public class ContractualEmployeeInheritance extends EmployeeInheritance {

    private double hourlyRate;
    private  int workingHours;

    public ContractualEmployeeInheritance(int id, String name, double salary, double hourlyRate, int workingHours) {
        super(id, name, salary);
        this.hourlyRate = hourlyRate;
        this.workingHours = workingHours;
    }

    @Override
    public double calculateSalary(){
       return super.calculateSalary() + (hourlyRate * workingHours);
    }

    @Override
    public void displayEmployeeInfo(){
        super.displayEmployeeInfo();
        System.out.println("Hourly Rate: Php: " + hourlyRate );
        System.out.println("Working Hours " + workingHours );
    }

}
