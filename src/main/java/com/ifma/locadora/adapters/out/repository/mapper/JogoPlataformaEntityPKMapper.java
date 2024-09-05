package com.ifma.locadora.adapters.out.repository.mapper;

import com.ifma.locadora.adapters.out.repository.entity.JogoPlataformaEntityPK;
import com.ifma.locadora.application.core.domain.JogoPlataformaPK;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface JogoPlataformaEntityPKMapper {

    JogoPlataformaEntityPK ToJogoPlataformaEntityPK(JogoPlataformaPK jogoPlataforma);
    JogoPlataformaPK toJogoPlataformaPK(JogoPlataformaEntityPK jogoPlataformaEntityPK);
}
