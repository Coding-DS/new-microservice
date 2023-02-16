package com.csi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class FallBackController {


    @GetMapping("/employeefallback")
    public String employeeFallback(){
        return
                "Employee Service Down please Wait ....!";
    }
    @GetMapping("/departmentfallback")
    public String departmentFallback(){
        return
                "Department Service Down please Wait ....!";
    }

}
