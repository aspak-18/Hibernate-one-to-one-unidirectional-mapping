package com.qspider.Hibernate_OneToOne_Mapping.Controller;

import com.qspider.Hibernate_OneToOne_Mapping.dao.PersonDao;
import com.qspider.Hibernate_OneToOne_Mapping.dao.PersonVoterDao;
import com.qspider.Hibernate_OneToOne_Mapping.dto.Person;

import java.time.Period;

public class UpdatePersonByIdController {
    public static void main(String[] args) {
        PersonVoterDao pvd=new PersonVoterDao();
        PersonDao dao=new PersonDao();
        int a=dao.updatePersonEmailById("up@gmail.com",10);
        if (a>0)
            System.out.println("Data Updated");
        else
            System.out.println("Something Went wrong!!!!");
        Person p =pvd.getPersonVoterByIdDao(10);
        System.out.println(p);
    }
}
