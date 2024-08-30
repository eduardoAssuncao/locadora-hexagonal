package com.ifma.locadora.adapters.out.repository.entity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.io.Serializable;

@Data
@Embeddable
public class ItemLocacaoPK implements Serializable {

    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "jogo_id", referencedColumnName = "jogo_id"),
            @JoinColumn(name = "plataforma_id", referencedColumnName = "plataforma_id")
    })
    private JogoPlataformaEntity jogoPlataforma;

    @ManyToOne
    @JoinColumn(name = "locacao_id")
    private LocacaoEntity locacao;
}
