package com.ifma.locadora.application.ports.out;

import java.math.BigDecimal;

public interface CalcularCustoTotalLocacaoOutputPort {

    BigDecimal calcular(BigDecimal totalLocacao);
}
