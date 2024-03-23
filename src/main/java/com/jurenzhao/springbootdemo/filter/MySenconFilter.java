package com.jurenzhao.springbootdemo.filter;

import java.io.IOException;

import javax.servlet.*;

/**
 * @Author： JuRenZhao
 * @Date: 2024/3/24 12 25
 * @Description:
 **/
public class MySenconFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("进入MySenconfFilter");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("退出MySenconfFilter");
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
