package com.ifma.locadora.application.ports.out;

import com.ifma.locadora.application.core.domain.Cliente;

public interface BuscarClientePorIdOutputPort {

    Cliente buscarClientePorId(Integer id);
}
