package com.example.demo.Impls;

import java.util.List;

import com.example.demo.domains.MemberDto;
import com.example.demo.services.MemberService;

import org.springframework.stereotype.Component;

@Component
public class MemberServiceImpl implements MemberService {

    @Override
    public void registerGrade(MemberDto grade) {
        // TODO Auto-generated method stub

    }

    @Override
    public void registerStudent(MemberDto student) {
        // TODO Auto-generated method stub

    }

    @Override
    public void registerTeacher(MemberDto teacher) {
        // TODO Auto-generated method stub

    }

    @Override
    public void modifyGrade(MemberDto grade) {
        // TODO Auto-generated method stub

    }

    @Override
    public void removeGrade(MemberDto grade) {
        // TODO Auto-generated method stub

    }

    @Override
    public void modifyStudent(MemberDto student) {
        // TODO Auto-generated method stub

    }

    @Override
    public void removeStudent(MemberDto student) {
        // TODO Auto-generated method stub

    }

    @Override
    public MemberDto login(MemberDto student) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public MemberDto access(MemberDto teacher) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<MemberDto> fetchStudentList() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public MemberDto fetchStudentDetail(String memId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int sum(MemberDto grade) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public float avg(int sum) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean existId(String memId) {
        // TODO Auto-generated method stub
        return false;
    }

}
