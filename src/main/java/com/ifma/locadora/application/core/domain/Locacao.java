package com.ifma.locadora.application.core.domain;

import java.time.LocalDate;

public class Locacao {

    private Integer id;
    private LocalDate data;

    public Locacao(){}

    public Locacao(Integer id, LocalDate data) {
        this.id = id;
        this.data = data;
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
}
