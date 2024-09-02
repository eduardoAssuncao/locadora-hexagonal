package com.ifma.locadora.config;

import com.ifma.locadora.adapters.out.CriarPlataformaAdapter;
import com.ifma.locadora.application.core.usecase.CriarPlataformaUC;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CriarPlataformaConfig {

    public CriarPlataformaUC criarPlataformaUC(CriarPlataformaAdapter criarPlataformaAdapter) {
        return new CriarPlataformaUC(criarPlataformaAdapter);
    }
}
