package com.example.projetospring.model;

import java.io.Serializable;

public class CategoriaSoma implements Serializable {
    private static final long serialVersionUID = 1L;

    private String categoriaNome;
    private Double soma;

    public CategoriaSoma() {

    }

    public CategoriaSoma(Categoria categoria, Double soma) {
        this.categoriaNome = categoria.getNomeCategoria();
        this.soma = soma;
    }

    public String getCategoriaNome() {
        return categoriaNome;
    }

    public void setCategoriaNome(String categoriaNome) {
        this.categoriaNome = categoriaNome;
    }

    public Double getSoma() {
        return soma;
    }

    public void setSoma(Double soma) {
        this.soma = soma;
    }
}
