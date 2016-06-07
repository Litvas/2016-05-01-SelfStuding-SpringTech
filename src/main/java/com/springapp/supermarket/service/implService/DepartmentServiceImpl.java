package com.springapp.supermarket.service.implService;


import com.springapp.supermarket.dao.DepartmentDAO;
import com.springapp.supermarket.entity.Department;
import com.springapp.supermarket.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// Description of methods in same interfaces
@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentDAO departmentDAO;

    @Override
    public List<Department> getAllDepartment() {
        return departmentDAO.getAllDepartment();
    }

    @Override
    public Department getOneDepartment(String nameDepartment) {
        return departmentDAO.getOneDepartment(nameDepartment);
    }

    @Override
    public void addNewDepartment(Department department) {

    }
}
