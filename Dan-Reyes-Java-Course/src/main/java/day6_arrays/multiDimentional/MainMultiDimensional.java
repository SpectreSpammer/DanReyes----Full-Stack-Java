package day6_arrays.multiDimentional;

import java.util.Arrays;

public class MainMultiDimensional {
    public static void main(String[] args) {
        //object
        Object [][] employeeInformation = {
                {"Dan",70000.50, true, 9,'M',400.25},
                {"Nan",80000.50, false, 12,'M',600.50},
                {"Nami",90000.50, false, 10,'F',800.75},
                {"Zorro",100000.50, true, 5,'M',1000.45}
        };
        displayEmployeeInformation(employeeInformation);
        System.out.println();
        /*
        for(Object[] empInfo : employeeInformation){
            System.out.println("Employee Information: " + Arrays.toString(empInfo));
        }
         */


        //increase all employees by 10% for those > 10 years of experience/service
        System.out.println("Increase all employees >10 years of experience/service");
        for(int i=0; i<employeeInformation.length;i++){
            if((int)employeeInformation[i][3] >= 10){
                double originalSalary = (double)employeeInformation[i][1];
                employeeInformation[i][1] = (double)employeeInformation[i][1] *1.10;

                System.out.printf("%s received a 10%% raise. Original salary: Php %.2f, New salary after increase: Php %.2f %n",
                        employeeInformation[i][0],                              originalSalary,     employeeInformation[i][1]);
            }
        }
    }

    private static void displayEmployeeInformation(Object[][] employeeInformation) {
        for(Object[] empInfo : employeeInformation){
            System.out.printf("%nName: " + empInfo[0]);
            System.out.printf("%nSalary: Php " + empInfo[1]);
            System.out.printf("%nisLate: " + empInfo[2]);
            System.out.printf("%nYears of Service: " + empInfo[3]);
            System.out.printf("%nSex: " + empInfo[4]);
            System.out.printf("%nHourly Rate: " + empInfo[5]);
            System.out.println();

        }
    }


}
