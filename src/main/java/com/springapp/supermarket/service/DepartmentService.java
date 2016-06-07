package com.springapp.supermarket.service;

import com.springapp.supermarket.entity.Department;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DepartmentService {

    // return all departments from db
    public List<Department> getAllDepartment();

    // return one department from ArrayList
    public Department getOneDepartment(String nameDepartment);

    // add new object Department to DB
    public void addNewDepartment(Department department);

}
