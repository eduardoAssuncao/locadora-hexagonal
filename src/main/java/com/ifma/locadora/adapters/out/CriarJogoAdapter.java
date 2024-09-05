package com.ifma.locadora.adapters.out;

import com.ifma.locadora.adapters.out.repository.JogoRepository;
import com.ifma.locadora.adapters.out.repository.mapper.JogoEntityMapper;
import com.ifma.locadora.application.core.domain.Jogo;
import com.ifma.locadora.application.ports.out.CriarJogoOutputPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CriarJogoAdapter implements CriarJogoOutputPort {

    private final JogoRepository jogoRepository;
    private final JogoEntityMapper jogoEntityMapper;

    @Override
    public void criar(Jogo jogo) {
        var jogoEntity = jogoEntityMapper.toJogoEntity(jogo);
        jogoRepository.save(jogoEntity);
    }
}
