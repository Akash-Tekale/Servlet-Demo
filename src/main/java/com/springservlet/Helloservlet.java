package com.springservlet;

import java.io.IOException;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class Helloservlet extends HttpServlet{
    public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException{
        System.out.println("in service ...");
        res.getWriter().println("<h1><i>hello</i></h1>");
    }   
}
