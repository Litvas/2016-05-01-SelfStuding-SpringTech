package com.springapp.supermarket.service;

import com.springapp.supermarket.entity.Specialisation;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SpecialisationService {

    // return all specialisation to list
    public List<Specialisation> getAllSpecialisation();

    // return one specialisation by name
    public Specialisation getOneSpecialisation(String nameSpecialisation);

    // return one specialisation by id
    public Specialisation getOneSpecialisation(int idSpecialisation);

    //Send for Update one entity 'Specialisation'
    public void updateSpecialisation(Specialisation specialisation);

    // remove Specialisation from DB
    public void removeSpecialisation (Specialisation specialisation);
}
