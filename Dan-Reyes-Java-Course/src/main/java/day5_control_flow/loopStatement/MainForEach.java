package day5_control_flow.loopStatement;

import java.io.FilterOutputStream;
import java.util.List;

public class MainForEach {
    public static void main(String[] args) {

        String [] employeeNames = {"dan","nan","luffy","sanji"};

        double[] salary = {40000.75,50000.25,60000.50,70000.90};

        int [] yearsOfExperience = { 6,3,9,15};

        //for loop
        for(int i = 0; i < employeeNames.length; i++) {
            String name = employeeNames[i];
            double baseSalary = salary[i];
            int  years = yearsOfExperience[i];

            System.out.println("Employee Information");
            System.out.println("Employee Name: " + name);
            System.out.println("Salary: " + baseSalary);
            System.out.println("Years of Experience: " + years);
            System.out.println();
        }


        System.out.println("List of Employees");
        for(String name : employeeNames ){
            System.out.println(" - " + name);
        }

        List<String> listOfEmployees = List.of("dan","nan","luffy","sanji");
        for(String employeeList : listOfEmployees){
            System.out.println("Employees: " + employeeList);
        }


    }
}
