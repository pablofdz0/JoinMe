package com.tfg.joinme.controller;

import com.tfg.joinme.repository.ViajeRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;


import java.util.List;

@Controller
public class InicioController {

    private final ViajeRepository viajeRepository;

    public InicioController(ViajeRepository viajeRepository){
        this.viajeRepository = viajeRepository;
    }


    @GetMapping("/")
    public String inicio(Model model){
        model.addAttribute("nombreApp", "JoinMe");
        model.addAttribute("viajes", viajeRepository.findAll());

        return "index";
    }


}
