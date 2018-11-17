package com.leokongwq.springcloud.bookservice.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author jiexiu
 */
@WebServlet(name = "authServlet", urlPatterns = {"/abc"}, loadOnStartup=1)
public class AuthServlet extends HttpServlet {

    public AuthServlet() {
        super();
    }

    @Override
    public void init() throws ServletException {
        System.out.println("AuthServlet init");
        super.init();
    }

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) {
        try {
            resp.getOutputStream().write("hello".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
