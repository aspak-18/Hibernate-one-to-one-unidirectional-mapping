package com.qspider.Hibernate_OneToOne_Mapping.Service;

import com.qspider.Hibernate_OneToOne_Mapping.dto.VoterId;

import java.time.LocalDate;
import java.time.Period;

public class VoterService {
    public VoterId insertVoterId(int id,String address,LocalDate dob,String father_name,LocalDate date_of_issue,String gender){
        int age=getAge(dob);
        return new VoterId(id,address,age,dob,father_name,date_of_issue,gender);
    }
    public static int getAge(LocalDate dob){
        LocalDate current_date=LocalDate.now();
        return Period.between(dob,current_date).getYears();
    }
}
