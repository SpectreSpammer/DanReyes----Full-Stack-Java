package day4_operators.logical;

public class MainLogical {
    public static void main(String[] args) {


        String employeeName = "Dan";
        double salary = 50000.75;
        double bonus = 50000.75;
        double hourlyRate = 500.75;
        int hoursOfWork = 8;
        int yearsOfExperience = 2;

        // >=
        // false && true
        if(hoursOfWork > 8 && salary < 60000){
            System.out.println(employeeName + " has worked 40hrs a week and his salary is less than 60k.");
        }else {
            System.out.println(employeeName + " is under time and his salary is more than 60k.");
        }

        //<=
        // false || false
        if(yearsOfExperience < 5 || salary > 100000){
            System.out.println(employeeName + " is either a mid developer or highly paid.");
        }else {
            System.out.println(employeeName + " is neither a mid developer or highly paid.");;
        }

        // !=
        if(salary != bonus ){
            System.out.println(employeeName + " bonus is not equal to the 13th month.");
        }else {
            System.out.println(employeeName + " bonus is equal to the 13th month.");
        }
    }
}
