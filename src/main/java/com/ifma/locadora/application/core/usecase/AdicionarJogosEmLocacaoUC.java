package com.ifma.locadora.application.core.usecase;

import com.ifma.locadora.application.core.domain.Jogo;
import com.ifma.locadora.application.ports.in.AdicionarJogosEmLocacaoInputPort;
import org.springframework.stereotype.Service;

@Service
public class AdicionarJogosEmLocacaoUC implements AdicionarJogosEmLocacaoInputPort {

    @Override
    public void adicionar(Jogo jogo) {

    }
}
