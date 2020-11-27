package com.example.demo.controllers;

import java.util.HashMap;
import java.util.Map;

import com.example.demo.domains.MemberDto;
import com.example.demo.utils.Proxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {
    @Autowired
    Proxy px;

    @PostMapping("/students/{memId}")
    public Map<String, String> join(@PathVariable String memId, @RequestBody MemberDto member) {
        px.print("아이디번호 " + memId + "번이 서버에 들어옴");
        px.print("회원이름: " + member.getMemName());
        px.print("비밀번호: " + member.getPassword());
        Map<String, String> map = new HashMap<>();
        map.put("memName", member.getMemName());

        return map;
    }
}
