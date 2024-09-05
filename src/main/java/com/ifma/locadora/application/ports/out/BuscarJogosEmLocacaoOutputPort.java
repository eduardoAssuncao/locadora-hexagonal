package com.ifma.locadora.application.ports.out;

import com.ifma.locadora.application.core.domain.Jogo;

import java.util.List;

public interface BuscarJogosEmLocacaoOutputPort {

    List<Jogo> buscarJogosEmLocacao(Integer id);
}
