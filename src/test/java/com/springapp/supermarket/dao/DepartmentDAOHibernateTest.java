package com.springapp.supermarket.dao;


import com.springapp.supermarket.dao.implDAOHibernate.DepartmentDaoHibernate;
import com.springapp.supermarket.entity.Department;
import junit.framework.Assert;
import org.junit.Test;

import java.util.List;

public class DepartmentDAOHibernateTest {

    DepartmentDaoHibernate departmentDaoHibernate = new DepartmentDaoHibernate();

    @Test
    public void getAllDepartmentTest() {
        List<Department> list = departmentDaoHibernate.getAllDepartment();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }
     Assert.assertNotNull(departmentDaoHibernate.getAllDepartment());
    }
}
