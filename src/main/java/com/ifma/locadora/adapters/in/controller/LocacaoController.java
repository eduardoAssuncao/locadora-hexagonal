package com.ifma.locadora.adapters.in.controller;

import com.ifma.locadora.adapters.in.controller.mapper.LocacaoMapper;
import com.ifma.locadora.adapters.in.controller.request.LocacaoRequest;
import com.ifma.locadora.application.ports.in.CriarLocacaoInputPort;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/locacoes")
@RequiredArgsConstructor
public class LocacaoController {

    private final CriarLocacaoInputPort criarLocacaoInputPort;
    private final LocacaoMapper locacaoMapper;

    @PostMapping
    public ResponseEntity<Void> criarLocacao(@Valid @RequestBody LocacaoRequest locacaoRequest) {
        var locacao = locacaoMapper.toLocacao(locacaoRequest);
        criarLocacaoInputPort.criar(locacao);
        return ResponseEntity.ok().build();
    }
}
