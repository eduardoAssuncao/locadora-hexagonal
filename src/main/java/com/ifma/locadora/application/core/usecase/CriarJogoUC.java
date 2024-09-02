package com.ifma.locadora.application.core.usecase;

import com.ifma.locadora.application.core.domain.Jogo;
import com.ifma.locadora.application.ports.in.CriarJogoInputPort;
import com.ifma.locadora.application.ports.out.CriarJogoOutputPort;

public class CriarJogoUC implements CriarJogoInputPort {

    private final CriarJogoOutputPort criarJogoOutputPort;

    public CriarJogoUC(CriarJogoOutputPort criarJogoOutputPort) {
        this.criarJogoOutputPort = criarJogoOutputPort;
    }

    @Override
    public void criar(Jogo jogo) {
        criarJogoOutputPort.criar(jogo);
    }
}
