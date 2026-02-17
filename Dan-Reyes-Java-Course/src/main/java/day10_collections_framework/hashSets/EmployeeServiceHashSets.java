package day10_collections_framework.hashSets;

import java.util.HashSet;

public class EmployeeServiceHashSets {

    private HashSet<EmployeeHashSets> employeeSets = new HashSet<>();



    //add employee object
    public boolean addEmployee(EmployeeHashSets addEmployee){
         return employeeSets.add(addEmployee);
    }

    //delete employee object
    public boolean removeEmployee(EmployeeHashSets employee){
        return employeeSets.remove(employee);
    }

    //contains of employees
    public boolean containsEmployee(EmployeeHashSets employee){
        return employeeSets.contains(employee);
    }

    //total number of employees
    public int getTotalNumberOfEmployees(){
        return employeeSets.size();
    }

    //is employee empty?
    public boolean isEmployeeEmpty(){
        return employeeSets.isEmpty();
    }

    //printing all the employees
    public void printAllEmployees(){
        for(EmployeeHashSets emp : employeeSets){
            System.out.println(" - " + emp);
        }
    }




}
