package com.ifma.locadora.adapters.in.controller.mapper;

import com.ifma.locadora.adapters.in.controller.request.AcessorioRequest;
import com.ifma.locadora.adapters.in.controller.response.AcessorioResponse;
import com.ifma.locadora.application.core.domain.Acessorio;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AcessorioMapper {

    Acessorio toAcessorio(AcessorioRequest acessorioRequest);
    AcessorioResponse toAcessorioResponse(Acessorio acessorio);
}
