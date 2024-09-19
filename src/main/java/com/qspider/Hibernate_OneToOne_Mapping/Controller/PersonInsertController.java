package com.qspider.Hibernate_OneToOne_Mapping.Controller;

import com.qspider.Hibernate_OneToOne_Mapping.dao.PersonDao;
import com.qspider.Hibernate_OneToOne_Mapping.dto.Person;
import com.qspider.Hibernate_OneToOne_Mapping.dto.VoterId;

public class PersonInsertController {
    public static void main(String[] args) {
        PersonDao dao=new PersonDao();
        VoterId v=new VoterId();
        Person per=new Person(11,"Ashfaque","ash@gmail.com",181818,v);
        dao.savePersonVoterDao(per,11);
    }
}
