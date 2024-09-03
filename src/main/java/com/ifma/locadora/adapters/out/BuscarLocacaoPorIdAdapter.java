package com.ifma.locadora.adapters.out;

import com.ifma.locadora.adapters.out.repository.LocacaoRepository;
import com.ifma.locadora.adapters.out.repository.mapper.LocacaoEntityMapper;
import com.ifma.locadora.application.core.domain.Locacao;
import com.ifma.locadora.application.ports.out.BuscarLocacaoPorIdOutputPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BuscarLocacaoPorIdAdapter implements BuscarLocacaoPorIdOutputPort {

    private final LocacaoRepository locacaoRepository;
    private final LocacaoEntityMapper locacaoEntityMapper;

    @Override
    public Locacao buscarLocacaoPorId(Integer id) {
        var locacaoEntity = locacaoRepository.findById(id);
        return locacaoEntity.map(entity -> locacaoEntityMapper.toLocacao(entity)).get();
    }
}
