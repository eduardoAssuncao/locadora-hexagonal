package com.ifma.locadora.adapters.in.controller.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class ItemLocacaoRequest {

    @NotNull
    private Integer dias;
    @NotNull
    private Integer quantidade;
}
