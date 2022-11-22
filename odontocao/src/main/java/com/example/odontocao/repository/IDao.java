package com.example.odontocao.repository;

import java.util.List;

public interface IDao<T> {
    T salvar(T t);
    T buscar(Integer id);
    void deletar(Integer id);
    List<T> buscarTodos();
    T atualizar(T t);
}
