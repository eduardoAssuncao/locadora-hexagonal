package com.ifma.locadora.application.ports.in;

import com.ifma.locadora.application.core.domain.Locacao;

import java.math.BigDecimal;

public interface CalcularCustoTotalInputPort {

    BigDecimal calcularCustoTotal(Integer locacaoId);
}
