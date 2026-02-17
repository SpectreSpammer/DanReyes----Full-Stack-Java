package day5_control_flow.loopStatement;

public class MainForLoop {
    public static void main(String[] args) {

        double salary = 50000;

        System.out.println("Salary Increase per year");
        for(int year = 1; year <=5; year++) {
            if (year == 3) {
                System.out.println("Skipping year 3 due to company policy");
                break;

            }
            salary *= 1.05;
            System.out.printf("Year %d Php %.2f %n",
                    year, salary);
        }
    }
}
