package com.jurenzhao.springbootdemo.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @Author： JuRenZhao
 * @Date: 2024/3/24 12 25
 * @Description:
 **/
@WebFilter(urlPatterns = "/first")
public class MyFirstFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("进入MyFirstFilter");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("退出MyFirstFilter");
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
