package com.ifma.locadora.adapters.out;

import com.ifma.locadora.adapters.out.repository.PlataformaRepository;
import com.ifma.locadora.adapters.out.repository.mapper.PlataformaEntityMapper;
import com.ifma.locadora.application.core.domain.Plataforma;
import com.ifma.locadora.application.ports.out.CriarPlataformaOutputPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CriarPlataformaAdapter implements CriarPlataformaOutputPort {

    private final PlataformaRepository plataformaRepository;
    private final PlataformaEntityMapper plataformaEntityMapper;

    @Override
    public void criar(Plataforma plataforma) {
        var plataformaEntity = plataformaEntityMapper.toPlataformaEntity(plataforma);
        plataformaRepository.save(plataformaEntity);
    }
}
