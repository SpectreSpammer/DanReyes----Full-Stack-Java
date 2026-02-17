package day10_collections_framework.treeSets;

import java.util.Comparator;
import java.util.TreeSet;

public class EmployeeServiceTreeSets {

    private TreeSet<EmployeeTreeSets> employeeSets;

    public EmployeeServiceTreeSets() {
        employeeSets = new TreeSet<>();
    }

    public EmployeeServiceTreeSets(Comparator<EmployeeTreeSets> comparator) {
        employeeSets = new TreeSet<>(comparator);
    }

    //get first
    public EmployeeTreeSets getFirstEmployee(){
        return  employeeSets.getFirst();
    }

    //get Last
    public EmployeeTreeSets getLastEmployee(){
        return  employeeSets.getLast();
    }

    //add employee object
    public boolean addEmployee(EmployeeTreeSets addEmployee){
         return employeeSets.add(addEmployee);
    }

    //delete employee object
    public boolean removeEmployee(EmployeeTreeSets employee){
        return employeeSets.remove(employee);
    }

    //delete first employee object
    public EmployeeTreeSets removeFirstEmployee(){
        return employeeSets.removeFirst();
    }

    //delete last employee object
    public EmployeeTreeSets removeLastEmployee(){
        return employeeSets.removeLast();
    }

    //contains of employees
    public boolean containsEmployee(EmployeeTreeSets employee){
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
        for(EmployeeTreeSets emp : employeeSets){
            System.out.println(" - " + emp);
        }
    }




}
