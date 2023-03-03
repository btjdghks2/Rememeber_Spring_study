package com.example.Security_Spring.Security_Entity;

import lombok.Data;

@Data
public class BaseDto {


    private String username;
    private String password;
    private String email;
    private String age;
    private String role;
}
