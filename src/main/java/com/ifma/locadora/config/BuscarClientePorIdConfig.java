package com.ifma.locadora.config;

import com.ifma.locadora.adapters.out.BuscarClientePorIdAdapter;
import com.ifma.locadora.application.core.usecase.BuscarClientePorIdUC;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BuscarClientePorIdConfig {

    public BuscarClientePorIdUC buscarClientePorIdUC(BuscarClientePorIdAdapter buscarClientePorIdAdapter) {
        return new BuscarClientePorIdUC(buscarClientePorIdAdapter);
    }
}
