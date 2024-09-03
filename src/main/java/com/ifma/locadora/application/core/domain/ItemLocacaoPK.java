package com.ifma.locadora.application.core.domain;

public class ItemLocacaoPK {

    private JogoPlataforma jogoPlataforma;
    private Locacao locacao;

    public ItemLocacaoPK() {}

    public ItemLocacaoPK(JogoPlataforma jogoPlataforma, Locacao locacao) {
        this.jogoPlataforma = jogoPlataforma;
        this.locacao = locacao;
    }

    public JogoPlataforma getJogoPlataforma() {
        return jogoPlataforma;
    }

    public void setJogoPlataforma(JogoPlataforma jogoPlataforma) {
        this.jogoPlataforma = jogoPlataforma;
    }

    public Locacao getLocacao() {
        return locacao;
    }

    public void setLocacao(Locacao locacao) {
        this.locacao = locacao;
    }
}
