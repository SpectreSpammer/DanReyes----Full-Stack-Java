package day6_arrays.declaringAndInitializing;

public class MainDeclaringAndInitializing {
    public static void main(String[] args) {

        //String
        String [] employeeNames = {"Dan","Nan","Luffy"};
        for(String empNames : employeeNames){
            System.out.println("List of Employees: " + empNames);
        }
        System.out.println();

        //double
        double [] salary = {50000.75,60000.25,70000.50};
        for(double baseSalary : salary){
            System.out.println("Salaries: " + baseSalary);
        }
        System.out.println();

        //object
        Object [] employeeInformation = {"Dan",70000.50, true, 9,'M',400.25};
        for(Object empInfo : employeeInformation){
            System.out.println("Employee Information: " + empInfo);
        }

    }
}
