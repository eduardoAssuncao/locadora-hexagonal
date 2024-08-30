package com.ifma.locadora.adapters.out.repository.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class ItemLocacaoEntity {

    @EmbeddedId
    private ItemLocacaoPK id = new ItemLocacaoPK();

    private Integer dias;
    private Integer quantidade;
}
