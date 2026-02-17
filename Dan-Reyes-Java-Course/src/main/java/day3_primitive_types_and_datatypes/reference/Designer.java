package day3_primitive_types_and_datatypes.reference;

public class Designer implements Employee{
    @Override
    public void work() {
        System.out.println("Designer is doing UI design.");
    }

    @Override
    public void takeBreak() {
        System.out.println("Designer is having his walk.");
    }

    @Override
    public void attendMeeting() {
        System.out.println("Designer is presenting the design.");
    }
}
