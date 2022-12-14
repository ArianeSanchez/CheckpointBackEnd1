package com.example.odontocao.service;
import com.example.odontocao.model.Dentista;
import com.example.odontocao.model.Endereco;
import com.example.odontocao.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnderecoService {
@Autowired
EnderecoRepository enderecoRepository;


    public EnderecoService() {}

    public Endereco registrarDentista(Endereco endereco) {
        return enderecoRepository.save(endereco);

    }

    public void deletar(Integer id) {
        enderecoRepository.deleteById(id);
    }

    public Endereco buscar(Integer id) {
        return enderecoRepository.findById(id).get();
    }

    public List<Endereco> buscarTodos() {
        return enderecoRepository.findAll();
    }

    public Endereco atualizar(Endereco endereco) {
        return enderecoRepository.save(endereco);
    }

    public Endereco salvar(Endereco endereco) {
        return enderecoRepository.save(endereco);
    }

};
