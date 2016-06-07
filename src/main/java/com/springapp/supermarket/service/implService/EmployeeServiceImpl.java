package com.springapp.supermarket.service.implService;

import com.springapp.supermarket.dao.implDAOHibernate.EmployeeDaoHibernate;
import com.springapp.supermarket.entity.Employee;
import com.springapp.supermarket.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


// Description of methods in same interfaces
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDaoHibernate employeeDaoHibernate;

    @Override
    public List<Employee> getAllEmployee() {
        return employeeDaoHibernate.getAllEmployee();
    }

    @Override
    public Employee getOneEmployee(int idEmployee) {
       return employeeDaoHibernate.getOneEmployee(idEmployee);
    }

    @Override
    public void addNewEmployee(Employee employee) {
        employeeDaoHibernate.addNewEmployee(employee);
    }

    @Override
    public void updateEmployee(Employee employee) {
        employeeDaoHibernate.updateEmployee(employee);
    }

    @Override
    public void removeEmployee(Employee employee) {
        employeeDaoHibernate.removeEmployee(employee);
    }
}
