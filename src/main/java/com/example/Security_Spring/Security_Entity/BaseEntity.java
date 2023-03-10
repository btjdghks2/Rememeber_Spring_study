package com.example.Security_Spring.Security_Entity;

import lombok.Data;

import javax.persistence.*;


@Entity
@Data
public abstract class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String username;
    private String password;
    private String email;
    private String age;
    private String role;



}
