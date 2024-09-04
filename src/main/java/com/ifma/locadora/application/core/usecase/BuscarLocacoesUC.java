package com.ifma.locadora.application.core.usecase;

import com.ifma.locadora.application.core.domain.Locacao;
import com.ifma.locadora.application.ports.in.BuscarLocacoesInputPort;
import com.ifma.locadora.application.ports.out.BuscarLocacoesOutputPort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuscarLocacoesUC implements BuscarLocacoesInputPort {

    private final BuscarLocacoesOutputPort buscarLocacoesOutputPort;

    public BuscarLocacoesUC(BuscarLocacoesOutputPort buscarLocacoesOutputPort) {
        this.buscarLocacoesOutputPort = buscarLocacoesOutputPort;
    }

    @Override
    public List<Locacao> buscarLocacoes() {
        try{
            return buscarLocacoesOutputPort.buscarLocacoes();
        } catch (RuntimeException e){
            throw new RuntimeException("Locações não encontradas.");
        }
    }
}
