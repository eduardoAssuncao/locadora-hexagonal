package com.ifma.locadora.config;

import com.ifma.locadora.adapters.out.BuscarLocacaoPorIdAdapter;
import com.ifma.locadora.application.core.usecase.BuscarLocacaoPorIdUC;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BuscarLocacaoPorIdConfig {

    public BuscarLocacaoPorIdUC buscarLocacaoPorIdUC(BuscarLocacaoPorIdAdapter buscarLocacaoPorIdAdapter) {
        return new BuscarLocacaoPorIdUC(buscarLocacaoPorIdAdapter);
    }
}
