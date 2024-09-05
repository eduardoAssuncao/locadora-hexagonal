package com.ifma.locadora.adapters.in.controller;

import com.ifma.locadora.adapters.in.controller.mapper.ClienteMapper;
import com.ifma.locadora.adapters.in.controller.request.ClienteRequest;
import com.ifma.locadora.adapters.in.controller.response.ClienteResponse;
import com.ifma.locadora.application.ports.in.BuscarClientePorIdInputPort;
import com.ifma.locadora.application.ports.in.CriarClienteInputPort;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clientes")
@RequiredArgsConstructor
public class ClienteController {

    private final CriarClienteInputPort criarClienteInputPort;
    private final BuscarClientePorIdInputPort buscarClientePorIdInputPort;
    private final ClienteMapper clienteMapper;

    @PostMapping
    public ResponseEntity<Void> criarCliente(@Valid @RequestBody ClienteRequest clienteRequest) {
        var cliente = clienteMapper.toCliente(clienteRequest);
        criarClienteInputPort.criar(cliente);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ClienteResponse> buscarPorId(@PathVariable final Integer id) {
        var cliente = buscarClientePorIdInputPort.buscarClientePorId(id);
        var clienteResponse = clienteMapper.toClienteResponse(cliente);
        return ResponseEntity.ok().body(clienteResponse);
    }
}
