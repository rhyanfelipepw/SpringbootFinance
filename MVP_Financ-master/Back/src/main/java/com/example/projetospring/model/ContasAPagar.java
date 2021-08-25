package com.example.projetospring.model;

import javax.persistence.*;

@Entity
public class ContasAPagar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String nomeConta;

    private Double valorConta;

    private String categoria;

    public ContasAPagar(){

    }

    public ContasAPagar(Long id, String nomeConta, Double valorConta, String categoria) {
        Id = id;
        this.nomeConta = nomeConta;
        this.valorConta = valorConta;
        this.categoria = categoria;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getNomeConta() {
        return nomeConta;
    }

    public void setNomeConta(String nomeConta) {
        this.nomeConta = nomeConta;
    }

    public Double getValorConta() {
        return valorConta;
    }

    public void setValorConta(Double valorConta) {
        this.valorConta = valorConta;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
