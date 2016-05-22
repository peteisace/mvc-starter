package com.peteisace.examples.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by pete on 5/22/16.
 */
@Controller
public class HomeController {

    @RequestMapping(value = "home/index", method = RequestMethod.GET)
    public String index() {
        return "home/index";
    }

}
