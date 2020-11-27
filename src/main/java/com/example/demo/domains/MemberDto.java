package com.example.demo.domains;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Component
public class MemberDto {
    protected int memId;
    protected String memName, password;
    // memId, memName, password

}
