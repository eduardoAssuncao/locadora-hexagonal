package com.ifma.locadora.application.core.usecase;

import com.ifma.locadora.application.core.domain.Locacao;
import com.ifma.locadora.application.ports.in.CriarLocacaoInputPort;
import com.ifma.locadora.application.ports.out.CriarLocacaoOutputPort;
import org.springframework.stereotype.Service;

@Service
public class CriarLocacaoUC implements CriarLocacaoInputPort {

    private final CriarLocacaoOutputPort criarLocacaoOutputPort;

    public CriarLocacaoUC(CriarLocacaoOutputPort criarLocacaoOutputPort){
        this.criarLocacaoOutputPort = criarLocacaoOutputPort;
    }

    @Override
    public void criar(Integer clienteId, Locacao locacao) {
        criarLocacaoOutputPort.criar(clienteId, locacao);
    }
}
