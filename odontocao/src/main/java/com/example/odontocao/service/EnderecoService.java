package com.example.odontocao.service;

import com.example.odontocao.repository.IDao;
import com.example.odontocao.model.Endereco;

import java.util.List;

public class EnderecoService {
    private IDao<Endereco> enderecoDao;

    public EnderecoService(IDao<Endereco> enderecoDao) {
        this.enderecoDao = enderecoDao;
    }
    public Endereco salvar(Endereco d){
        enderecoDao.salvar(d);
        return d;
    }
    public Endereco buscar(Integer id){
        return enderecoDao.buscar(id);
    }
    public List<Endereco> buscarTodos(){
        return enderecoDao.buscarTodos();
    }
    public void deletar(Integer id){
        enderecoDao.deletar(id);
    }
}