package com.ifma.locadora.application.ports.out;

import com.ifma.locadora.application.core.domain.Cliente;

public interface CriarClienteOutputPort {

    void criar(Cliente cliente);
}
