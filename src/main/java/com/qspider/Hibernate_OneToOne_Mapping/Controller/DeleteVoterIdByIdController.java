package com.qspider.Hibernate_OneToOne_Mapping.Controller;

import com.qspider.Hibernate_OneToOne_Mapping.dao.VoterIdDao;

public class DeleteVoterIdByIdController {
    public static void main(String[] args) {
        VoterIdDao dao=new VoterIdDao();
        int a=dao.deleteVoterIdDao(1);
        if (a>0){
            System.out.println("Data Deleted");
        }
        else
            System.out.println("Something went wrong!!!!");
    }
}
