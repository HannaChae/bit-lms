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
        Map<String, String> map = new HashMap<>();
        map.put("name", "홍길동");
        return map;
    }
}
