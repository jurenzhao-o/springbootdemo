package com.jurenzhao.springbootdemo.demos.web;

import com.jurenzhao.springbootdemo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author： JuRenZhao
 * @Date: 2024/3/23 12 25
 * @Description:
 **/
@Controller
@RequestMapping("/test")
public class MyController {


    @Value("${name}")
    private String name;
    @Value("${student.age}")
    private int age;

    @Value("${citys[0]}")
    private String city;

    @Value("${students[0].address}")
    private String address;

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        System.out.println("hello springboot !");
        return "hello springboot!";
    }

    @RequestMapping("/yml")
    @ResponseBody
    public String ymlValue(){
        return "name:"+name+" age:"+age+" address:"+address;
    }

    @Autowired
    private User user;


    @RequestMapping("/yml2")
    @ResponseBody
    public User ymlvalue2(){

        return user;
    }


    @Value("${myserver.port}")
    private String myport;

    @RequestMapping("/yml3")
    @ResponseBody
    public String yml3(){
        return myport;
    }
}
