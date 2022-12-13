package com.example.odontocao.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Dentista")
public class Dentista {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String nome;
    private String sobrenome;
    private Integer matricula;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Paciente> paciente;

    public Dentista() {
    }

//    public Dentista(String nome, String sobrenome, Integer matricula) {
//        this.nome = nobre;
//        this.sobrenome = sobrenome;
//        this.matricula = matricula;
//    }

    public Dentista(Integer id, String nome, String sobrenome, Integer matricula) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.matricula = matricula;
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

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Dentista{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", matricula=" + matricula +
                '}';
    }

}
