package com.example.pquestion.controller;
import com.example.pquestion.service.verifyservice;
import com.example.pquestion.controller.Data;

import com.example.pquestion.model.verify;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.pquestion.service.verifyservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;


@RestController
@RequestMapping("verify")

public class VerifyController {
    @Autowired

    verifyservice verifyservice;
    @RequestMapping("hello/{user}/{pass}")
    public String hello(@PathVariable String user,@PathVariable String pass){
        if (verifyservice.done(user).equals(pass)){
            return "success";
        }
        else{
            return "failed";
        }

       
    }
    
    @RequestMapping("signup")
    public String signup(@RequestBody verify verify1){
        return verifyservice.add(verify1);

    }
    @RequestMapping("check")
    public String check(@RequestBody int hu){
        if( hu == 5){
            return "success";

        }
        else{
            return "failure";
        }}






}
