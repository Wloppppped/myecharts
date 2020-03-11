package com.panxr.myecharts.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author PanXR
 * @date 2020/3/9 - 12:31
 */
@Controller
public class HelloController {

    @RequestMapping({"/","/index"})
    public void index(){

    }

}
