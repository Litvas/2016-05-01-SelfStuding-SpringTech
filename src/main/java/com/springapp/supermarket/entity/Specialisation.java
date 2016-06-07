package com.springapp.supermarket.entity;

import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component
@Entity
@Table(name = "specialisation")
public class Specialisation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_specialisation")
    private int idSpecialisation;

    @Column(name = "name_specialisation", unique = true)
    private String nameSpecialisation;

    @Column(name = "description_specialisation")
    private String descriptionSpecialisation;

    public Specialisation() {
    }

    public String getNameSpecialisation() {
        return nameSpecialisation;
    }

    public void setNameSpecialisation(String nameSpecialisation) {
        this.nameSpecialisation = nameSpecialisation;
    }

    public String getDescriptionSpecialisation() {
        return descriptionSpecialisation;
    }

    public void setDescriptionSpecialisation(String descriptionSpecialisation) {
        this.descriptionSpecialisation = descriptionSpecialisation;
    }

    public int getIdSpecialisation() {
        return idSpecialisation;
    }

    public void setIdSpecialisation(int idSpecialisation) {
        this.idSpecialisation = idSpecialisation;
    }

    @Override
    public String toString() {
        return "Specialisation{" +
                "idSpecialisation=" + idSpecialisation +
                ", nameSpecialisation='" + nameSpecialisation + '\'' +
                ", descriptionSpecialisation='" + descriptionSpecialisation + '\'' +
                '}';
    }
}
