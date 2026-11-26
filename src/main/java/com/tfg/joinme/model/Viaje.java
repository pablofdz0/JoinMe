package com.tfg.joinme.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Viaje {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    private String nombre;
    private String destino;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    protected Viaje(){
    }

    public Viaje(String nombre, String destino, LocalDate fechaInicio, LocalDate fechaFin)
    {
        this.nombre = nombre;
        this.destino = destino;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }



    public String getNombre(){
        return this.nombre;
    }

    public String getDestino(){
        return this.destino;
    }

    public LocalDate getFechaInicio(){
        return this.fechaInicio;
    }

    public LocalDate getFechaFin(){
        return this.fechaFin;
    }


}
