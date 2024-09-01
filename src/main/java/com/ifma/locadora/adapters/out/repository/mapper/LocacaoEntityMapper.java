package com.ifma.locadora.adapters.out.repository.mapper;

import com.ifma.locadora.adapters.out.repository.entity.LocacaoEntity;
import com.ifma.locadora.application.core.domain.Locacao;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface LocacaoEntityMapper {

    LocacaoEntity toLocacaoEntity(Locacao locacao);
    Locacao toLocacao(LocacaoEntity locacaoEntity);
}
