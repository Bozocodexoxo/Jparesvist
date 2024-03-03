package com.example.jpa.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "Employee")
public class Employee {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
  @Column
  private String name;
  @Column
  private long salary;

    public Employee() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public Employee(int id, String name, long salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;

    }
}
