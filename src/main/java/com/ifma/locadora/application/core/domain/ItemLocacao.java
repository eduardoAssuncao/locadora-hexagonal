package com.ifma.locadora.application.core.domain;

public class ItemLocacao {

    private ItemLocacaoPK id = new ItemLocacaoPK();

    private Integer dias;
    private Integer quantidade;

    public ItemLocacao(){}

    public ItemLocacao(JogoPlataforma jogoPlataforma, Locacao locacao, Integer dias, Integer quantidade) {
        id.setJogoPlataforma(jogoPlataforma);
        id.setLocacao(locacao);
        this.dias = dias;
        this.quantidade = quantidade;
    }

    public ItemLocacaoPK getId() {
        return id;
    }

    public void setId(ItemLocacaoPK id) {
        this.id = id;
    }

    public Integer getDias() {
        return dias;
    }

    public void setDias(Integer dias) {
        this.dias = dias;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
}
