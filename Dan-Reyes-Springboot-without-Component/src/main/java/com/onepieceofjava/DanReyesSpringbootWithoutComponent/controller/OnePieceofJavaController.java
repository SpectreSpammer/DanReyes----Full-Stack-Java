package com.onepieceofjava.DanReyesSpringbootWithoutComponent.controller;

import com.onepieceofjava.DanReyesSpringbootWithoutComponent.model.Employee;
import com.onepieceofjava.DanReyesSpringbootWithoutComponent.service.OnePieceofJavaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
