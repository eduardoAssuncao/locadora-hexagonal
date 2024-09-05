package com.ifma.locadora.application.core.usecase;

import com.ifma.locadora.application.core.domain.Acessorio;
import com.ifma.locadora.application.ports.in.CriarAcessorioInputPort;
import com.ifma.locadora.application.ports.out.CriarAcessorioOutputPort;

public class CriarAcessorioUC implements CriarAcessorioInputPort {

    private final CriarAcessorioOutputPort criarAcessorioOutputPort;

    public CriarAcessorioUC(CriarAcessorioOutputPort criarAcessorioOutputPort) {
        this.criarAcessorioOutputPort = criarAcessorioOutputPort;
    }

    @Override
    public void criar(Acessorio acessorio) {
        criarAcessorioOutputPort.criar(acessorio);
    }
}
