package com.ifma.locadora.config;

import com.ifma.locadora.adapters.out.CriarAcessorioAdapter;
import com.ifma.locadora.application.core.usecase.CriarAcessorioUC;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CriarAcessorioConfig {

    public CriarAcessorioUC criarAcessorioUC(CriarAcessorioAdapter criarAcessorioAdapter) {
        return new CriarAcessorioUC(criarAcessorioAdapter);
    }
}
