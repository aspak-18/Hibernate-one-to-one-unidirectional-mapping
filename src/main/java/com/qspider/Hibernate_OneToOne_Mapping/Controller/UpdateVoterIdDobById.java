package com.qspider.Hibernate_OneToOne_Mapping.Controller;

import com.qspider.Hibernate_OneToOne_Mapping.dao.PersonVoterDao;
import com.qspider.Hibernate_OneToOne_Mapping.dao.VoterIdDao;
import com.qspider.Hibernate_OneToOne_Mapping.dto.Person;

import java.time.LocalDate;

public class UpdateVoterIdDobById {
    public static void main(String[] args) {
        PersonVoterDao pvd=new PersonVoterDao();
        VoterIdDao dao=new VoterIdDao();
        int a=dao.updateVoterIdDOBByID(LocalDate.of(1990,01,01),10);
        if (a>0)
            System.out.println("Data Updated");
        else
            System.out.println("Something went wrong!!!!!");
        Person p=pvd.getPersonVoterByIdDao(10);
        System.out.println(p);
    }
}
