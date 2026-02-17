package day5_control_flow.decisionMaking;

public class MainSwitchStatement {
    public static void main(String[] args) {

        String employeeName = "Dan";

        int yearsOfExperience = 2;

        System.out.println("Employee Name: " + employeeName);
        System.out.println();

        switch (yearsOfExperience){
            case 0 :
            case 1:
                System.out.println(" Employee Level: Trainee");
                break;

            case 2:
            case 3:
                System.out.println(" Employee Level: Junior");
                break;

            case 4:
            case 5:
                System.out.println(" Employee Level: Mid");
                break;


            case 6:
            case 7:
                System.out.println(" Employee Level: Senior");
                break;

            default:
                System.out.println(" Employee Level: Expert");
        }
    }
}
