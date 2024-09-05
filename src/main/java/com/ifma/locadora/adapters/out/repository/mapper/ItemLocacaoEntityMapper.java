package com.ifma.locadora.adapters.out.repository.mapper;

import com.ifma.locadora.adapters.out.repository.entity.ItemLocacaoEntity;
import com.ifma.locadora.application.core.domain.ItemLocacao;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ItemLocacaoEntityMapper {

    ItemLocacaoEntity toItemLocacaoEntity(ItemLocacao itemLocacao);
    ItemLocacao toItemLocacao(ItemLocacaoEntity itemLocacaoEntity);
}
