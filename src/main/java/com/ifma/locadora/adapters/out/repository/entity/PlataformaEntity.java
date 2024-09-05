package com.ifma.locadora.adapters.out.repository.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@SequenceGenerator(name = "plataforma_entity_seq", sequenceName = "plataforma_entity_seq", allocationSize = 1)
public class PlataformaEntity {

    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "plataforma_entity_seq")
    private Integer id;
    private String nome;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlataformaEntity that = (PlataformaEntity) o;
        return id != null && id.equals(that.id); // Use apenas o ID para comparação
    }

    @Override
    public int hashCode() {
        return 31;
    }
}
