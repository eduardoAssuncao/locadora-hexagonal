package com.ifma.locadora.application.ports.in;

import com.ifma.locadora.application.core.domain.ItemLocacao;

public interface AdicionarJogosEmLocacaoInputPort {

    void adicionar(Integer locacaoId, Integer jogoId, Integer plataformaId, ItemLocacao itemLocacao);
}
