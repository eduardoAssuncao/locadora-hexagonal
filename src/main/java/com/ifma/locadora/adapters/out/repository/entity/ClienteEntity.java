package com.ifma.locadora.adapters.out.repository.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.LinkedHashSet;
import java.util.Set;

@Data
@Entity
public class ClienteEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String email;
    private String telefone;
    private String senha;

    @OneToMany(mappedBy = "cliente")
    private Set<LocacaoEntity> locacoes = new LinkedHashSet<>();

    @OneToMany(mappedBy = "cliente")
    private Set<UtilizacaoDoConsolePeloClienteEntity> utilizacoes = new LinkedHashSet<>();
}
