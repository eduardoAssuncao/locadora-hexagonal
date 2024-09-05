package com.ifma.locadora.application.ports.in;

import com.ifma.locadora.application.core.domain.Jogo;

import java.util.List;

public interface BuscarJogosEmLocacaoInputPort {

    List<Jogo> buscarJogosEmLocacao(Integer id);
}
