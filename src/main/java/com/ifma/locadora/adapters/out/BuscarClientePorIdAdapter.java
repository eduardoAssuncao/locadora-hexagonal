package com.ifma.locadora.adapters.out;

import com.ifma.locadora.adapters.out.repository.ClienteRepository;
import com.ifma.locadora.adapters.out.repository.mapper.ClienteEntityMapper;
import com.ifma.locadora.application.core.domain.Cliente;
import com.ifma.locadora.application.ports.out.BuscarClientePorIdOutputPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BuscarClientePorIdAdapter implements BuscarClientePorIdOutputPort {

    private final ClienteRepository clienteRepository;
    private final ClienteEntityMapper clienteEntityMapper;

    @Override
    public Cliente buscarClientePorId(Integer id) {
        var clienteEntity = clienteRepository.findById(id);
        return clienteEntity.map(entity -> clienteEntityMapper.toCliente(entity)).get();
    }
}
