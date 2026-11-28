package com.tfg.joinme.model;

import jakarta.persistence.*;

@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String password;

    protected Usuario(){

    }

    public Usuario(String email, String nombre, String password){
        this.email = email;
        this.nombre = nombre;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPassword() {
        return password;
    }
}
