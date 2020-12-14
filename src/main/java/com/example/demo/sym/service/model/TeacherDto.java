package com.example.demo.sym.service.model;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class TeacherDto {
    private String teaNum, name, password, subject;
}
