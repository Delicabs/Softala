package com.example.softaala.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SoftaController {

    @RequestMapping("/index")
    public String index(Model model) {

        String hello = "Hello World controller";

        model.addAttribute("hello", hello);
        return "index";
    }

}
