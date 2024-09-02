package com.ifma.locadora.application.core.usecase;

import com.ifma.locadora.application.ports.in.CalcularCustoTotalLocacaoInputPort;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class CalcularCustoTotalLocacaoUC implements CalcularCustoTotalLocacaoInputPort {

    @Override
    public BigDecimal calcular(BigDecimal totalLocacao) {
        return null;
    }
}
