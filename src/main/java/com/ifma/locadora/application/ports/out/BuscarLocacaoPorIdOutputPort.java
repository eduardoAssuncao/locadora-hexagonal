package com.ifma.locadora.application.ports.out;

import com.ifma.locadora.application.core.domain.Locacao;

public interface BuscarLocacaoPorIdOutputPort {

    Locacao buscarLocacaoPorId(Integer id);
}
