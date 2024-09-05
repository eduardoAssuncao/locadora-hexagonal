package com.ifma.locadora.adapters.in.controller.mapper;

import com.ifma.locadora.adapters.in.controller.request.PlataformaRequest;
import com.ifma.locadora.adapters.in.controller.response.PlataformaResponse;
import com.ifma.locadora.application.core.domain.Plataforma;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PlataformaMapper {

    Plataforma toPlataforma(PlataformaRequest plataformaRequest);
    PlataformaResponse toPlataformaResponse(Plataforma plataforma);
}
