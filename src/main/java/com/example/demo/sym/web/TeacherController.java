package com.example.demo.sym.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.demo.sym.service.TeacherService;
import com.example.demo.sym.service.model.TeacherDto;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/teachers")
public class TeacherController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired 
    TeacherService teacherService;

    @PostMapping("")
    public Map<?,?> register(@RequestBody TeacherDto teacher){
        var map = new HashMap<>();
        logger.info("등록하려는 교강사 정보: "+teacher.toString());
        map.put("message", teacherService.register(teacher) == 1 ? "SUCCESS" : "FAILURE");
        return map;
    }

    @GetMapping("")
    public List<?> list(){
        logger.info("=====교강사 목록 조회=====");
        return teacherService.list();
    }

    @PostMapping("/login")
    public Map<?,?> login(@RequestBody TeacherDto teacher){
        logger.info("로그인 정보: "+teacher.toString());
        var map = new HashMap<>();
        TeacherDto result = teacherService.login(teacher);
        map.put("message", (result != null) ? "SUCCESS" : "FAILURE");
        map.put("sessionUser", result);
        logger.info("로그인 정보: "+result.toString());
        return map;
    }

    @GetMapping("/{email}")
    public TeacherDto profile(@PathVariable String email){
        logger.info("프로필 정보: "+email);
        return teacherService.detail(email);
    }

}
