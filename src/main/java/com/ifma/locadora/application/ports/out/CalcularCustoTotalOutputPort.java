package com.ifma.locadora.application.ports.out;

import com.ifma.locadora.application.core.domain.Locacao;

import java.math.BigDecimal;

public interface CalcularCustoTotalOutputPort {

    BigDecimal calcularCustoTotal(Integer locacaoId);
}
