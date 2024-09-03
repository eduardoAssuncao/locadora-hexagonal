package com.ifma.locadora.adapters.in.controller.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class JogoRequest {

    @NotBlank
    private String titulo;
}
