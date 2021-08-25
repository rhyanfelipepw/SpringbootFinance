package com.example.projetospring.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "usuario")
public class Usuario {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long usuarioId;
    private String nome;
    private String email;

    @JsonIgnore
    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<Despesa> despesasUsuario = new ArrayList<>();

    @JsonIgnore
    @OneToMany (mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<Receitas> receitasUsuario = new ArrayList<>();

    public Usuario(Long id, String nome, String email) {
        this.usuarioId = id;
        this.nome = nome;
        this.email = email;
    }

    public Usuario() {
    }

    public Long getId() {
        return usuarioId;
    }

    public void setId(Long id) {
        this.usuarioId = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Despesa> getDespesasUsuario() {
        return despesasUsuario;
    }
}
