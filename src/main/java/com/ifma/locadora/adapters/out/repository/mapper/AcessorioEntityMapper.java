package com.ifma.locadora.adapters.out.repository.mapper;

import com.ifma.locadora.adapters.out.repository.entity.AcessorioEntity;
import com.ifma.locadora.application.core.domain.Acessorio;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AcessorioEntityMapper {

    AcessorioEntity toAcessorioEntity(Acessorio acessorio);
    Acessorio toAcessorio(AcessorioEntity acessorioEntity);
}
