package day5_control_flow.loopStatement;

public class MainDoWhile {
    public static void main(String[] args) {
        /*
            *do this before the validation
         */

        int trainingModule = 3;

        System.out.println("Training module");
        do{
            trainingModule++;
            //3+1
            System.out.println("Completed Module: " + trainingModule);

        }while (trainingModule <5);

        System.out.println("All required modules has been completed.");
    }
}
