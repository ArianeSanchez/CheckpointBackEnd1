package com.example.odontocao.service;

import com.example.odontocao.repository.DentistaRepository;
import com.example.odontocao.repository.IDao;
import com.example.odontocao.model.Dentista;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DentistaService {

    @Autowired
    DentistaRepository dentistaRepository;

    public DentistaService() {}

    public Dentista registrarDentista(Dentista odontologo) {
        return dentistaRepository.save(odontologo);

    }

    public void deletar(Integer id) {
        dentistaRepository.deleteById(id);
    }

    public Dentista buscar(Integer id) {
        return dentistaRepository.findById(id).get();
    }

    public List<Dentista> buscarTodos() {
        return dentistaRepository.findAll();
    }

    public Dentista atualizar(Dentista odontologo) {
        return dentistaRepository.save(odontologo);
    }

    public Dentista salvar(Dentista odontologo) {
        return dentistaRepository.save(odontologo);
    }

}


