package com.ifma.locadora.application.core.domain;

import java.math.BigDecimal;
import java.util.LinkedHashSet;
import java.util.Set;

public class JogoPlataforma {

    private JogoPlataformaPK id = new JogoPlataformaPK();
    private BigDecimal precoDiario;
    private Set<ItemLocacao> locacoes = new LinkedHashSet<>();

    public JogoPlataforma() {}

    public JogoPlataforma(Jogo jogo, Plataforma plataforma, BigDecimal precoDiario, Set<ItemLocacao> locacoes) {
        id.setJogo(jogo);
        id.setPlataforma(plataforma);
        this.precoDiario = precoDiario;
        this.locacoes = locacoes;
    }

    public JogoPlataformaPK getId() {
        return id;
    }

    public void setId(JogoPlataformaPK id) {
        this.id = id;
    }

    public BigDecimal getPrecoDiario() {
        return precoDiario;
    }

    public void setPrecoDiario(BigDecimal precoDiario) {
        this.precoDiario = precoDiario;
    }

    public Set<ItemLocacao> getLocacoes() {
        return locacoes;
    }

    public void setLocacoes(Set<ItemLocacao> locacoes) {
        this.locacoes = locacoes;
    }
}
