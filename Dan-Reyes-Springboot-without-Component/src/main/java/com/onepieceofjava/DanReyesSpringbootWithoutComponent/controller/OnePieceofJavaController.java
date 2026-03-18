package com.onepieceofjava.DanReyesSpringbootWithoutComponent.controller;

import com.onepieceofjava.DanReyesSpringbootWithoutComponent.model.Assets;
import com.onepieceofjava.DanReyesSpringbootWithoutComponent.model.Employee;
import com.onepieceofjava.DanReyesSpringbootWithoutComponent.service.OnePieceofJavaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/onepieceofjava")
public class OnePieceofJavaController {


    private final OnePieceofJavaService service;

    public OnePieceofJavaController(OnePieceofJavaService service) {
        this.service = new OnePieceofJavaService();
    }

    //==================EMPLOYEES==========================

    //GET ALL
    @GetMapping("/employees")
    public List<Employee> getAllEmployee(){
        return service.getAllEmployee();
    }

    //GET by ID
    @GetMapping("/employees/{employeeId}")
    public Employee getEmployeeById(@PathVariable Long employeeId){
        return service.getEmployeeById(employeeId);
    }

    //ADD
    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee){
        return service.addEmployee(employee);
    }

    //UPDATE
    /*
        *PUTMAPPING -> Inuupdate un buong json
        *PATCHMAPPING ->　certain part of the json will be updated
     */
    @PutMapping("/employees/{employeeId}")
    public Employee updateEmployee(@PathVariable Long employeeId, @RequestBody Employee updateEmployee){
         return service.updateEmployee(employeeId,updateEmployee);
    }

    //DELETE
    @DeleteMapping("/employees/{employeeId}")
    public void deleteEmployeeById(@PathVariable Long employeeId){
         service.deleteEmployeeById(employeeId);
    }


    //======================= ASSETS ========================================
    @GetMapping("/assets")
    public List<Assets> getAllAssets(){
        return service.getAllAssets();
    }

    @GetMapping("/assets/{assetId}")
    public Assets getAsetsById(@PathVariable Long assetId){
        return service.getAssetById(assetId);
    }

    @GetMapping("/employees/{employeeId}/assets")
    public List<Assets> getAssetsByEmployeeId(@PathVariable Long employeeId){
        return service.getAssetsByEmployeeId(employeeId);
    }

    @PostMapping("/assets")
    public Assets addAssets(@RequestBody Assets assets){
        return service.addAsset(assets);
    }

    @PostMapping("/employees/{employeeId}/assets/{assetId}")
    public Employee assignAssetToTheEmployee(@PathVariable Long employeeId, @PathVariable Long assetId){
        return service.assignAssetToTheEmployee(employeeId,assetId);
    }

    @DeleteMapping("/assets/{assetId}")
    public void deleteAssset(@PathVariable Long assetId){
         service.deleteAssetById(assetId);
    }

    @DeleteMapping("/employees/{employeeId}/assets/{assetId}")
    public Employee removeAssetFromEmployee(@PathVariable Long employeeId, @PathVariable Long assetId){
        return service.removeAssetFromEmployee(employeeId,assetId);
    }


}
