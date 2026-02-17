package day4_operators.Comparison;

public class MainComparison {
    public static void main(String[] args) {

        String employeeName = "Dan";
        double salary = 50000.75;
        double hourlyRate = 500.75;
        int hoursOfWork = 8;
        int yearsOfExperience = 7;


        System.out.println("Employee name: " + employeeName);
        System.out.println();

        //==
        if(yearsOfExperience == 10){
            System.out.println(employeeName + " has reached 1 decade in the company.");
        }else {
            System.out.println(employeeName + " has not reached 1 decade in the company.");
        }

        //!=
        if(salary != 50000){
            System.out.println(employeeName + " is not earning P50,000 per month.");
        }else {
            System.out.println(employeeName + " is earning P50,000 per month.");
        }

        //>
        if(hoursOfWork > 8){
            System.out.println(employeeName + " is having an overtime.");
        }else {
            System.out.println(employeeName + " is not having an overtime.");
        }

        //<
        if(hourlyRate < 500){
            System.out.println(employeeName + " is working in provincial rate.");
        }else {
            System.out.println(employeeName + " is not working in provincial rate.");
        }

        // >=
        if(hoursOfWork >= 8){
            System.out.println(employeeName + " is having an overtime.");
        }else {
            System.out.println(employeeName + " is not having an overtime.");
        }

        //<=
        if(hourlyRate <= 500){
            System.out.println(employeeName + " is working in provincial rate.");
        }else {
            System.out.println(employeeName + " is not working in provincial rate.");
        }
    }
}
