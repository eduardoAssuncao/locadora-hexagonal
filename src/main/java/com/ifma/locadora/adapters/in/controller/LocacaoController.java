package com.ifma.locadora.adapters.in.controller;

import com.ifma.locadora.adapters.in.controller.mapper.ItemLocacaoMapper;
import com.ifma.locadora.adapters.in.controller.mapper.JogoMapper;
import com.ifma.locadora.adapters.in.controller.mapper.LocacaoMapper;
import com.ifma.locadora.adapters.in.controller.request.ItemLocacaoRequest;
import com.ifma.locadora.adapters.in.controller.request.LocacaoRequest;
import com.ifma.locadora.adapters.in.controller.response.JogoResponse;
import com.ifma.locadora.adapters.in.controller.response.LocacaoResponse;
import com.ifma.locadora.application.core.domain.Jogo;
import com.ifma.locadora.application.core.domain.Locacao;
import com.ifma.locadora.application.ports.in.*;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/locacoes")
@RequiredArgsConstructor
public class LocacaoController {

    private final CriarLocacaoInputPort criarLocacaoInputPort;
    private final BuscarLocacaoPorIdInputPort buscarLocacaoPorIdInputPort;
    private final AdicionarJogosEmLocacaoInputPort adicionarJogosEmLocacaoInputPort;
    private final BuscarLocacoesInputPort buscarLocacoesInputPort;
    private final CalcularCustoTotalInputPort calcularCustoTotalInputPort;
    private final BuscarJogosEmLocacaoInputPort buscarJogosEmLocacaoInputPort;
    private final LocacaoMapper locacaoMapper;
    private final ItemLocacaoMapper itemLocacaoMapper;
    private final JogoMapper jogoMapper;

    @PostMapping("/{clienteId}")
    public ResponseEntity<Void> criarLocacao(@PathVariable Integer clienteId, @Valid @RequestBody LocacaoRequest locacaoRequest) {
        var locacao = locacaoMapper.toLocacao(locacaoRequest);
        criarLocacaoInputPort.criar(clienteId, locacao);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<LocacaoResponse> buscarLocacaoPorId(@PathVariable Integer id) {
        var locacao = buscarLocacaoPorIdInputPort.buscarLocacaoPorId(id);
        var locacaoResponse = locacaoMapper.toLocacaoResponse(locacao);
        return ResponseEntity.ok().body(locacaoResponse);
    }

    @GetMapping
    public ResponseEntity<List<LocacaoResponse>> buscarLocacoes() {
        List<Locacao> locacoes = buscarLocacoesInputPort.buscarLocacoes();
        List<LocacaoResponse> locacoesResponse = locacoes.stream().map(entity -> locacaoMapper.toLocacaoResponse(entity)).toList();
        return ResponseEntity.ok().body(locacoesResponse);
    }

    @GetMapping("custoTotal/{locacaoId}")
    public ResponseEntity<BigDecimal> calcularCustoTotal(@PathVariable Integer locacaoId) {
        var custoTotalLocacao = calcularCustoTotalInputPort.calcularCustoTotal(locacaoId);
        return ResponseEntity.ok().body(custoTotalLocacao);
    }

    @GetMapping("/{locacaoId}/jogos")
    public ResponseEntity<List<JogoResponse>> buscarJogosEmLocacao(@PathVariable Integer locacaoId) {
        List<Jogo> jogos = buscarJogosEmLocacaoInputPort.buscarJogosEmLocacao(locacaoId);
        var jogosResponse = jogos.stream().map(entity -> jogoMapper.toJogoResponse(entity)).toList();
        return ResponseEntity.ok().body(jogosResponse);
    }

    @PutMapping("/adicionar/{locacaoId}/{jogoId}/{plataformaId}")
    public ResponseEntity<Void> adicionarJogoEmLocacao(@PathVariable Integer locacaoId,
                                                       @PathVariable Integer jogoId,
                                                       @PathVariable Integer plataformaId,
                                                       @Valid @RequestBody ItemLocacaoRequest itemLocacaoRequest) {

        var itemLocacao = itemLocacaoMapper.toItemLocacao(itemLocacaoRequest);
        adicionarJogosEmLocacaoInputPort.adicionar(locacaoId, jogoId, plataformaId, itemLocacao);
        return ResponseEntity.ok().build();
    }
}
