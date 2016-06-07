package com.springapp.supermarket.dao.implDAOHibernate;

import com.springapp.supermarket.dao.EmployeeDAO;
import com.springapp.supermarket.entity.Employee;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.springframework.stereotype.Repository;

import java.util.List;

// DONE!
@Repository
public class EmployeeDaoHibernate implements EmployeeDAO {

    private HibernateSessionFactory hsf = new HibernateSessionFactory();
    private Session session = null;


    @Override
    public List<Employee> getAllEmployee() {
        session = hsf.getSession();
        session.beginTransaction();
        List<Employee> listEmployees = (List<Employee>) session
                .createCriteria(Employee.class)
                .addOrder(Order.asc("idEmployee"))
                .list();
        session.getTransaction().commit();
        hsf.getSession().close();
        return listEmployees;
    }

    @Override
    public Employee getOneEmployee(int idEmployee) {
        session = hsf.getSession();
        session.beginTransaction();
        Employee employee = session.get(Employee.class, idEmployee);
        session.getTransaction().commit();
        hsf.getSession().close();
        return employee;
    }

    @Override
    public void addNewEmployee(Employee employee) {
        session = hsf.getSession();
        session.beginTransaction();
        session.save(employee);
        session.getTransaction().commit();
        hsf.getSession().close();
    }

    @Override
    public void updateEmployee(Employee employee) {
        session = hsf.getSession();
        session.beginTransaction();
        session.update(employee);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void removeEmployee(Employee employee) {
        session = hsf.getSession();
        session.beginTransaction();
        session.delete(employee);
        session.getTransaction().commit();
        session.close();
    }
}
