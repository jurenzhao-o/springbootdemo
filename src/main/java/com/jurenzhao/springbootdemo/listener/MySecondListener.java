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
public class MySecondListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("MySecondListener init");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("MySecondListener destroyed");
    }
}
