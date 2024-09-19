package com.qspider.Hibernate_OneToOne_Mapping.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Person {
    @Id
    private int id;
    private String name;
    private String email;
    private long phone;
    @OneToOne
    @JoinColumn(name="voterid")
    private  VoterId v;
}
