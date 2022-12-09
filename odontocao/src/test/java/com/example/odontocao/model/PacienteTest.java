package com.example.odontocao.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PacienteTest {
Paciente paciente = new Paciente(1,"Gabriel","Azevedo","123456789","08/10/2022",new Endereco(1,"Rua Barão de Maua","37","Carioca","Rio de Janeiro"));
    @Test
    void getSobrenome() {
    System.out.println("Sobrenome: " + paciente.getSobrenome());
    }

    @Test
    void setSobrenome() {
        paciente.setSobrenome("Santos");
        System.out.println("Novo Sobrenome: " + paciente.getSobrenome());
    }

    @Test
    void getId() {
        System.out.println("ID: " + paciente.getId());
    }

    @Test
    void setId() {
        paciente.setId(5);
        System.out.println("Novo ID: " + paciente.getId());
    }

    @Test
    void getNome() {
        System.out.println("Nome: " + paciente.getNome());
    }

    @Test
    void setNome() {
        paciente.setNome("Gabbriel");
        System.out.println("Novo Nome: " + paciente.getNome());
    }

    @Test
    void getCpf() {
        System.out.println(paciente.getCpf());
    }

    @Test
    void setCpf() {
        paciente.setCpf("152432521421");
        System.out.println("Novo CPF: " + paciente.getCpf());
    }

    @Test
    void getData() {
        System.out.println(paciente.getData());
    }

    @Test
    void setData() {
        paciente.setData("09/12/2022");
        System.out.println("Nova Data: " + paciente.getData());
    }

    @Test
    void getEndereco() {
        System.out.println(paciente.getEndereco());
    }

    @Test
    void setEndereco() {
    paciente.setEndereco(new Endereco(5,"Rua Almeida Cruz","71","Tubaguá","Imperial"));
    System.out.println("Novo Endereço: " + paciente.getEndereco());
    }

    @Test
    void testToString() {
        System.out.println(paciente.toString());
    }
}