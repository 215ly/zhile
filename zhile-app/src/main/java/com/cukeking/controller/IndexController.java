package com.cukeking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liyi
 */
@Controller
public class IndexController {

    @RequestMapping(value = {"/","/index","/admin","/system"})
    public String index(){
        return "404";
    }
}
