package com.ifma.locadora.config;

import com.ifma.locadora.adapters.out.CriarLocacaoAdapter;
import com.ifma.locadora.application.core.usecase.CriarLocacaoUC;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CriarLocacaoConfig {

    public CriarLocacaoUC criarLocacaoUC(CriarLocacaoAdapter criarLocacaoAdapter) {
        return new CriarLocacaoUC(criarLocacaoAdapter);
    }
}
