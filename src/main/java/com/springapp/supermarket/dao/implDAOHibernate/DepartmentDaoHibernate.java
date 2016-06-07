package com.springapp.supermarket.dao.implDAOHibernate;

import com.springapp.supermarket.dao.DepartmentDAO;
import com.springapp.supermarket.entity.Department;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DepartmentDaoHibernate implements DepartmentDAO {

    private HibernateSessionFactory hsf = new HibernateSessionFactory();
    private Session session = null;


    @Override
    public List<Department> getAllDepartment() {
        session = hsf.getSession();
        session.beginTransaction();
        List<Department> listDepartments = session
                .createCriteria(Department.class)
                .list();
        session.getTransaction().commit();
        hsf.getSession().close();
        return listDepartments;
    }

    @Override
    public Department getOneDepartment(String nameDepartment) {
        session = hsf.getSession();
        session.beginTransaction();
        Department department = (Department) session.createSQLQuery
                ("select * from department where name_department='" + nameDepartment + "'")
                .addEntity(Department.class).uniqueResult();
        session.getTransaction().commit();
        hsf.getSession().close();
        return department;
    }

    @Override
    public void addNewDepartment(Department department) {

    }
}
