package com.springapp.supermarket.controller;


import com.springapp.supermarket.entity.Department;
import com.springapp.supermarket.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

// in progress
@RequestMapping("/supermarket")
@Controller
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @RequestMapping("departments")
    public String viewAllDepartments(Model model) {
        List<Department> listDepartments = departmentService.getAllDepartment();
        model.addAttribute("listDepartments", listDepartments);
        return "department/departments";
    }
}
