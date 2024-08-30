package com.ifma.locadora.adapters.out.repository.entity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.io.Serializable;

@Data
@Embeddable
public class JogoPlataformaPK implements Serializable {

    @ManyToOne
    @JoinColumn(name = "jogo_id")
    private JogoEntity jogo;

    @ManyToOne
    @JoinColumn(name = "plataforma_id")
    private PlataformaEntity plataforma;
}
