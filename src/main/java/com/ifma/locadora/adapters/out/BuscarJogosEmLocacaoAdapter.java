package com.ifma.locadora.adapters.out;

import com.ifma.locadora.adapters.out.repository.JogoRepository;
import com.ifma.locadora.adapters.out.repository.LocacaoRepository;
import com.ifma.locadora.adapters.out.repository.entity.JogoEntity;
import com.ifma.locadora.adapters.out.repository.mapper.JogoEntityMapper;
import com.ifma.locadora.application.core.domain.Jogo;
import com.ifma.locadora.application.ports.out.BuscarJogosEmLocacaoOutputPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class BuscarJogosEmLocacaoAdapter implements BuscarJogosEmLocacaoOutputPort {

    private final LocacaoRepository locacaoRepository;
    private final JogoRepository jogoRepository;
    private final JogoEntityMapper jogoEntityMapper;

    @Override
    public List<Jogo> buscarJogosEmLocacao(Integer id) {
        var locacaoEntity = locacaoRepository.findById(id).get();
        List<JogoEntity> jogosEntity = locacaoEntity.getItens().stream().map(jogo -> jogo.getId().getJogoPlataforma().getId().getJogo()).toList();
        return jogosEntity.stream().map(entity -> jogoEntityMapper.toJogo(entity)).toList();
    }
}
