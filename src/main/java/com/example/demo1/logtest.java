package com.example.demo1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class logtest {

    private static final Logger logger = LoggerFactory.getLogger(logtest.class);

    @RequestMapping("/getuser2")
    public String getuser(int i){

        logger.info("log4j打印日志测试。。。。");

        int j = 1/i;
        return "success "+j;
    }
}
