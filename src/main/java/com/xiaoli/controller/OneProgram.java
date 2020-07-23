package com.xiaoli.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Author:lixinyu
 * Date:2020/7/3
 * Description:
 */
@Controller
public class OneProgram {

    @RequestMapping(path="/test")
    public String testJSP(){
        System.out.println("sssss....");
        return "HomePage";
    }
}
