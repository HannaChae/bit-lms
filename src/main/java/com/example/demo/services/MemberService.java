package com.example.demo.services;

import java.util.List;

import com.example.demo.domains.MemberDto;

import org.springframework.stereotype.Component;

@Component
public interface MemberService {
    public void registerGrade(MemberDto grade);

    public void registerStudent(MemberDto student);

    public void registerTeacher(MemberDto teacher);

    public void modifyGrade(MemberDto grade);

    public void removeGrade(MemberDto grade);

    public void modifyStudent(MemberDto student);

    public void removeStudent(MemberDto student);

    public MemberDto login(MemberDto student);

    public MemberDto access(MemberDto teacher);

    public List<MemberDto> fetchStudentList();

    public MemberDto fetchStudentDetail(String memId);

    public int sum(MemberDto grade);

    public float avg(int sum);

    public boolean existId(String memId);
}
