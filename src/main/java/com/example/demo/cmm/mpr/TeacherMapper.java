package com.example.demo.cmm.mpr;

import java.util.List;

import com.example.demo.sym.service.model.TeacherDto;

import org.springframework.stereotype.Repository;

@Repository
public interface TeacherMapper {
	public int insert(TeacherDto teacher);
	public List<TeacherDto> selectAll();
	public TeacherDto selectById(String teaNum);
	public TeacherDto login(TeacherDto teacher);
	public int update(TeacherDto teacher);
	public int delete(TeacherDto teacher);
    
}
