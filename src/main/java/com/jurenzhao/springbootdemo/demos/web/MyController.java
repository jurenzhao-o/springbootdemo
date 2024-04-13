package com.jurenzhao.springbootdemo.demos.web;

import com.jurenzhao.springbootdemo.domain.Student;
import com.jurenzhao.springbootdemo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.*;

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

    //随机生成一个uuid,没短杠
    @Value("${random.value}")
    private String randomvalue;
    //随机生成一个uuid,有短杠
    @Value("${random.uuid}")
    private String uuid;
    //随机取整数范围内的一个值
    @Value("${random.int}")
    private int num;
    //随机10以内的数
    @Value("${random.int(10)}")
    private int number;

    //随机100到200范围内的数
    @Value("${random.int(100,200)}")
    private int rangenum;

    //随机取长整型范围内的值
    @Value("${random.long}")
    private long longnum;
    //随机取长整型1000-20000范围内的值
    @Value("${random.long(1000,2000)}")
    private long rangelongnum;

    @RequestMapping("/yml4")
    @ResponseBody
    public String yml4(){
        return "randomvalue:"+randomvalue+" uuid:"+uuid+" num:"+num
                +" number:"+number+" rangenum:"+rangenum+" longnum:"
                +longnum+" rangelongnum:"+rangelongnum;
    }

    @GetMapping("/{page}")
    public String jspss(@PathVariable String page){
        return page;
    }

    @RequestMapping("/show")
    public String show(Model model, HttpServletRequest request, HttpSession session){
        model.addAttribute("msg","hellothymeleaf");
        model.addAttribute("date",new Date());
        model.addAttribute("sex","男");
        model.addAttribute("id",3);
        List<Student> students = new ArrayList<>();
        students.add(new Student("李四",22,"男"));
        students.add(new Student("小花",18,"女"));
        students.add(new Student("王五",33,"男"));
        model.addAttribute("students",students);

        //遍历Map
        Map<String,Student> studentMap = new HashMap<>();
        studentMap.put("stu1",new Student("李四",22,"男"));
        studentMap.put("stu2",new Student("小花",18,"女"));
        studentMap.put("stu3",new Student("王五",33,"男"));
        model.addAttribute("studentmap",studentMap);

        request.setAttribute("req","HttpServletRequest");
        session.setAttribute("ses","HttpSession");
        session.getServletContext().setAttribute("app","application");

        model.addAttribute("id","5");
        model.addAttribute("name","xzz");
        return "helloh5";
    }


    @GetMapping("/show2")
    @ResponseBody
    public String show2(String id,String name){
        return id+"___"+name;
    }


}
