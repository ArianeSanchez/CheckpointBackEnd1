package com.example.odontocao.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class DentistaTest {
Dentista dentista = new Dentista(1,"Emanuel","Nascimento", 1);
    @Test
    void getId() {
    System.out.println("ID:"  + dentista.getId());
    }

    @Test
    void setId() {
        dentista.setId(2);
        System.out.println("ID: " + dentista.getId());
    }

    @Test
    void getNome() {
        System.out.println("Nome: "  + dentista.getNome());
    }

    @Test
    void setNome() {
        dentista.setNome("Luccas");
        System.out.println("Nome:"  + dentista.getNome());
    }

    @Test
    void getSobrenome() {
        System.out.println("Sobrenome:" + dentista.getSobrenome());
    }

    @Test
    void setSobrenome() {
        dentista.setSobrenome("Santos");
        System.out.println("Sobrenome:"  + dentista.getSobrenome());
    }

    @Test
    void getMatricula() {
        System.out.println("Matrícula:" + dentista.getMatricula());
    }

    @Test
    void setMatricula() {
        dentista.setMatricula(5);
        System.out.println("Matrícula:"  + dentista.getMatricula());
    }

    @Test
    void testToString() {
        System.out.println(dentista.toString());
    }
}