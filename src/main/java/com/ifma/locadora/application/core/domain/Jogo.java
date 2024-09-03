package com.ifma.locadora.application.core.domain;

import java.util.LinkedHashSet;
import java.util.Set;

public class Jogo {

    private Integer id;
    private String titulo;
    private Set<JogoPlataforma> itens = new LinkedHashSet<>();

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
