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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClienteEntity that = (ClienteEntity) o;
        return id != null && id.equals(that.id); // Use apenas o ID para comparação
    }

    @Override
    public int hashCode() {
        return 31;
    }
}
