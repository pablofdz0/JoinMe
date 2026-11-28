package com.tfg.joinme.controller;

import com.tfg.joinme.dto.ViajeForm;
import com.tfg.joinme.model.Viaje;
import com.tfg.joinme.repository.ViajeRepository;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
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
    public String crear(@Valid @ModelAttribute ViajeForm viajeForm, BindingResult resultado){
        if(viajeForm.getFechaInicio() != null & viajeForm.getFechaFin() != null &
            viajeForm.getFechaFin().isBefore(viajeForm.getFechaInicio())){
            resultado.rejectValue("fechaFin", "fechas.invalidas",
                    "La fecha de fin no puede ser antes que la de inicio");
        }

        if(resultado.hasErrors()){
            return "viajes/nuevo";
        }
        Viaje viaje = new Viaje(viajeForm.getNombre(), viajeForm.getDestino(),
                viajeForm.getFechaInicio(), viajeForm.getFechaFin());
        viajeRepository.save(viaje);
        return "redirect:/";
    }

}
