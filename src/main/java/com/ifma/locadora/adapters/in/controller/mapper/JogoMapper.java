package com.ifma.locadora.adapters.in.controller.mapper;

import com.ifma.locadora.adapters.in.controller.request.JogoRequest;
import com.ifma.locadora.adapters.in.controller.response.JogoResponse;
import com.ifma.locadora.application.core.domain.Jogo;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface JogoMapper {

    Jogo toJogo(JogoRequest jogoRequest);
    JogoResponse toJogoResponse(Jogo jogo);
}
