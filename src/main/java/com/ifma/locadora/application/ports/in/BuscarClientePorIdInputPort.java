package com.ifma.locadora.application.ports.in;

import com.ifma.locadora.application.core.domain.Cliente;

public interface BuscarClientePorIdInputPort {

    Cliente buscarClientePorId(Integer id);
}
