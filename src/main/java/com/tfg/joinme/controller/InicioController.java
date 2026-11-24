package com.tfg.joinme.controller;

import ch.qos.logback.classic.spi.ConfiguratorRank;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InicioController {

    @GetMapping
    public String Inicio(Model model){
        model.addAttribute("nombreApp", "JoinMe");
        return "index";
    }
}
