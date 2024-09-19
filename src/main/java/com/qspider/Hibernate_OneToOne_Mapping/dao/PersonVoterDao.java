package com.qspider.Hibernate_OneToOne_Mapping.dao;

import com.qspider.Hibernate_OneToOne_Mapping.dto.Person;
import com.qspider.Hibernate_OneToOne_Mapping.dto.VoterId;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.util.List;

public class PersonVoterDao {
    EntityManagerFactory emf= Persistence.createEntityManagerFactory("hibernate-mapping");
    EntityManager em= emf.createEntityManager();
    EntityTransaction et= em.getTransaction();

    public Person savePersonVoterDao( VoterId voterid,Person person){
        try {
            et.begin();
            em.persist(voterid);
            em.persist(person);
            et.commit();

            return person;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public  Person getPersonVoterByIdDao(int personId){
        return em.find(Person.class,personId);
    }

    public List<Person> displayAllPersonVoterDao(){
        return (List<Person>) em.createNativeQuery("select * from person",Person.class).getResultList();
    }
}
