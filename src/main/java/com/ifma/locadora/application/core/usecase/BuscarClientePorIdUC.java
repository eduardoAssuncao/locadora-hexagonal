package com.ifma.locadora.application.core.usecase;

import com.ifma.locadora.application.core.domain.Cliente;
import com.ifma.locadora.application.ports.in.BuscarClientePorIdInputPort;
import com.ifma.locadora.application.ports.out.BuscarClientePorIdOutputPort;
import org.springframework.stereotype.Service;

@Service
public class BuscarClientePorIdUC implements BuscarClientePorIdInputPort {

    private final BuscarClientePorIdOutputPort buscarClientePorIdOutputPort;

    public BuscarClientePorIdUC(BuscarClientePorIdOutputPort buscarClientePorIdOutputPort) {
        this.buscarClientePorIdOutputPort = buscarClientePorIdOutputPort;
    }

    @Override
    public Cliente buscarClientePorId(Integer id) {
        try{
            return buscarClientePorIdOutputPort.buscarClientePorId(id);
        } catch (RuntimeException e){
            throw new RuntimeException("Cliente não encontrado");
        }
    }
}
