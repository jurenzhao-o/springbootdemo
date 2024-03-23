package com.jurenzhao.springbootdemo.config;

import com.jurenzhao.springbootdemo.filter.MySenconFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author： JuRenZhao
 * @Date: 2024/3/24 12 30
 * @Description:
 **/
@Configuration
public class FilterConfig {
    @Bean
    public FilterRegistrationBean getFilterRegistrationBean(){
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new MySenconFilter());
        filterRegistrationBean.addUrlPatterns("/second");
        return filterRegistrationBean;
    }
}
