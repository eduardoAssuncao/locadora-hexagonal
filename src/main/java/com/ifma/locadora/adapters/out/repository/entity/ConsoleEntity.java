package com.ifma.locadora.adapters.out.repository.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.LinkedHashSet;
import java.util.Set;

@Data
@Entity
public class ConsoleEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private BigDecimal precoPorHora;

    @OneToMany(mappedBy = "console")
    private Set<UtilizacaoDoConsolePeloClienteEntity> utilizacoes = new LinkedHashSet<>();

    @ManyToMany
    @JoinTable(
            name = "console_acessorio",
            joinColumns = @JoinColumn(name = "console_id"),
            inverseJoinColumns = @JoinColumn(name = "acessorio_id")
    )
    private Set<AcessorioEntity> acessorios = new LinkedHashSet<>();
}
