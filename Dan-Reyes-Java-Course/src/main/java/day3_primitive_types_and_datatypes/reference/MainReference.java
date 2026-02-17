package day3_primitive_types_and_datatypes.reference;

public class MainReference {
    public static void main(String[] args) {

        //creating an object for the interface
        Employee designer = new Designer();
        Employee developer = new Developer();
        Employee manager = new Manager();

        //array of employee
        Employee[] employees = {designer,developer,manager};


        //for each to print the objects
        for(Employee employee : employees){
            employee.work();
            employee.takeBreak();
            employee.attendMeeting();
            System.out.println();
        }
    }
}
