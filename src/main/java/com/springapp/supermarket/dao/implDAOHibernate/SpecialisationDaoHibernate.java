package com.springapp.supermarket.dao.implDAOHibernate;

import com.springapp.supermarket.dao.SpecialisationDAO;
import com.springapp.supermarket.entity.Specialisation;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import java.util.List;

// DAO for CRUD operation with entity 'Specialisation'. Using hibernate for this
@Repository
public class SpecialisationDaoHibernate implements SpecialisationDAO {

    private HibernateSessionFactory hsf = new HibernateSessionFactory();
    private Session session = null;
    private Specialisation specialisation;

    // return all specialisation to list from db
    public List<Specialisation> getAllSpecialisation() {
        session = hsf.getSession();
        session.beginTransaction();
        List<Specialisation> listSpecialisation =
                (List<Specialisation>) session.createCriteria(Specialisation.class).list();
        session.getTransaction().commit();
        session.close();
        return listSpecialisation;
    }

    // return one object 'Specialisation' from db by name
    @Override
    public Specialisation getOneSpecialisation(String nameSpecialisation) {
        session = hsf.getSession();
        session.beginTransaction();
        specialisation =
                (Specialisation) session.createSQLQuery
                        ("select * from specialisation " +
                                "where name_specialisation='" + nameSpecialisation + "'")
                        .addEntity(Specialisation.class).uniqueResult();
        session.getTransaction().commit();
        session.close();
        return specialisation;
    }

    // return one entity "Specialisation" from db
    @Override
    public Specialisation getOneSpecialisation(int idSpecialisation) {
        session = hsf.getSession();
        session.beginTransaction();
        specialisation = session.get(Specialisation.class, idSpecialisation);
        session.getTransaction().commit();
        session.close();
        return specialisation;
    }

    @Override
    public void addNewSpecialisation(Specialisation specialisation) {

    }

    // Update edited entity "Specialisation" in db
    @Override
    public void updateOrSaveSpecialisation(Specialisation specialisation) {
        session = hsf.getSession();
        session.beginTransaction();
        session.saveOrUpdate(specialisation);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void removeSpecialisation(Specialisation specialisation) {
        session = hsf.getSession();
        session.beginTransaction();
        session.delete(specialisation);
        session.getTransaction().commit();
        session.close();
    }
}
