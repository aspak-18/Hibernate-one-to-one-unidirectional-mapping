package com.qspider.Hibernate_OneToOne_Mapping.Controller;

import com.qspider.Hibernate_OneToOne_Mapping.Service.VoterService;
import com.qspider.Hibernate_OneToOne_Mapping.dao.PersonVoterDao;
import com.qspider.Hibernate_OneToOne_Mapping.dto.Person;
import com.qspider.Hibernate_OneToOne_Mapping.dto.VoterId;

import java.time.LocalDate;

public class AutoAgeInsertController {
    public static void main(String[] args) {
        PersonVoterDao dao=new PersonVoterDao();
        VoterService ser=new VoterService();
        VoterId voter=ser.insertVoterId(10,"Kalimpong",LocalDate.of(1999,01,20),"Mubir",LocalDate.parse("2024-10-25"),"male");
        Person person=new Person(10,"Ashfaque","ash@gmail.com",18181800,voter);
        dao.savePersonVoterDao(voter,person);
    }
}
