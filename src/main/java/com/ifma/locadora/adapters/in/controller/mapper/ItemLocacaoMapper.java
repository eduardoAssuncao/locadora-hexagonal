package com.ifma.locadora.adapters.in.controller.mapper;

import com.ifma.locadora.adapters.in.controller.request.ItemLocacaoRequest;
import com.ifma.locadora.adapters.in.controller.request.LocacaoRequest;
import com.ifma.locadora.adapters.in.controller.response.ItemLocacaoResponse;
import com.ifma.locadora.application.core.domain.ItemLocacao;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ItemLocacaoMapper {

    ItemLocacao toItemLocacao(ItemLocacaoRequest itemLocacaoRequest);
    ItemLocacaoResponse toItemLocacaoResponse(ItemLocacao itemLocacao);
}
