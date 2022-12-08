package com.example.odontocao.service;

import com.example.odontocao.repository.IDao;
import com.example.odontocao.model.Dentista;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DentistaService {
    private IDao<Dentista> dentistaDao;

    public DentistaService(IDao<Dentista> dentistaDao) {
        this.dentistaDao = dentistaDao;
    }

    public Dentista registrarDentista(Dentista odontologo) {
        return dentistaDao.salvar(odontologo);

    }

    public void deletar(Integer id) {
        dentistaDao.deletar(id);
    }

    public Dentista buscar(Integer id) {
        return dentistaDao.buscar(id);
    }

    public List<Dentista> buscarTodos() {
        return dentistaDao.buscarTodos();
    }

    public Dentista atualizar(Dentista odontologo) {
        return dentistaDao.atualizar(odontologo);
    }

    public Dentista salvar(Dentista odontologo) {
        return dentistaDao.salvar(odontologo);
    }

}


