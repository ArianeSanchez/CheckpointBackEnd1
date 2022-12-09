package com.example.odontocao.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class DentistaTest {
Dentista dentista = new Dentista(1,"Emanuel","Nascimento", 1);
    @Test
    void getId() {
    System.out.println("Retorno do ID:"  + dentista.getId());
    }

    @Test
    void setId() {
        dentista.setId(2);
        System.out.println("ID Alterado de 1 para 2 > resultado: " + dentista.getId());
    }

    @Test
    void getNome() {
        System.out.println("Retorno do Nome:"  + dentista.getNome());
    }

    @Test
    void setNome() {
        dentista.setNome("Luccas");
        System.out.println("Retorno da alteração de nome > Emanuel para Luccas, Resultado:"  + dentista.getNome());
    }

    @Test
    void getSobrenome() {
        System.out.println("Retorno do Sobrenome:" + dentista.getSobrenome());
    }

    @Test
    void setSobrenome() {
        dentista.setSobrenome("Santos");
        System.out.println("Alteração de sobrenome > Nascimento para Santos, Resultado:"  + dentista.getSobrenome());
    }

    @Test
    void getMatricula() {
        System.out.println("Retorno da matrícula:" + dentista.getMatricula());
    }

    @Test
    void setMatricula() {
        dentista.setMatricula(5);
        System.out.println("Alteração de Matrícula > 1 para 5, Resultado:"  + dentista.getMatricula());
    }

    @Test
    void testToString() {
        System.out.println(dentista.toString());
    }
}