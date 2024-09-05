package com.ifma.locadora.application.ports.in;

import com.ifma.locadora.application.core.domain.Locacao;

public interface CriarLocacaoInputPort {

    void criar(Integer clienteId, Locacao locacao);
}
