package com.springapp.supermarket.entity;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Component
@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idEmployee;

    @ManyToOne
    @JoinColumn(name = "name_department")
    private Department departmentEmployee;

    @ManyToOne
    @JoinColumn(name = "name_specialisation")
    private Specialisation specialisation;

    @Column(name = "name_Employee")
    private String nameEmployee;

    @Column(name = "surename_Employee")
    private String surenameEmployee;

    public Employee() {
    }

    public int getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }

    public Department getDepartmentEmployee() {
        return departmentEmployee;
    }

    public void setDepartmentEmployee(Department departmentEmployee) {
        this.departmentEmployee = departmentEmployee;
    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    public String getSurenameEmployee() {
        return surenameEmployee;
    }

    public void setSurenameEmployee(String surenameEmployee) {
        this.surenameEmployee = surenameEmployee;
    }

    public Specialisation getSpecialisation() {
        return specialisation;
    }

    public void setSpecialisation(Specialisation specialisation) {
        this.specialisation = specialisation;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "idEmployee=" + idEmployee +
                ", departmentEmployee=" + departmentEmployee +
                ", specialisationEmployee=" + specialisation +
                ", nameEmployee='" + nameEmployee + '\'' +
                ", surenameEmployee='" + surenameEmployee + '\'' +
                '}';
    }
}
