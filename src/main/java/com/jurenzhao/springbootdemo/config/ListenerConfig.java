package com.jurenzhao.springbootdemo.config;

import com.jurenzhao.springbootdemo.listener.MySecondListener;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author： JuRenZhao
 * @Date: 2024/3/24 12 43
 * @Description:
 **/
@Configuration
public class ListenerConfig {

    public ServletListenerRegistrationBean getServletListenerRegistrationBean(){
        ServletListenerRegistrationBean servletListenerRegistrationBean = new ServletListenerRegistrationBean(new MySecondListener());
        return servletListenerRegistrationBean;
    }
}
