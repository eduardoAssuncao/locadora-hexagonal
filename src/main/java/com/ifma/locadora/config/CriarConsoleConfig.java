package com.ifma.locadora.config;

import com.ifma.locadora.adapters.out.CriarConsoleAdapter;
import com.ifma.locadora.application.core.usecase.CriarConsoleUC;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CriarConsoleConfig {

    public CriarConsoleUC criarConsoleUC(CriarConsoleAdapter criarConsoleAdapter) {
        return new CriarConsoleUC(criarConsoleAdapter);
    }
}
