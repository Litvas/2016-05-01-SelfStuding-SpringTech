package com.springapp.supermarket.dao;

import com.springapp.supermarket.entity.Employee;

import java.util.List;

//Interface of DAO for CRUD operation with entity 'Employee'
public interface EmployeeDAO {

    // return all employees from db
    public List<Employee> getAllEmployee();

    // return one employees from db by id
    public Employee getOneEmployee(int idEmployee);

    // add new object Employee to DB
    public void addNewEmployee(Employee employee);

    // update Employee in DB
    public void updateEmployee(Employee employee);

    // remove Employee from DB
    public void removeEmployee(Employee employee);
}
