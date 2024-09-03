package com.ifma.locadora.config;

import com.ifma.locadora.adapters.out.AdicionarJogoEmLocacaoAdapter;
import com.ifma.locadora.application.core.usecase.AdicionarJogosEmLocacaoUC;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AdicionarJogoEmLocacaoConfig {

    public AdicionarJogosEmLocacaoUC adicionarJogosEmLocacaoUC(AdicionarJogoEmLocacaoAdapter adicionarJogoEmLocacaoAdapter){
        return new AdicionarJogosEmLocacaoUC(adicionarJogoEmLocacaoAdapter);
    }
}
