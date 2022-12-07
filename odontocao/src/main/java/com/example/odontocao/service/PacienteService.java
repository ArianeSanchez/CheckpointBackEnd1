package com.example.odontocao.service;

import com.example.odontocao.repository.IDao;
import com.example.odontocao.model.Paciente;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PacienteService {
    private IDao<Paciente> pacienteIDao;

    public PacienteService(IDao<Paciente> pacienteIDao) {
        this.pacienteIDao = pacienteIDao;
    }

    public Paciente salvar(Paciente p) {
        p.setData(new Date());
        return pacienteIDao.salvar(p);
    }

    public Paciente buscar(Integer id) {
        return pacienteIDao.buscar(id);
    }

    public List<Paciente> buscarTodos() {
        return pacienteIDao.buscarTodos();
    }

    public void deletar(Integer id) {
        pacienteIDao.deletar(id);
    }

    public Paciente atualizar(Paciente p) {
        return pacienteIDao.atualizar(p);
    }
}
