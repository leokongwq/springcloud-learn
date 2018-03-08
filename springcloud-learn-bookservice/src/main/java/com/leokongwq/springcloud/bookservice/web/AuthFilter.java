package com.leokongwq.springcloud.bookservice.web;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * @author : kongwenqiang
 * DateTime: 2018/3/7 下午10:32
 * Mail:leokongwq@gmail.com   
 * Description: desc
 */
@WebFilter("/auth/*")
public class AuthFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("AuthFilter init");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println(request.getLocalName());
    }

    @Override
    public void destroy() {

    }
}
