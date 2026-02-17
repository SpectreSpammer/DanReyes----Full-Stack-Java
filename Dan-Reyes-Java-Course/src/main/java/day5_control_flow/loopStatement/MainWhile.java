package day5_control_flow.loopStatement;

public class MainWhile {
    public static void main(String[] args) {

        //check validation first then logic

        boolean isPromotionEligible = false;
        int yearsOfService = 2;
        int performanceRating = 9;

        System.out.println("Years until promotion is eligible.");

        while (!isPromotionEligible){
            // false || false && true
            if(yearsOfService >= 10 || (yearsOfService >=5 && performanceRating >= 7)){
                isPromotionEligible = true;
                System.out.println("Employee Assessment is not eligible for promotion");
            }else {
                yearsOfService++;
                System.out.println("Year of service: " + yearsOfService);
            }
        }
    }
}
