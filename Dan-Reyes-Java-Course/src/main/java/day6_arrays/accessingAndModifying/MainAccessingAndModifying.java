package day6_arrays.accessingAndModifying;

public class MainAccessingAndModifying {
    public static void main(String[] args) {
        String [] employeeNames = {"Dan","Nan","Luffy"};
        double [] salary = {50000.75,60000.25,70000.50};
        int [] yearsOfService = {30,9,12};
        boolean [] isLate = {true,true,false};

        //print out
        for(String empNames : employeeNames){
            System.out.println("List of Employees: " + empNames);
        }
        System.out.println();

        //increase all employees by 10% for those > 10 years of experience/service
        System.out.println("Increase all employees >10 years of experience/service");
        for(int i=0; i<yearsOfService.length;i++){
            if(yearsOfService[i] > 10){
                double originalSalary = salary[i];
                salary[i] *= 1.10;
                System.out.printf("%s received a 10%% raise. Original salary: Php %.2f, New salary after increase: Php %.2f %n",
                                 employeeNames[i],                              originalSalary,     salary[i]);
            }
        }

        System.out.println();
        //salary deduction of 10% for every late
        System.out.println("salary deduction of 10% for every late");
        for(int i=0; i< employeeNames.length;i++){
            if(isLate[i]){
                double originalSalary = salary[i];
                salary[i] -= 1.10;
                System.out.printf("%s was late. Original salary: Php %.2f, New salary after deduction: Php %.2f %n",
                        employeeNames[i],                              originalSalary,     salary[i]);
            }
        }
    }
}
