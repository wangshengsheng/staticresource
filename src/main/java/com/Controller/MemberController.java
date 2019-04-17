package com.Controller;

import com.Service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 模拟异步调用
 */
@RestController
@Slf4j
public class MemberController
{
    @Autowired
    MemberService memberService;


    @RequestMapping("/getmember2")
    public String getmember2() throws InterruptedException {
        log.info("1");
        String s = memberService.getmember();

        //Thread.sleep(200);
        log.info("4");

        return "result:"+s;
    }
}
