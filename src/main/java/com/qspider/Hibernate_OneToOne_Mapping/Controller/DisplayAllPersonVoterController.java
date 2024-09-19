package com.qspider.Hibernate_OneToOne_Mapping.Controller;

import com.qspider.Hibernate_OneToOne_Mapping.dao.PersonVoterDao;
import com.qspider.Hibernate_OneToOne_Mapping.dto.Person;

import java.util.List;

public class DisplayAllPersonVoterController {
    public static void main(String[] args) {
        PersonVoterDao dao=new PersonVoterDao();
        List<Person> person =dao.displayAllPersonVoterDao();
        person.forEach(p-> System.out.println(p));
    }
}
