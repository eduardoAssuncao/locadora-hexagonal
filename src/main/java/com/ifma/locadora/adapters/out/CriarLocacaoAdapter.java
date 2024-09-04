package com.ifma.locadora.adapters.out;

import com.ifma.locadora.adapters.out.repository.ClienteRepository;
import com.ifma.locadora.adapters.out.repository.LocacaoRepository;
import com.ifma.locadora.adapters.out.repository.mapper.ClienteEntityMapper;
import com.ifma.locadora.adapters.out.repository.mapper.LocacaoEntityMapper;
import com.ifma.locadora.application.core.domain.Locacao;
import com.ifma.locadora.application.ports.out.CriarLocacaoOutputPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CriarLocacaoAdapter implements CriarLocacaoOutputPort {

    private final LocacaoRepository locacaoRepository;
    private final ClienteRepository clienteRepository;
    private final LocacaoEntityMapper locacaoEntityMapper;

    @Override
    public void criar(Integer clienteId, Locacao locacao) {
        var clienteEntity = clienteRepository.findById(clienteId).orElseThrow(
                () -> new RuntimeException("Cliente não encontrado."));
        var locacaoEntity = locacaoEntityMapper.toLocacaoEntity(locacao);
        locacaoEntity.setCliente(clienteEntity);
        var savedLocacao = locacaoRepository.save(locacaoEntity);
        clienteEntity.getLocacoes().add(savedLocacao);
        clienteRepository.save(clienteEntity);
    }
}
