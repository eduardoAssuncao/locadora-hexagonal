package com.ifma.locadora.application.ports.in;

import com.ifma.locadora.application.core.domain.Cliente;

public interface CriarClienteInputPort {

    void criar(Cliente cliente);
}
