package com.onepieceofjava.DanReyesSpringbootWithoutComponent.controller;

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
}
