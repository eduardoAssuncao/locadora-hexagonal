package com.ifma.locadora.adapters.in.controller;

import com.ifma.locadora.adapters.in.controller.mapper.LocacaoMapper;
import com.ifma.locadora.adapters.in.controller.request.LocacaoRequest;
import com.ifma.locadora.adapters.in.controller.response.LocacaoResponse;
import com.ifma.locadora.application.ports.in.BuscarLocacaoPorIdInputPort;
import com.ifma.locadora.application.ports.in.CriarLocacaoInputPort;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/locacoes")
@RequiredArgsConstructor
public class LocacaoController {

    private final CriarLocacaoInputPort criarLocacaoInputPort;
    private final BuscarLocacaoPorIdInputPort buscarLocacaoPorIdInputPort;
    private final LocacaoMapper locacaoMapper;

    @PostMapping
    public ResponseEntity<Void> criarLocacao(@Valid @RequestBody LocacaoRequest locacaoRequest) {
        var locacao = locacaoMapper.toLocacao(locacaoRequest);
        criarLocacaoInputPort.criar(locacao);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<LocacaoResponse> buscarLocacaoPorId(@PathVariable Integer id) {
        var locacao = buscarLocacaoPorIdInputPort.buscarLocacaoPorId(id);
        var locacaoResponse = locacaoMapper.toLocacaoResponse(locacao);
        return ResponseEntity.ok().body(locacaoResponse);
    }
}
