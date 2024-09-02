package com.ifma.locadora.adapters.out;

import com.ifma.locadora.adapters.out.repository.AcessorioRepository;
import com.ifma.locadora.adapters.out.repository.mapper.AcessorioEntityMapper;
import com.ifma.locadora.application.core.domain.Acessorio;
import com.ifma.locadora.application.ports.out.CriarAcessorioOutputPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CriarAcessorioAdapter implements CriarAcessorioOutputPort {

    private final AcessorioRepository acessorioRepository;
    private final AcessorioEntityMapper acessorioEntityMapper;

    @Override
    public void criar(Acessorio acessorio) {
        var acessorioEntity = acessorioEntityMapper.toAcessorioEntity(acessorio);
        acessorioRepository.save(acessorioEntity);
    }
}
