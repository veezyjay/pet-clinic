package com.veezy.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"", "/", "index", "index.html"})
    public String showIndex() {
        return "index";
    }

    @RequestMapping({"/oups", "/vets.html"})
    public String oupsHandler() {
        return "notimplemented";
    }
}
