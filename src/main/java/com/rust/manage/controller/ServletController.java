package com.rust.manage.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

/**
 * FileName: ServletController
 * Author:   Rust
 * DATE:     2017/9/27
 * DESC:
 */
@WebServlet("/Refresh")
public class ServletController extends HttpServlet{
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("servlet begin");
    }

}
