package com.springapp.supermarket.dao;

import com.springapp.supermarket.entity.Specialisation;

import java.util.List;

//Interface of DAO for CRUD operation with entity 'Specialisation'
public interface SpecialisationDAO {

    // return all specialisation to list from db
    public List<Specialisation> getAllSpecialisation();

    // return one object 'Specialisation' from db by name
    public Specialisation getOneSpecialisation(String nameSpecialisation);

    // return one object 'Specialisation' from db by id
    public Specialisation getOneSpecialisation(int idSpecialisation);

    // add new object Department to DB
    public void addNewSpecialisation(Specialisation specialisation);

    // update one Specialisation
    public void updateOrSaveSpecialisation(Specialisation specialisation);

    // remove Specialisation from DB
    public void removeSpecialisation (Specialisation specialisation);
}
