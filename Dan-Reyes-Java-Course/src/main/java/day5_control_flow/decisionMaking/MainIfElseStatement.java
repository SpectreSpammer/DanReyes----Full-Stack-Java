package day5_control_flow.decisionMaking;

public class MainIfElseStatement {
    public static void main(String[] args) {

        String employeeName = "Dan";
        double salary = 50000.75;

        int hoursOfWork = 8;

        // >=
        // false && true
        if(hoursOfWork > 8 && salary < 60000){
            System.out.println(employeeName + " has worked 40hrs a week and his salary is less than 60k.");
        }else {
            System.out.println(employeeName + " is under time and his salary is more than 60k.");
        }
    }
}
