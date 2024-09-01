package com.ifma.locadora.adapters.out.repository;

import com.ifma.locadora.adapters.out.repository.entity.LocacaoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocacaoRepository extends JpaRepository<LocacaoEntity, Integer> {
}
