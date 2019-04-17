package com.example.demo1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class errorController {

    @RequestMapping("/getuser")
    public String getuser(int i){
        int j = 1/i;
        return "success "+j;
    }
}
