package com.ifma.locadora.config;

import com.ifma.locadora.adapters.out.CriarClienteAdapter;
import com.ifma.locadora.application.core.usecase.CriarClienteUC;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CriarClienteConfig {

    public CriarClienteUC criarClienteUC(CriarClienteAdapter criarClienteAdapter){
        return new CriarClienteUC(criarClienteAdapter);
    }
}
