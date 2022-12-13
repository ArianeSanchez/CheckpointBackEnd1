package com.example.odontocao.controller;

import com.example.odontocao.repository.impl.PacienteDaoH2;
import com.example.odontocao.service.PacienteService;
import com.example.odontocao.model.Paciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {
    private PacienteService pacienteService = new PacienteService(new PacienteDaoH2());

    @Autowired

    @PostMapping()
    public ResponseEntity<Paciente> registrarPaciente(@RequestBody Paciente paciente) {

        return ResponseEntity.ok(pacienteService.salvar(paciente));

    }

    @PutMapping()
    public ResponseEntity<Paciente> atualizar(@RequestBody Paciente paciente) {
        ResponseEntity<Paciente> response = null;

        if (paciente.getId() != null && pacienteService.buscar(paciente.getId()) != null)
            response = ResponseEntity.ok(pacienteService.atualizar(paciente));
        else
            response = ResponseEntity.status(HttpStatus.NOT_FOUND).build();

        return response;
    }


    @DeleteMapping(value = "/delete/{idPaciente}")
    @ResponseBody
    public ResponseEntity<?> delete(@PathVariable Integer idPaciente) {
        pacienteService.deletar(idPaciente);
        return new ResponseEntity<String>("Paciente deletado", HttpStatus.OK);
    }

    /*
    @Autowired  // conexão entre eu service e meu model
    public List<Paciente> getPaciente(){
    return pacienteService.list

    }










  */

}
