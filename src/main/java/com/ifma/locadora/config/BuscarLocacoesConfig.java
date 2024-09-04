package com.ifma.locadora.config;

import com.ifma.locadora.adapters.out.BuscarLocacoesAdapter;
import com.ifma.locadora.application.core.usecase.BuscarLocacoesUC;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BuscarLocacoesConfig {

    public BuscarLocacoesUC buscarLocacoesUC(BuscarLocacoesAdapter buscarLocacoesAdapter) {
        return new BuscarLocacoesUC(buscarLocacoesAdapter);
    }
}
