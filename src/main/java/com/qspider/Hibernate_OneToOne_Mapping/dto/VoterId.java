package com.qspider.Hibernate_OneToOne_Mapping.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class VoterId {
    @Id
    private  int idNumber;
    private String address;
    private int age;
    private LocalDate dob;
    private String father_name;
    private LocalDate date_of_issue;
    private String gender;
}
