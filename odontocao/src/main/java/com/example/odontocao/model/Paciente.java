package com.example.odontocao.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String nome;
    private String sobrenome;
    private String cpf;
    private Date data;
    @OneToOne
    private Endereco endereco;

    public Paciente() {
    }

    public Paciente(Integer id, String nome, String sobrenome, String cpf, Date data, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.data = data;
        this.endereco = endereco;
    }

//    public Paciente(String nome, String sobrenome, String cpf, Date data, Endereco endereco) {
//
//        this.nome = nome;
//        this.sobrenome = sobrenome;
//        this.cpf = cpf;
//        this.data = data;
//        this.endereco = endereco;
//    }


    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", dataDeEntrada=" + data +
                ", endereco=" + endereco +
                '}';
    }
}
