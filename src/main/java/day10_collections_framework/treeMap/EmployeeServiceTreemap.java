package day10_collections_framework.treeMap;

import java.util.Map;
import java.util.TreeMap;

public class EmployeeServiceTreemap {

    private TreeMap<Integer, EmployeeTreemap> employees;

    public EmployeeServiceTreemap() {
        employees = new TreeMap<>();
    }

    //add
    public EmployeeTreemap addEmployee(EmployeeTreemap employee){
        return employees.put(employee.getId(), employee);
    }

    //get by id
    public EmployeeTreemap getByEmployeeId(int id){
        return employees.get(id);
    }

    //remove by id
    public EmployeeTreemap removeByEmployeeId(int id){
        return employees.remove(id);
    }

    //check if employee is exist
    public boolean hasEmployee(int id){
        return employees.containsKey(id);
    }

    //update
    public void updateEmployeById(int id, String name, String dept){
        if(employees.containsKey(id)){
            employees.put(id,new EmployeeTreemap(id,name,dept));
        }
    }

    //get first
    public EmployeeTreemap getFirstEmployee(){
        return employees.firstEntry().getValue();
    }

    //get last
    public EmployeeTreemap getLastEmployee(){
        return employees.lastEntry().getValue();
    }

    //total number of employees
    public int getTotalNumberOfEmployees(){
        return employees.size();
    }

    //printing all the employees
    public void printAllEmployees(){
        for(Map.Entry<Integer, EmployeeTreemap> entry : employees.entrySet()){
            System.out.println(" Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }


}
