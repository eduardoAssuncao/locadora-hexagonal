package com.ifma.locadora.application.core.domain;

import java.time.LocalDate;

public class Locacao {

    private Integer id;
    private LocalDate data;
    private Cliente cliente;

    public Locacao(){}

    public Locacao(Integer id, LocalDate data, Cliente cliente) {
        this.id = id;
        this.data = data;
        this.cliente = cliente;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
