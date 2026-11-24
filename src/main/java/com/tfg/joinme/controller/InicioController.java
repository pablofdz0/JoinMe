package com.tfg.joinme.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;


import java.util.List;

@Controller
public class InicioController {

    @GetMapping("/")
    public String inicio(Model model){
        model.addAttribute("nombreApp", "JoinMe");
        model.addAttribute("destinos", List.of("Lisboa", "Roma", "Tokio"));

        return "index";
    }


}
