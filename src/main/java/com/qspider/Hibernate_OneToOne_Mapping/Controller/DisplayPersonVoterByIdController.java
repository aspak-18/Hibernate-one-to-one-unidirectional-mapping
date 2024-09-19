package com.qspider.Hibernate_OneToOne_Mapping.Controller;

import com.qspider.Hibernate_OneToOne_Mapping.dao.PersonVoterDao;
import com.qspider.Hibernate_OneToOne_Mapping.dto.Person;
import com.qspider.Hibernate_OneToOne_Mapping.dto.VoterId;

public class DisplayPersonVoterByIdController {
    public static void main(String[] args) {
        PersonVoterDao dao=new PersonVoterDao();
        Person p =dao.getPersonVoterByIdDao(10);
        if (p!=null){
            System.out.println(p);
//            VoterId v=p.getV();
//            if (v!=null){
//                System.out.println(v);
//            }
        }

    }
}
