package com.ifma.locadora.adapters.out.repository.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.CascadeType;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.math.BigDecimal;
import java.util.LinkedHashSet;
import java.util.Set;

@Data
@Entity
public class JogoPlataformaEntity {

    @EmbeddedId
    //@JsonIgnore
    private JogoPlataformaPK id = new JogoPlataformaPK();

    private BigDecimal precoDiario;

    @OneToMany(mappedBy = "id.jogoPlataforma", cascade = CascadeType.ALL)
    private Set<ItemLocacaoEntity> locacoes = new LinkedHashSet<>();
}
