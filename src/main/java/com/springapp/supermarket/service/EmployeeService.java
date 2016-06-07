package com.springapp.supermarket.service;

import com.springapp.supermarket.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {

    // return all departments from db
    public List<Employee> getAllEmployee();

    // return one department from ArrayList
    public Employee getOneEmployee(int idEmployee);

    // add new object Department to DB
    public void addNewEmployee(Employee employee);

    // update Employee in DB
    public void updateEmployee(Employee employee);

    // remove Employee from DB
    public void removeEmployee(Employee employee);
}
