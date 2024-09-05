package com.ifma.locadora.config;

import com.ifma.locadora.adapters.out.BuscarJogosEmLocacaoAdapter;
import com.ifma.locadora.application.core.usecase.BuscarJogosEmLocacaoUC;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BuscarJogosEmLocacaoConfig {

    public BuscarJogosEmLocacaoUC buscarJogosEmLocacaoUC(BuscarJogosEmLocacaoAdapter buscarJogosEmLocacaoAdapter) {
        return new BuscarJogosEmLocacaoUC(buscarJogosEmLocacaoAdapter);
    }
}
