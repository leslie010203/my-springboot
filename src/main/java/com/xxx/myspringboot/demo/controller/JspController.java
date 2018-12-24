package com.xxx.myspringboot.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @ClassName JspController
 * @Author hello
 * @Date 2018/12/22 22:54
 **/
@Controller
public class JspController {




    @GetMapping("/boot/index")
    public String index(Model model){
        model.addAttribute("msg","spring boot 集成 jsp");
        return "index";
    }


}
