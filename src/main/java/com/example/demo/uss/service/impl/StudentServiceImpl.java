package com.example.demo.uss.service.impl;

import java.util.List;

import com.example.demo.cmm.mpr.StudentMapper;
import com.example.demo.uss.service.StudentService;
import com.example.demo.uss.service.model.StudentDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentMapper studentMapper;

    @Override
    public int register(StudentDto student) {
        return studentMapper.insert(student);
    }

    @Override
    public StudentDto login(StudentDto student) {
        return studentMapper.login(student);
    }

    @Override
    public StudentDto detail(String userid) {
        return studentMapper.selectById(userid);
    }

    @Override
    public List<?> list() {
        return studentMapper.selectAll();
    }

}
