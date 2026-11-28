package com.tfg.joinme.repository;

import com.tfg.joinme.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findbyEmail(String email);

    boolean existsByEmail(String email);
}