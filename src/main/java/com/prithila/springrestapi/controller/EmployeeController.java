/**
 * @author Fariha Nawaz
 * @since 2/18/2021
 */
package com.prithila.springrestapi.controller;

import com.prithila.springrestapi.model.Employees;
import com.prithila.springrestapi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/")
    public String indexPage() {
        return "Hello this is index page";
    }

    @PostMapping("/add")
    public Employees addEmployee(@RequestBody Employees employees){
        return employeeService.create(employees);
    }
}
