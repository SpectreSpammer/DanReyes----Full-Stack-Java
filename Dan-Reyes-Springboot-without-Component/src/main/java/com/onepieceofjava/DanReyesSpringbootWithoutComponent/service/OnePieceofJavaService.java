package com.onepieceofjava.DanReyesSpringbootWithoutComponent.service;

import com.onepieceofjava.DanReyesSpringbootWithoutComponent.model.Assets;
import com.onepieceofjava.DanReyesSpringbootWithoutComponent.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class OnePieceofJavaService {

    private List<Employee> employeeList = new ArrayList<>();
    private List<Assets> assetsList = new ArrayList<>();

    private Long employeeId = 101L;
    private Long assetId = 201L;

    public OnePieceofJavaService() {
        initializeEmploye();
    }

    private void initializeEmploye() {
        addEmployee(new Employee(null,"Dan","IT"));
        addEmployee(new Employee(null,"Nan","Devops"));
        addEmployee(new Employee(null,"Luffy","AWS"));
        addEmployee(new Employee(null,"Itchigo","Oracle"));
        addEmployee(new Employee(null,"Zoro","SAP"));
    }

    //GET
    public List<Employee> getAllEmployee(){
        return employeeList;
    }

    //GET by ID
    public Employee getEmployeeById(){
        return employeeList.stream().filter( employee -> employee.getId().equals(employeeId)).findFirst().orElse(null);
    }

    //ADD
    private Employee addEmployee(Employee employee) {
        employee.setId(employeeId++);
        if(employee.getAssets() != null && !employee.getAssets().isEmpty()){
            for(Assets assets : employee.getAssets()){{
                assets.setId(assetId++);
            }}
        }

        employeeList.add(employee);

        return employee;
    }

    //UPDATE
    public Employee updateEmployee(Long employeeId, Employee updateEmployee){
        for(int i = 0; i < employeeList.size();i++) {
            if(employeeList.get(i).getId().equals(employeeId)){
                updateEmployee.setId(employeeId);
                employeeList.set(i,updateEmployee);
                return  updateEmployee;
            }
        }
        return null;
    }

    //DELETE by ID
    public void  deleteEmployeeById(){
        employeeList.removeIf(employee -> employee.getId().equals(employeeId));

        /*
        if(employeeId.equals(employeeId)){
            employeeList.remove(employeeId);
        }else {
            throw null;
        }
        */
    }

    //======================= ASSETS ========================================
}
