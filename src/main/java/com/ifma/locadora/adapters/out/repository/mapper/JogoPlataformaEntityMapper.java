package com.ifma.locadora.adapters.out.repository.mapper;

import com.ifma.locadora.adapters.out.repository.entity.JogoPlataformaEntity;
import com.ifma.locadora.application.core.domain.JogoPlataforma;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface JogoPlataformaEntityMapper {

    JogoPlataformaEntity toJogoPlataformaEntity(JogoPlataforma jogoPlataforma);
    JogoPlataforma toJogoPlataforma(JogoPlataformaEntity jogoPlataformaEntity);
}
