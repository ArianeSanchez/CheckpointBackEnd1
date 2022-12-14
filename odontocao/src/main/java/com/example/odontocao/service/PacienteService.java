package com.example.odontocao.service;

import com.example.odontocao.model.Dentista;
import com.example.odontocao.model.Endereco;
import com.example.odontocao.repository.DentistaRepository;
import com.example.odontocao.repository.EnderecoRepository;
import com.example.odontocao.repository.IDao;
import com.example.odontocao.model.Paciente;
import com.example.odontocao.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;



@Service
public class PacienteService {


//    private IDao<Paciente> pacienteIDao;
//
//    public PacienteService(IDao<Paciente> pacienteIDao) {
//        this.pacienteIDao = pacienteIDao;
//    }
//
//    public Paciente salvar(Paciente p) {
//        p.setData(String.valueOf(new Date()));
//        return pacienteIDao.salvar(p);
//    }
//
//    public Paciente buscar(Integer id) {
//        return pacienteIDao.buscar(id);
//    }
//
//    public List<Paciente> buscarTodos() {
//        return pacienteIDao.buscarTodos();
//    }
//
//    public void deletar(Integer id) {
//        pacienteIDao.deletar(id);
//    }
//
//    public Paciente atualizar(Paciente p) {
//        return pacienteIDao.atualizar(p);
//    }
//}

//


    @Autowired
    PacienteRepository pacienteRepository;

    public PacienteService() {

    }

    public Paciente registrarPaciente(Paciente paciente) {
        return pacienteRepository.save(paciente);

    }

    public void deletar(Integer id) {
        pacienteRepository.deleteById(id);
    }

    public Paciente buscar(Integer id) {
        return pacienteRepository.findById(id).get();
    }

    public List<Paciente> buscarTodos() {
        return pacienteRepository.findAll();
    }

    public Paciente atualizar(Paciente paciente) {
        return pacienteRepository.save(paciente);
    }

    public Paciente salvar(Paciente paciente) {
        return pacienteRepository.save(paciente);
    }

}