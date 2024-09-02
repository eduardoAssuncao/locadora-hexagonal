package com.ifma.locadora.adapters.out;

import com.ifma.locadora.adapters.out.repository.LocacaoRepository;
import com.ifma.locadora.adapters.out.repository.mapper.LocacaoEntityMapper;
import com.ifma.locadora.application.core.domain.Locacao;
import com.ifma.locadora.application.ports.out.CriarLocacaoOutputPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CriarLocacaoAdapter implements CriarLocacaoOutputPort {

    private final LocacaoRepository locacaoRepository;
    private final LocacaoEntityMapper locacaoEntityMapper;

    @Override
    public void criar(Locacao locacao) {
        var locacaoEntity = locacaoEntityMapper.toLocacaoEntity(locacao);
        locacaoRepository.save(locacaoEntity);
    }
}
