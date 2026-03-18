package com.onepieceofjava.DanReyesSpringbootWithoutComponent.service;

import com.onepieceofjava.DanReyesSpringbootWithoutComponent.model.Assets;
import com.onepieceofjava.DanReyesSpringbootWithoutComponent.model.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OnePieceofJavaService {

    private List<Employee> employeeList = new ArrayList<>();
    private List<Assets> assetsList = new ArrayList<>();

    private Long employeeId = 101L;
    private Long assetId = 201L;

    public OnePieceofJavaService() {
        initializeEmploye();
        initializeAssets();
    }

    private void initializeEmploye() {
        addEmployee(new Employee(null,"Dan","IT"));
        addEmployee(new Employee(null,"Nan","Devops"));
        addEmployee(new Employee(null,"Luffy","AWS"));
        addEmployee(new Employee(null,"Itchigo","Oracle"));
        addEmployee(new Employee(null,"Zoro","SAP"));
    }

    private void initializeAssets() {
        addAsset(new Assets(null,"Lenovo","Developer","5678Lnv"));
        addAsset(new Assets(null,"Asus","HR","9876As"));
        addAsset(new Assets(null,"HP","Accounting","1234HP"));
        addAsset(new Assets(null,"Acer","Marketing","2345Acr"));
        addAsset(new Assets(null,"MSI","Executives","4567Msi"));
    }

    //GET
    public List<Employee> getAllEmployee(){
        return employeeList;
    }

    //GET by ID
    public Employee getEmployeeById(Long employeeId){
        return employeeList.stream().filter( employee -> employee.getId().equals(employeeId)).findFirst().orElse(null);
    }

    //ADD
    public Employee addEmployee(Employee employee) {
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
    public void  deleteEmployeeById(Long employeeId){
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
    public List<Assets> getAllAssets(){
        return assetsList;
    }

    public Assets getAssetById(Long assetId){
        return assetsList.stream().filter( assets -> assets.getId().equals(assetId)).findFirst().orElse(null);
    }

    public List<Assets> getAssetsByEmployeeId(Long employeeId){
        return employeeList.stream().filter(employee -> employee.getId().equals(employeeId)).findFirst().map(Employee::getAssets).orElse(null);
    }

    public Assets addAsset(Assets assets) {
        assets.setId(assetId++);
        assetsList.add(assets);

        return assets;
    }

    public Employee assignAssetToTheEmployee(Long employeeId, Long assetId){
        Optional<Employee> employeeOptional = employeeList.stream().filter(employee -> employee.getId().equals(employeeId)).findFirst();
        Optional<Assets> assetsOptional = assetsList.stream().filter(assets -> assets.getId().equals(assetId)).findFirst();

        if(employeeOptional.isPresent() && assetsOptional.isPresent()){
            employeeOptional.get().addAssets(assetsOptional.get());
            return employeeOptional.get();
        }
        return null;
    }

    public void  deleteAssetById(Long assetId){
        assetsList.removeIf(assets -> assets.getId().equals(assetId));

    }

    public Employee removeAssetFromEmployee(Long employeeId, Long assetId){
        Optional<Employee> employeeOptional = employeeList.stream().filter(employee -> employee.getId().equals(employeeId)).findFirst();
        Optional<Assets> assetsOptional = assetsList.stream().filter(assets -> assets.getId().equals(assetId)).findFirst();

        if(employeeOptional.isPresent() && assetsOptional.isPresent()){
            employeeOptional.get().removeAssets(assetsOptional.get());
            return employeeOptional.get();
        }

        return null;
    }
}
