package day10_collections_framework.hashmap;

import day10_collections_framework.treeSets.EmployeeTreeSets;

import java.util.HashMap;
import java.util.Map;

public class EmployeeServiceHashmap {

    private HashMap<Integer,EmployeeHashmap> employees;

    public EmployeeServiceHashmap() {
        employees = new HashMap<>();
    }

    //add
    public EmployeeHashmap addEmployee(EmployeeHashmap employee){
        return employees.put(employee.getId(), employee);
    }

    //get by id
    public EmployeeHashmap getByEmployeeId(int id){
        return employees.get(id);
    }

    //remove by id
    public EmployeeHashmap removeByEmployeeId(int id){
        return employees.remove(id);
    }

    //check if employee is exist
    public boolean hasEmployee(int id){
        return employees.containsKey(id);
    }

    //update
    public void updateEmployeById(int id, String name, String dept){
        if(employees.containsKey(id)){
            employees.put(id,new EmployeeHashmap(id,name,dept));
        }
    }

    //total number of employees
    public int getTotalNumberOfEmployees(){
        return employees.size();
    }

    //printing all the employees
    public void printAllEmployees(){
        for(Map.Entry<Integer,EmployeeHashmap> entry : employees.entrySet()){
            System.out.println(" Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }


}
