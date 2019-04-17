package com.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @value注解得使用
 * 从application.properties中取变量
 */
@RestController
public class valuetest {

    @Value("${name}")
    private String name;

    @RequestMapping("/getname")
    public String getname(){
        return name;
    }
}
