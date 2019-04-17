package com.Service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MemberService{

    @Async   //添加@Async 会重新单独开一个新的线程执行该函数，应用场景：例如添加User的时候发送邮件
    //使用Aop技术在运行时创建一个单独的线程进行执行
    public String getmember(){
        //方法1
       /* log.info("2");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        log.info("3");

        return "success";*/

       //方法2
        new Thread(new Runnable() {
            @Override
            public void run() {
                log.info("2");

                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                log.info("3");


            }
        }).start();
        return "success";



    }


}
