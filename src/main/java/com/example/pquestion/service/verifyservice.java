package com.example.pquestion.service;

import com.example.pquestion.dao.verifydao;
import com.example.pquestion.model.verify;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class verifyservice {
    @Autowired
    verifydao verifydao;
    public String add(verify verify) {
        verifydao.save(verify);

        return "success";


    }
    public String done(String user1){
        return verifydao.done(user1);


    }

}
