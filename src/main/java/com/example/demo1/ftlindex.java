package com.example.demo1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ftlindex {

    @RequestMapping("/FTLindex")
    public String ftlIndex(){
        return "FTLindex";
    }
}
