package com.ifma.locadora.application.core.usecase;

import com.ifma.locadora.application.core.domain.Jogo;
import com.ifma.locadora.application.ports.in.BuscarJogosEmLocacaoInputPort;
import com.ifma.locadora.application.ports.out.BuscarJogosEmLocacaoOutputPort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuscarJogosEmLocacaoUC implements BuscarJogosEmLocacaoInputPort {

    private final BuscarJogosEmLocacaoOutputPort buscarJogosEmLocacaoOutputPort;

    public BuscarJogosEmLocacaoUC (BuscarJogosEmLocacaoOutputPort buscarJogosEmLocacaoOutputPort) {
        this.buscarJogosEmLocacaoOutputPort = buscarJogosEmLocacaoOutputPort;
    }

    @Override
    public List<Jogo> buscarJogosEmLocacao(Integer id) {
        try{
            return buscarJogosEmLocacaoOutputPort.buscarJogosEmLocacao(id);
        } catch (RuntimeException e){
            throw new RuntimeException("Jogos não encontrados.");
        }
    }
}
