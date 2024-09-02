package com.ifma.locadora.adapters.in.controller.mapper;

import com.ifma.locadora.adapters.in.controller.request.LocacaoRequest;
import com.ifma.locadora.adapters.in.controller.response.LocacaoResponse;
import com.ifma.locadora.application.core.domain.Locacao;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface LocacaoMapper {

    Locacao toLocacao(LocacaoRequest locacaoRequest);
    LocacaoResponse toLocacaoResponse(Locacao locacao);
}
