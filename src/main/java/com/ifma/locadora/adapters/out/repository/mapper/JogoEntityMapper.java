package com.ifma.locadora.adapters.out.repository.mapper;

import com.ifma.locadora.adapters.out.repository.entity.JogoEntity;
import com.ifma.locadora.application.core.domain.Jogo;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface JogoEntityMapper {

    JogoEntity toJogoEntity(Jogo jogo);
    Jogo toJogo(JogoEntity jogoEntity);
}
