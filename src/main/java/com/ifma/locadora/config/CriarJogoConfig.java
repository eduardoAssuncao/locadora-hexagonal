package com.ifma.locadora.config;

import com.ifma.locadora.adapters.out.CriarJogoAdapter;
import com.ifma.locadora.application.core.usecase.CriarJogoUC;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CriarJogoConfig {

    public CriarJogoUC criarJogoUC(CriarJogoAdapter criarJogoAdapter) {
        return new CriarJogoUC(criarJogoAdapter);
    }
}
