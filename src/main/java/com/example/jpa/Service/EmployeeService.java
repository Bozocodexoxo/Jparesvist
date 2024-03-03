package com.example.jpa.Service;

import com.example.jpa.repo.Employeerepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import com.example.jpa.Model.Employee;

@Service
public class EmployeeService {

    Employeerepo employeerepo;
@Autowired
    public EmployeeService(Employeerepo employeerepo) {
        this.employeerepo = employeerepo;
    }
    List<Employee>list=new ArrayList<Employee>();
 public List<Employee> allemployee(){
     employeerepo.findAll().forEach(employee -> list.add(employee));
     return list;

 }
 public Employee save(Employee ename){
     return employeerepo.save(ename);
 }
 public void delete(int id){
      employeerepo.deleteById(id);
 }



}
