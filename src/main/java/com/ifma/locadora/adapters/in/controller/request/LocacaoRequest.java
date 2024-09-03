package com.ifma.locadora.adapters.in.controller.request;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDate;

@Data
public class LocacaoRequest {

    @NotNull
    private LocalDate data;
}
