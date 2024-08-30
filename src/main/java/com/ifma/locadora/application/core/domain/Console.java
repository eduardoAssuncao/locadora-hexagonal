package com.ifma.locadora.application.core.domain;

import java.math.BigDecimal;

public class Console {

    private Integer id;
    private String nome;
    private BigDecimal precoPorHora;

    public Console(){}

    public Console(Integer id, String nome, BigDecimal precoPorHora) {
        this.id = id;
        this.nome = nome;
        this.precoPorHora = precoPorHora;
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

    public BigDecimal getPrecoPorHora() {
        return precoPorHora;
    }

    public void setPrecoPorHora(BigDecimal precoPorHora) {
        this.precoPorHora = precoPorHora;
    }
}
