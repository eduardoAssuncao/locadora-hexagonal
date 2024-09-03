package com.ifma.locadora.adapters.in.controller.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class ConsoleRequest {

    @NotBlank
    private String nome;
    @NotBlank
    private BigDecimal precoPorHora;
}
