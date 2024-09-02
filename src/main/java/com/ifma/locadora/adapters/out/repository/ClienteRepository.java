package com.ifma.locadora.adapters.out.repository;

import com.ifma.locadora.adapters.out.repository.entity.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<ClienteEntity, Integer> {
}
