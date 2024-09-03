package com.ifma.locadora.adapters.in.controller.response;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class ItemLocacaoResponse {

    private Integer dias;
    private Integer quantidade;
}
