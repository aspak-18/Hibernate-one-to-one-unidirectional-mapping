package com.qspider.Hibernate_OneToOne_Mapping.Controller;

import com.qspider.Hibernate_OneToOne_Mapping.dao.PersonDao;

public class DeletePersonByIdController {
    public static void main(String[] args) {
        PersonDao dao=new PersonDao();
        int a=dao.deletePersonByIdDao(1);
        if (a>0)
            System.out.println("Data Deleted");
        else
            System.out.println(("Something went wrong!!!"));
    }
}
