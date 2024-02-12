package com.example.pquestion.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity

public class verify {
    @Id
    private String name;
    private String password;
    private Integer phone;
}
