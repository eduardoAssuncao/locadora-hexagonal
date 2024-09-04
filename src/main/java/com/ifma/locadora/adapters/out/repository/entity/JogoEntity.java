package com.ifma.locadora.adapters.out.repository.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.LinkedHashSet;
import java.util.Set;

@Data
@Entity
public class JogoEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String titulo;

    @OneToMany(mappedBy = "id.jogo", /*fetch = FetchType.EAGER,*/ cascade = CascadeType.ALL)
    private Set<JogoPlataformaEntity> itens = new LinkedHashSet<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JogoEntity that = (JogoEntity) o;
        return id != null && id.equals(that.id); // Use apenas o ID para comparação
    }

    @Override
    public int hashCode() {
        return 31;
    }
}
