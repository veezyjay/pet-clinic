package com.veezy.petclinic.controllers;

import com.veezy.petclinic.model.Owner;
import com.veezy.petclinic.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Set;

@Controller
@RequestMapping("/owners")
public class OwnerController {
    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"", "/", "/index", "/index.html"})
    public String listOwners(Model model) {
        Set<Owner> owners = ownerService.findAll();
        System.out.println(owners);
        model.addAttribute("owners", owners);
        return "owners/index";
    }
}
