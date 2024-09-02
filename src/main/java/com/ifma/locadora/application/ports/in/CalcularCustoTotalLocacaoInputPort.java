package com.ifma.locadora.application.ports.in;

import java.math.BigDecimal;

public interface CalcularCustoTotalLocacaoInputPort {

    BigDecimal calcular(BigDecimal totalLocacao);
}
