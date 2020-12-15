package com.example.demo.sym.service;

import com.example.demo.sym.service.model.ManagerDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public interface ManagerService {
    public int register(ManagerDto manager);
}
