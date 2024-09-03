package com.ifma.locadora.adapters.out.repository;

import com.ifma.locadora.adapters.out.repository.entity.ItemLocacaoEntity;
import com.ifma.locadora.adapters.out.repository.entity.ItemLocacaoEntityPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemLocacaoRepository extends JpaRepository<ItemLocacaoEntity, ItemLocacaoEntityPK> {
}
