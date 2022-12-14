package com.example.odontocao.repository;


import com.example.odontocao.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<Paciente,Integer> {

}
