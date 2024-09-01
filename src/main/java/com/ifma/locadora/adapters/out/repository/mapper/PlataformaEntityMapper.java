package com.ifma.locadora.adapters.out.repository.mapper;

import com.ifma.locadora.adapters.out.repository.entity.PlataformaEntity;
import com.ifma.locadora.application.core.domain.Plataforma;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PlataformaEntityMapper {

    PlataformaEntity toPlataformaEntity(Plataforma plataforma);
    Plataforma toPlataforma(PlataformaEntity plataformaEntity);
}
