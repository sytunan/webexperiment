package org.example.controller;


import org.example.domain.User;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/login")
    public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{

        System.out.println("111");
        String name=request.getParameter("name");

        String password=request.getParameter("password");

        User user = userService.validate(name);

        response.setContentType("text/html;charset=utf-8");
        PrintWriter writer = response.getWriter();

        if(user.getPassword().equals(password)) {
            System.out.println("1111111");
            writer.write("登陆成功");

        }

        else  {

            writer.write("登陆失败");

        }

    }


    public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {

        doPost(request,response);

    }
}
