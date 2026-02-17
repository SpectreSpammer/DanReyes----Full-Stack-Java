package day3_primitive_types_and_datatypes.reference;

public class Developer implements Employee{
    @Override
    public void work() {
        System.out.println("Developer is doing some code.");
    }

    @Override
    public void takeBreak() {
        System.out.println("Developer is having his coffee.");
    }

    @Override
    public void attendMeeting() {
        System.out.println("Developer is attending the meeting.");
    }
}
