package com.example.savemoneyback_end.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @GetMapping("/dashboard")
    public ModelAndView dashboard(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("dashboard");
        return mv;
    }
}
