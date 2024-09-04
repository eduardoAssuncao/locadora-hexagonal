package com.ifma.locadora.config;

import com.ifma.locadora.adapters.out.CalcularCustoTotalAdapter;
import com.ifma.locadora.application.core.usecase.CalcularCustoTotalUC;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CalcularCustoTotalConfig {

    public CalcularCustoTotalUC calcularCustoTotal(CalcularCustoTotalAdapter calcularCustoTotalAdapter) {
        return new CalcularCustoTotalUC(calcularCustoTotalAdapter);
    }
}
