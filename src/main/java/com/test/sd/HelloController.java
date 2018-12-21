package com.test.sd;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.ModelMap;

@RequestMapping("")
@Controller
public class HelloController {

    public String printHello(ModelMap model){

        model.addAttribute("message","Hello Cow");
        return "hello";
    }
}
