package com.ifma.locadora.adapters.out;

import com.ifma.locadora.adapters.out.repository.LocacaoRepository;
import com.ifma.locadora.adapters.out.repository.entity.LocacaoEntity;
import com.ifma.locadora.adapters.out.repository.mapper.LocacaoEntityMapper;
import com.ifma.locadora.application.core.domain.Locacao;
import com.ifma.locadora.application.ports.out.BuscarLocacoesOutputPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class BuscarLocacoesAdapter implements BuscarLocacoesOutputPort {

    private final LocacaoRepository locacaoRepository;
    private final LocacaoEntityMapper locacaoEntityMapper;

    @Override
    public List<Locacao> buscarLocacoes() {
        List<LocacaoEntity> locacoesEntity = locacaoRepository.findAll();
        return locacoesEntity.stream().map(entity -> locacaoEntityMapper.toLocacao(entity)).toList();
    }
}
