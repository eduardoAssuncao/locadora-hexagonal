package com.ifma.locadora.adapters.in.controller.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class ItemLocacaoRequest {

    @NotBlank
    private Integer dias;
    @NotBlank
    private Integer quantidade;
}
