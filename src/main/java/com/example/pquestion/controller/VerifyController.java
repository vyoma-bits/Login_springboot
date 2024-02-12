package com.example.pquestion.controller;
import com.example.pquestion.service.verifyservice;

import com.example.pquestion.model.verify;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.pquestion.service.verifyservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("verify")
public class VerifyController {
    @Autowired

    verifyservice verifyservice;
    @RequestMapping("hello")
    public String hello(){
        return "Hello";
    }
    
    @RequestMapping("signup")
    public String signup(@RequestBody verify verify1){
        return verifyservice.add(verify1);

    }

}
