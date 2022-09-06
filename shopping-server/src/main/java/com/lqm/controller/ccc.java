package com.lqm.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class ccc {

    @RequestMapping("/ccc")
    public String dasda(){
        return "xxx";
    }
}
