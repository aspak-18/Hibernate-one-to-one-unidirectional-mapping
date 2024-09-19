package com.qspider.Hibernate_OneToOne_Mapping.dao;

import com.qspider.Hibernate_OneToOne_Mapping.Service.VoterService;
import com.qspider.Hibernate_OneToOne_Mapping.dto.Person;
import com.qspider.Hibernate_OneToOne_Mapping.dto.VoterId;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.time.LocalDate;

public class VoterIdDao {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate-mapping");
    EntityManager em = emf.createEntityManager();
    EntityTransaction et = em.getTransaction();

    public VoterId saveVoterIdDao(VoterId voter) {
        try {
            et.begin();
            em.persist(voter);
            et.commit();
            return voter;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public int deleteVoterIdDao(int voterId) {
        try {
            VoterId vot = em.find(VoterId.class, voterId);
            if (vot != null) {
                Person person = (Person) em.createNativeQuery("select * from person where voterid=?1", Person.class).setParameter(1, vot.getIdNumber()).getSingleResult();
                person.setV(null);
                et.begin();
                em.merge(person);
                em.remove(vot);
                et.commit();
                return 1;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
        return 0;
    }

    public int updateVoterIdDOBByID(LocalDate dob, int id) {
        try {
            VoterId voter = em.find(VoterId.class, id);
            if (voter != null) {
                voter.setDob(dob);
                voter.setAge(VoterService.getAge(dob));
                et.begin();
                em.merge(voter);
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
