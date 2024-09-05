package com.ifma.locadora.application.core.usecase;

import com.ifma.locadora.application.core.domain.Cliente;
import com.ifma.locadora.application.ports.in.CriarClienteInputPort;
import com.ifma.locadora.application.ports.out.CriarClienteOutputPort;

public class CriarClienteUC implements CriarClienteInputPort {

    private final CriarClienteOutputPort criarClienteOutputPort;

    public CriarClienteUC(CriarClienteOutputPort criarClienteOutputPort){
        this.criarClienteOutputPort = criarClienteOutputPort;
    }

    @Override
    public void criar(Cliente cliente) {
        criarClienteOutputPort.criar(cliente);
    }
}
