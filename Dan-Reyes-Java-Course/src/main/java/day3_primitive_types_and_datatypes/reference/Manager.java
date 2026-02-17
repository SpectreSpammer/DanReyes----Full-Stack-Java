package day3_primitive_types_and_datatypes.reference;

public class Manager implements Employee {
    @Override
    public void work() {
        System.out.println("Manager is forseeing the project.");
    }

    @Override
    public void takeBreak() {
        System.out.println("Manager is having his lunch.");
    }

    @Override
    public void attendMeeting() {
        System.out.println("Manager is facilitating the meeting.");
    }
}
