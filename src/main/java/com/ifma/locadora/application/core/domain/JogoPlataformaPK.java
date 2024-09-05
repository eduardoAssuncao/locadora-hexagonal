package com.ifma.locadora.application.core.domain;

public class JogoPlataformaPK {

    private Jogo jogo;
    private Plataforma plataforma;

    public JogoPlataformaPK() {}

    public JogoPlataformaPK(Jogo jogo, Plataforma plataforma) {
        this.jogo = jogo;
        this.plataforma = plataforma;
    }

    public Jogo getJogo() {
        return jogo;
    }

    public void setJogo(Jogo jogo) {
        this.jogo = jogo;
    }

    public Plataforma getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(Plataforma plataforma) {
        this.plataforma = plataforma;
    }
}
