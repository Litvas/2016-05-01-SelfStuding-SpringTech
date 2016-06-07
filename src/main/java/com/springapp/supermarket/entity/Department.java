package com.springapp.supermarket.entity;

import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component
@Entity
@Table(name = "department")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_department")
    private int idDepartment;

    @Column(name = "name_department", unique = true)
    private String nameDepartment;

    @Column(name = "description_department")
    private String descriptionDepartment;

    public Department() {
    }

    public String getNameDepartment() {
        return nameDepartment;
    }

    public int getIdDepartment() {
        return idDepartment;
    }

    public void setIdDepartment(int idDepartment) {
        this.idDepartment = idDepartment;
    }

    public void setNameDepartment(String nameDepartment) {
        this.nameDepartment = nameDepartment;
    }

    public String getDescriptionDepartment() {
        return descriptionDepartment;
    }

    public void setDescriptionDepartment(String descriptionDepartment) {
        this.descriptionDepartment = descriptionDepartment;
    }
    @Override
    public String toString() {
        return "Department{" +
                "id_Department='" + idDepartment + '\'' +
                ", nameDepartment=" + nameDepartment +
                ", descriptionDepartment='" + descriptionDepartment + '\'' +
                '}';
    }
}
