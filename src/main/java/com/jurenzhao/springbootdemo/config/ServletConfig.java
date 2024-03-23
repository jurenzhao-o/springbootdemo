package com.jurenzhao.springbootdemo.config;

import com.jurenzhao.springbootdemo.servlet.MySecondServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author： JuRenZhao
 * @Date: 2024/3/24 12 14
 * @Description:
 **/
@Configuration
public class ServletConfig {

    @Bean
    public ServletRegistrationBean getServletRegistrationBean(){
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new MySecondServlet());
        servletRegistrationBean.addUrlMappings("/second");
        return servletRegistrationBean;
    }
}
