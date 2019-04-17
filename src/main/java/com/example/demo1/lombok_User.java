package com.example.demo1;


import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class lombok_User {


    private String name;

    private int age;


    @Override
    public String toString() {
        return "lombok_User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    public static void main(String[] args){
        lombok_User lombok_user = new lombok_User();
        lombok_user.setName("张三");
        lombok_user.setAge(11);
        log.info(lombok_user.toString());
    }
}
