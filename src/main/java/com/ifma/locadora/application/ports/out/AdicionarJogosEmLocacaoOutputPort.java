package com.ifma.locadora.application.ports.out;

import com.ifma.locadora.application.core.domain.Jogo;

public interface AdicionarJogosEmLocacaoOutputPort {

    void adicionar(Jogo jogo);
}
