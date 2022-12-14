package com.example.odontocao;

import com.example.odontocao.model.Endereco;
import com.example.odontocao.model.Paciente;
import com.example.odontocao.service.PacienteService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OdontocaoApplication {
	static PacienteService pacienteService;
	public static void main(String[] args) {
		SpringApplication.run(OdontocaoApplication.class, args);
		pacienteService.registrarPaciente(new Paciente(1,"Emanuel","Nascimento","123456789","10/12/20220",
				new Endereco(5,"Rua Almeida Cruz","71","Tubaguá","Imperial")));

	}



}
