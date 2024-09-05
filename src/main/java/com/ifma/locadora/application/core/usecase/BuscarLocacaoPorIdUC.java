package com.ifma.locadora.application.core.usecase;

import com.ifma.locadora.application.core.domain.Locacao;
import com.ifma.locadora.application.ports.in.BuscarLocacaoPorIdInputPort;
import com.ifma.locadora.application.ports.out.BuscarLocacaoPorIdOutputPort;
import org.springframework.stereotype.Service;

@Service
public class BuscarLocacaoPorIdUC implements BuscarLocacaoPorIdInputPort {

    private final BuscarLocacaoPorIdOutputPort buscarLocacaoPorIdOutputPort;

    public BuscarLocacaoPorIdUC(BuscarLocacaoPorIdOutputPort buscarLocacaoPorIdOutputPort) {
        this.buscarLocacaoPorIdOutputPort = buscarLocacaoPorIdOutputPort;
    }

    @Override
    public Locacao buscarLocacaoPorId(Integer id) {
        try {
            return buscarLocacaoPorIdOutputPort.buscarLocacaoPorId(id);
        } catch (RuntimeException e) {
            throw new RuntimeException("Locacão não encontrada");
        }
    }
}
