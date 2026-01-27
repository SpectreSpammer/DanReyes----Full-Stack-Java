package day10_collections_framework.arrayList;

import java.util.ArrayList;

public class EmployeeServiceArrayList {

    private ArrayList<EmployeeArrayList> employeeList = new ArrayList<>();

    //get last
    public EmployeeArrayList getLastEmployee(){
        return employeeList.getLast();
    }

    //get first
    public EmployeeArrayList getFirstEmployee(){
        return employeeList.getFirst();
    }

    //get employee by index
    public EmployeeArrayList getEmployeeByIndex(int employeeId){
        return employeeList.get(employeeId);
    }

    //add employee object
    public void addEmployee(EmployeeArrayList addEmployee){
         employeeList.add(addEmployee);
    }

    //add employee object by index
    public void addEmployeeByIndex(int index,EmployeeArrayList addEmployee){
        employeeList.add(index,addEmployee);
    }

    //add employee object by last index
    public void addEmployeeByLastIndex(EmployeeArrayList addEmployee){
        employeeList.addLast(addEmployee);
    }

    //add employee object by first index
    public void addEmployeeByFirstIndex(EmployeeArrayList addEmployee){
        employeeList.addFirst(addEmployee);
    }

    //update employee object by index
    public void updateEmployeeByIndex(int index,EmployeeArrayList addEmployee){
        employeeList.set(index,addEmployee);
    }

    //delete employee object by index
    public EmployeeArrayList deleteEmployeeByIndex(int index){
        return employeeList.remove(index);
    }


    //total number of employees
    public int getTotalNumberOfEmployees(){
        return employeeList.size();
    }

    //is employee empty?
    public boolean isEmployeeEmpty(){
        return employeeList.isEmpty();
    }

    //printing all the employees
    public void printAllEmployees(){
        for(EmployeeArrayList emp : employeeList){
            System.out.println(" - " + emp);
        }
    }




}
