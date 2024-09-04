package com.ifma.locadora.application.core.usecase;

import com.ifma.locadora.application.ports.in.CalcularCustoTotalInputPort;
import com.ifma.locadora.application.ports.out.CalcularCustoTotalOutputPort;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class CalcularCustoTotalUC implements CalcularCustoTotalInputPort {

    private final CalcularCustoTotalOutputPort calcularCustoTotalOutputPort;

    public CalcularCustoTotalUC(CalcularCustoTotalOutputPort calcularCustoTotalOutputPort) {
        this.calcularCustoTotalOutputPort = calcularCustoTotalOutputPort;
    }

    @Override
    public BigDecimal calcularCustoTotal(Integer locacaoId) {
        return null;
    }
}
