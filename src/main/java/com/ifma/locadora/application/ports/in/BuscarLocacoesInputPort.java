package com.ifma.locadora.application.ports.in;

import com.ifma.locadora.application.core.domain.Locacao;

import java.util.List;

public interface BuscarLocacoesInputPort {

    List<Locacao> buscarLocacoes();
}
