package com.example.hello.spring.cloud.web.admin.feign.controller;

import com.example.hello.spring.cloud.web.admin.feign.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

    @Autowired
    private AdminService adminService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String sayHi(String message){
        return adminService.sayHi(message);
    }

}
