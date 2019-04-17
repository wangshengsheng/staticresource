package com.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Multi_environment_configurationController {

    @Value("${http_url}")
    private String http_url;

    @RequestMapping("/http_url")
    public String http_url(){
        return http_url;
    }
}
