package com.example.demo1;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebLogTest {

    @RequestMapping("/getmember")
    public String getmember(String name,int age){
        return "success";
    }
}
