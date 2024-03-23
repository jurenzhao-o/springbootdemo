package com.jurenzhao.springbootdemo.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * @Author： JuRenZhao
 * @Date: 2024/3/24 12 40
 * @Description:
 **/
@WebListener
public class MyFirstListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("MyFirstListener init");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("MyFirstListener destroyed");
    }
}
