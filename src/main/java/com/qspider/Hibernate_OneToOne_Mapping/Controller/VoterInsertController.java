package com.qspider.Hibernate_OneToOne_Mapping.Controller;

import com.qspider.Hibernate_OneToOne_Mapping.Service.VoterService;
import com.qspider.Hibernate_OneToOne_Mapping.dao.VoterIdDao;
import com.qspider.Hibernate_OneToOne_Mapping.dto.VoterId;

import java.time.LocalDate;

public class VoterInsertController {
    public static void main(String[] args) {
        VoterIdDao dao=new VoterIdDao();
        VoterService ser=new VoterService();
        VoterId voter=ser.insertVoterId(11,"Algarah",LocalDate.of(1995,10,20),"Mubir",LocalDate.parse("2024-01-01"),"male");
        dao.saveVoterIdDao(voter);
    }
}
