package day9_exception.customizedException;

public class EmployeeException {

    private String name;
    private double salary;

    public EmployeeException(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void raiseSalary(double percentage) throws InvalidRaiseException {
        if(percentage < 0 || percentage > 100){
            throw new InvalidRaiseException("Invalid raise percentage. Must be between 0 to 100");
        }
    }

    public double getSalary() {
        return salary;
    }
}
