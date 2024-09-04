package com.ifma.locadora.adapters.out.repository.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

@Data
@Entity
public class LocacaoEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private LocalDate data;

    @OneToMany(mappedBy = "id.locacao", cascade = CascadeType.ALL)
    private Set<ItemLocacaoEntity> itens = new LinkedHashSet<>();

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private ClienteEntity cliente;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LocacaoEntity that = (LocacaoEntity) o;
        return id != null && id.equals(that.id); // Use apenas o ID para comparação
    }

    @Override
    public int hashCode() {
        return 31;
    }
}
