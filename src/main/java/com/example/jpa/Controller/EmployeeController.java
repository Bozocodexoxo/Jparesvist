package com.example.jpa.Controller;

import com.example.jpa.Model.Employee;
import com.example.jpa.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    EmployeeService employeeService;
@Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    @GetMapping("/allemp")
    public List<Employee> getallemp(){
    return employeeService.allemployee();
    }
    @DeleteMapping("/employee/{id}")
    public void remove(@PathVariable("id") int id){
     employeeService.delete(id);
    }

@PostMapping("/employee")
public Employee createemp(@RequestBody Employee employee){
   return employeeService.save(employee);
}
}
