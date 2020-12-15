package com.example.demo.uss.service.model;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component @Data
public class StudentDto {
    private String stuNum, userid, password, name, ssn, regDate, subject, profileImage;
}
