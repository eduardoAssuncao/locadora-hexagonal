package com.ifma.locadora.adapters.out;

import com.ifma.locadora.adapters.out.repository.LocacaoRepository;
import com.ifma.locadora.application.ports.out.CalcularCustoTotalOutputPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
@RequiredArgsConstructor
public class CalcularCustoTotalAdapter implements CalcularCustoTotalOutputPort {

    private final LocacaoRepository locacaoRepository;
    //private final LocacaoEntityMapper locacaoEntityMapper;

    @Override
    public BigDecimal calcularCustoTotal(Integer locacaoId) {
        var locacaoEntity = locacaoRepository.findById(locacaoId).get();

        BigDecimal custoTotal = locacaoEntity.getItens().stream()
                .map(item -> {
                        BigDecimal precoDiario = item.getId().getJogoPlataforma().getPrecoDiario();
                        BigDecimal dias = BigDecimal.valueOf(item.getDias());
                        BigDecimal quantidade = BigDecimal.valueOf(item.getQuantidade());
                        return precoDiario.multiply(dias).multiply(quantidade);
                })
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        System.out.println(custoTotal);
        return custoTotal;
    }
}
