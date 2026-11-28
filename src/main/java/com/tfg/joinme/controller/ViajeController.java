package com.tfg.joinme.controller;

import com.tfg.joinme.dto.ViajeForm;
import com.tfg.joinme.model.Viaje;
import com.tfg.joinme.repository.ViajeRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/viajes")
public class ViajeController {
    private final ViajeRepository viajeRepository;

    public ViajeController(ViajeRepository viajeRepository){
        this.viajeRepository = viajeRepository;
    }

    @GetMapping("/nuevo")
    public String mostrarFormulario(Model model){
        model.addAttribute("viajeForm", new ViajeForm());
        return "viajes/nuevo";
    }

    @PostMapping
    public String crear(@ModelAttribute ViajeForm viajeForm){
        Viaje viaje = new Viaje(viajeForm.getNombre(), viajeForm.getDestino(), viajeForm.getFechaInicio(), viajeForm.getFechaFin());
        viajeRepository.save(viaje);
        return "redirect:/";
    }

}
