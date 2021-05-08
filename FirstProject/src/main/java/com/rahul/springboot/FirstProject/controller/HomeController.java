package com.rahul.springboot.FirstProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class HomeController {

    @RequestMapping("home")
    //@ResponseBody
    // to render the html page, use thymeleaf.
    public String home() {
        System.out.println("Hello REST API ****");
        return "home";
    }

    @RequestMapping("home1")
    // localhost:8080/home1?name=Rahul
    public String returnName(HttpServletRequest request) {
        String name = request.getParameter("name");
        System.out.println("Name is: " + name);

        HttpSession session = request.getSession();
        session.setAttribute("name", name);
        return "home";
    }

    @RequestMapping("home2")
    @ResponseBody
    // if you dont use ResponseBody, theymleaf will try to search for RahulRajput.html
    //what if you have multiple params
    // localhost:8080/home2?name=Rahul&caste=Rajput
    public String returnMultipleParams(@RequestParam("name") String myName, @RequestParam("caste") String caste){
        return myName + caste;
    }
}
