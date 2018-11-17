package com.leokongwq.springcloud.bookservice.web;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @author : kongwenqiang
 * DateTime: 2018/3/7 下午10:32
 * Mail:leokongwq@gmail.com   
 * Description: desc
 */
@WebFilter("/*")
public class AuthFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("AuthFilter init");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println(request.getLocalName());
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }
}
