package com.ifma.locadora.adapters.out.repository;

import com.ifma.locadora.adapters.out.repository.entity.JogoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JogoRepository extends JpaRepository<JogoEntity, Integer> {
}
