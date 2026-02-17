package day4_operators.Ternary;

public class MainTernary {
    public static void main(String[] args) {

        int age = 30;
        System.out.println(age > 65 ? "retired" : "not yet retired");

        boolean isReceivedThe13thMonth = true;
        String receivedBonus = isReceivedThe13thMonth ? " recieve bonus " : " not yet received the bonus";
        System.out.println("Dan has " + receivedBonus);
    }
}
