package com.ifma.locadora.application.ports.out;

import com.ifma.locadora.application.core.domain.ItemLocacao;

public interface AdicionarJogosEmLocacaoOutputPort {

    void adicionar(Integer locacaoId, Integer jogoId, Integer plataformaId, ItemLocacao itemLocacao);
}
