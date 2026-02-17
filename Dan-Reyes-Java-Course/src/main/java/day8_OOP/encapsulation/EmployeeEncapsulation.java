package day8_OOP.encapsulation;

public class EmployeeEncapsulation {

    private int id;
    private String name;
    private double salary;

    public EmployeeEncapsulation(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {

        if(salary > 0){
            this.salary = salary;
        }else {
            System.out.println("Salary must be greater than zero");
        }
    }


    public void salaryIncreaseByPercentage(double percentage) {

        if(percentage > 0){
            this.salary *= (percentage / 100);

            System.out.println();
            System.out.println(name + " received a " + percentage + " % raise");
            System.out.println("New Salary: " + salary);
            System.out.println();
        }else {
            System.out.println("Raise percentage must be greater than zero");
        }
    }
}
