package day10_collections_framework.linkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class EmployeeServiceLinkedList {

    private LinkedList<EmployeeLinkedList> employeeList = new LinkedList<>();

    //get last
    public EmployeeLinkedList getLastEmployee(){
        return employeeList.getLast();
    }

    //get first
    public EmployeeLinkedList getFirstEmployee(){
        return employeeList.getFirst();
    }

    //get employee by index
    public EmployeeLinkedList getEmployeeByIndex(int employeeId){
        return employeeList.get(employeeId);
    }

    //add employee object
    public void addEmployee(EmployeeLinkedList addEmployee){
         employeeList.add(addEmployee);
    }

    //add employee object by index
    public void addEmployeeByIndex(int index, EmployeeLinkedList addEmployee){
        employeeList.add(index,addEmployee);
    }

    //add employee object by last index
    public void addEmployeeByLastIndex(EmployeeLinkedList addEmployee){
        employeeList.addLast(addEmployee);
    }

    //add employee object by first index
    public void addEmployeeByFirstIndex(EmployeeLinkedList addEmployee){
        employeeList.addFirst(addEmployee);
    }

    //update employee object by index
    public void updateEmployeeByIndex(int index, EmployeeLinkedList addEmployee){
        employeeList.set(index,addEmployee);
    }

    //delete employee object by index
    public EmployeeLinkedList deleteEmployeeByIndex(int index){
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
        for(EmployeeLinkedList emp : employeeList){
            System.out.println(" - " + emp);
        }
    }




}
