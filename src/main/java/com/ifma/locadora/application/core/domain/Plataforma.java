package com.ifma.locadora.application.core.domain;

public class Plataforma {

    private Integer id;
    private String nome;

    public Plataforma(){}

    public Plataforma(Integer id, String nome){
        this.id = id;
        this.nome = nome;
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
}
