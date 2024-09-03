package com.ifma.locadora.adapters.out;

import com.ifma.locadora.application.core.domain.Jogo;
import com.ifma.locadora.application.ports.out.AdicionarJogosEmLocacaoOutputPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AdicionarJogoEmLocacaoAdapter implements AdicionarJogosEmLocacaoOutputPort {

    @Override
    public void adicionar(Jogo jogo) {

    }
}
