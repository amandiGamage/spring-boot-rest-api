package com.wearit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Amandi on 8/30/2018.
 */
@Controller
public class MainController {
    @RequestMapping(value = "/")
    @ResponseBody
    public String home(){
        return "<a>Hello</a>";
    }
}
