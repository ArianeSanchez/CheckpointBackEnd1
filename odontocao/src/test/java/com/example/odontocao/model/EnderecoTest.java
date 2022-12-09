package com.example.odontocao.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnderecoTest {
Endereco endereco = new Endereco(1,"Rua Carioca","47","Rio de Janeiro","Rio de Janeiro");
    @Test
    void getId() {
        System.out.println("ID: " + endereco.getId());
    }

    @Test
    void setId() {
        endereco.setId(2);
        System.out.println("ID: " + endereco.getId());
    }

    @Test
    void getRua() {
        System.out.println("Rua: " + endereco.getRua());
    }

    @Test
    void setRua() {
        endereco.setRua("Rua Barão de Mauá");
        System.out.println("Rua: " + endereco.getRua());
    }

    @Test
    void getNumero() {
        System.out.println("Numero: " + endereco.getNumero());
    }

    @Test
    void setNumero() {
        endereco.setNumero("28");
        System.out.println("Numero: " + endereco.getNumero());
    }

    @Test
    void getBairro() {
        System.out.println("Bairro: " + endereco.getBairro());
    }

    @Test
    void setBairro() {
        endereco.setBairro("Carioca");
        System.out.println("Bairro: " + endereco.getBairro());
    }

    @Test
    void getCidade() {
        System.out.println("Cidade: " + endereco.getCidade());
    }

    @Test
    void setCidade() {
        endereco.setCidade("Niteroi");
        System.out.println("Cidade: " + endereco.getCidade());
    }

    @Test
    void testToString() {
        System.out.println("Enderço: " + endereco.toString());
    }
}