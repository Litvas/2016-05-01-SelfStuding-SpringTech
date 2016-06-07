package com.springapp.supermarket.dao;

import com.springapp.supermarket.entity.Department;
import java.util.List;

//Interface of DAO for CRUD operation with entity 'Department'
public interface DepartmentDAO {

    // return all departments from db
    public List<Department> getAllDepartment();

    // return one department from db by name
    public Department getOneDepartment(String nameDepartment);

    // add new object Department to DB
    public void addNewDepartment(Department department);

}
