package com.springapp.supermarket.service.implService;

import com.springapp.supermarket.dao.SpecialisationDAO;
import com.springapp.supermarket.entity.Specialisation;
import com.springapp.supermarket.service.SpecialisationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// Description of methods in same interfaces
@Service
public class SpecialisationServiceImpl implements SpecialisationService {

    @Autowired
    private SpecialisationDAO specialisationDAO;

    // return all specialisation to list
    @Override
    public List<Specialisation> getAllSpecialisation() {
        return specialisationDAO.getAllSpecialisation();
    }

    // return one specialisation by name
    @Override
    public Specialisation getOneSpecialisation(String nameSpecialisation) {
        return specialisationDAO.getOneSpecialisation(nameSpecialisation);
    }

    // return one specialisation by id
    @Override
    public Specialisation getOneSpecialisation(int idSpecialisation) {
        return specialisationDAO.getOneSpecialisation(idSpecialisation);
    }

    @Override
    public void updateSpecialisation(Specialisation specialisation) {
        specialisationDAO.updateOrSaveSpecialisation(specialisation);
    }

    @Override
    public void removeSpecialisation(Specialisation specialisation) {
        specialisationDAO.removeSpecialisation(specialisation);
    }
}
