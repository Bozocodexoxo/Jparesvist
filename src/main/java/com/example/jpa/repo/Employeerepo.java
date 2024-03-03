package com.example.jpa.repo;

import com.example.jpa.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Employeerepo extends JpaRepository<Employee,Integer> {

}
