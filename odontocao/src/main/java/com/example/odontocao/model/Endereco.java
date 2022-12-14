package com.example.odontocao.model;

import javax.persistence.*;

@Entity
@Table(name = "Endereco")
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String rua;
    private String numero;
    private String bairro;
    private String cidade;
    
    @OneToOne (mappedBy="endereco", fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private Paciente paciente;
    
    public Endereco() {
    }

    public Endereco(Integer id, String rua, String numero, String bairro, String cidade) {
        this.id = id;
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
    }
//    public Endereco(String rua, String numero, String bairro, String cidade) {
//        this.rua = rua;
//        this.numero = numero;
//        this.bairro = bairro;
//        this.cidade = cidade;
//    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "id=" + id +
                ", rua='" + rua + '\'' +
                ", numero='" + numero + '\'' +
                ", bairro='" + bairro + '\'' +
                ", cidade='" + cidade + '\'' +
                '}';
    }
}
