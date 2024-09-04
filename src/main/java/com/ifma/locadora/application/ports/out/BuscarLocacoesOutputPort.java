package com.ifma.locadora.application.ports.out;

import com.ifma.locadora.application.core.domain.Locacao;

import java.util.List;

public interface BuscarLocacoesOutputPort {

    List<Locacao> buscarLocacoes();
}
