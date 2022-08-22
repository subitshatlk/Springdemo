package com.testspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class MultiplyController {
    @RequestMapping("/multiply")
    public ModelAndView add(HttpServletRequest request, HttpServletResponse response){
        int x = Integer.parseInt(request.getParameter("p1"));
        int y = Integer.parseInt(request.getParameter("p2"));
        int k = x * y;
        ModelAndView mv = new ModelAndView();
        mv.setViewName("result");
        mv.addObject("result",k);
        return mv;
    }
}