package com.tfg.joinme.config;

import com.tfg.joinme.model.Viaje;
import com.tfg.joinme.repository.ViajeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;

@Configuration
public class DatosIniciales {

    @Bean
    CommandLineRunner cargaViajes(ViajeRepository viajeRepository){
        return args -> {
            if(viajeRepository.count() == 0){
                viajeRepository.save(new Viaje("Escapada a Lisboa", "Lisboa",
                        LocalDate.of(2027, 4, 10), LocalDate.of(2027, 4, 14)));
                viajeRepository.save(new Viaje("Semana Santa en Roma", "Roma",
                        LocalDate.of(2027, 3, 22), LocalDate.of(2027, 3, 28)));
                viajeRepository.save(new Viaje("Japón en verano", "Tokio",
                        LocalDate.of(2027, 8, 1), LocalDate.of(2027, 8, 15)));
            }
        };
    }

}
