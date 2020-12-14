package com.example.demo.sym.service.model;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data @Component
public class ManagerDto {
    private String mgrNum, email, password;
    
}
