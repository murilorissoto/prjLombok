package com.MuriloAntunes.lombok.projetoLombok.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MuriloAntunes.lombok.projetoLombok.entities.*;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}