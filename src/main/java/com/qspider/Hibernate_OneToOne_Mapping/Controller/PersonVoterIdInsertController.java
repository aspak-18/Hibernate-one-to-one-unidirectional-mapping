package com.qspider.Hibernate_OneToOne_Mapping.Controller;

import com.qspider.Hibernate_OneToOne_Mapping.dao.PersonVoterDao;
import com.qspider.Hibernate_OneToOne_Mapping.dto.Person;
import com.qspider.Hibernate_OneToOne_Mapping.dto.VoterId;

import java.time.LocalDate;

public class PersonVoterIdInsertController {
    public static void main(String[] args) {
        PersonVoterDao dao=new PersonVoterDao();
        VoterId voter=new VoterId(1,"Darjeeling",25, LocalDate.parse("1999-01-20"),"Mubir",LocalDate.parse("2005-10-25"),"male");
        Person person=new Person(1,"Ashfaque","ash@gmail.com",181818,voter);
        dao.savePersonVoterDao(voter,person);
    }
}
