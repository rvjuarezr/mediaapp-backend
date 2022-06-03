package com.dev.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.model.Paciente;

public interface IPacienteRepo extends JpaRepository<Paciente, Integer>{

}
