package com.rust.manage.controller;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * FileName: TestController
 * Author:   Rust
 * DATE:     2017/8/23
 */
@Controller
@RequestMapping("/hellomapper")
//@Scope("prototype")
//@Path("/")
public class TestController {

    private static int st = 0;      //静态的
    private int index = 0;          //非静态

    @RequestMapping(method = RequestMethod.POST, value = "/show.do")
    //@POST
    //@Path("show.do")
    public String toShow() {

        return "/lsh/ch5/show";
    }




    @RequestMapping(method = RequestMethod.POST, value = "/test")
    //@POST
    //@Path("test")
    public String test() {
        System.out.println(st++ + " | " + index++);
        return "/lsh/ch5/test";
    }
}
