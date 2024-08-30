package com.ifma.locadora.application.core.domain;

public class Jogo {

    private Integer id;
    private String titulo;

    public Jogo(){}

    public Jogo(Integer id, String titulo) {
        this.id = id;
        this.titulo = titulo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
