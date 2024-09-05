package com.ifma.locadora.adapters.out;

import com.ifma.locadora.adapters.out.repository.ClienteRepository;
import com.ifma.locadora.adapters.out.repository.mapper.ClienteEntityMapper;
import com.ifma.locadora.application.core.domain.Cliente;
import com.ifma.locadora.application.ports.out.CriarClienteOutputPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CriarClienteAdapter implements CriarClienteOutputPort {

    private final ClienteRepository clienteRepository;
    private final ClienteEntityMapper clienteEntityMapper;

    @Override
    public void criar(Cliente cliente) {
        var clienteEntity = clienteEntityMapper.toClienteEntity(cliente);
        clienteRepository.save(clienteEntity);
    }
}
