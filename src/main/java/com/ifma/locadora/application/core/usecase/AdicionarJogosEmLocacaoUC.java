package com.ifma.locadora.application.core.usecase;

import com.ifma.locadora.application.core.domain.ItemLocacao;
import com.ifma.locadora.application.ports.in.AdicionarJogosEmLocacaoInputPort;
import com.ifma.locadora.application.ports.out.AdicionarJogosEmLocacaoOutputPort;
import org.springframework.stereotype.Service;

@Service
public class AdicionarJogosEmLocacaoUC implements AdicionarJogosEmLocacaoInputPort {

    private final AdicionarJogosEmLocacaoOutputPort adicionarJogosEmLocacaoOutputPort;

    public AdicionarJogosEmLocacaoUC(AdicionarJogosEmLocacaoOutputPort adicionarJogosEmLocacaoOutputPort) {
        this.adicionarJogosEmLocacaoOutputPort = adicionarJogosEmLocacaoOutputPort;
    }

    @Override
    public void adicionar(Integer locacaoId, Integer jogoId, Integer plataformaId, ItemLocacao itemLocacao) {
        try{
            adicionarJogosEmLocacaoOutputPort.adicionar(locacaoId, jogoId, plataformaId, itemLocacao);
        } catch (RuntimeException e){
            throw new RuntimeException("Não foi possivel adicionar jogo");
        }
    }
}
