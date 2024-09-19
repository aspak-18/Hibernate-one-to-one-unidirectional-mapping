package com.qspider.Hibernate_OneToOne_Mapping.dao;

import com.qspider.Hibernate_OneToOne_Mapping.dto.Person;
import com.qspider.Hibernate_OneToOne_Mapping.dto.VoterId;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.util.List;

public class PersonDao {
    EntityManagerFactory emf= Persistence.createEntityManagerFactory("hibernate-mapping");
    EntityManager em= emf.createEntityManager();
    EntityTransaction et= em.getTransaction();

    public Person savePersonVoterDao(Person person, int v_id){
        try {
            VoterId vot=em.find(VoterId.class,v_id);
            if (vot!=null){
                person.setV(vot);
                et.begin();
                em.persist(person);
                et.commit();
                return person;
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public int deletePersonByIdDao(int id) {
        try {
            Person person=em.find(Person.class,id);
            if (person!=null){
                person.setV(null);
                et.begin();
                em.remove(person);
                et.commit();
                return 1;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
        return 0;
    }

    public int updatePersonEmailById(String email,int id){
        try{
            Person person=em.find(Person.class,id);
            if (person!=null){
                person.setEmail(email);
                et.begin();
                em.merge(person);
                et.commit();
                return 1;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
        return 0;
    }
}
