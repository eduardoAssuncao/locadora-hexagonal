package com.ifma.locadora.adapters.out;

import com.ifma.locadora.adapters.out.repository.*;
import com.ifma.locadora.adapters.out.repository.mapper.*;
import com.ifma.locadora.application.core.domain.ItemLocacao;
import com.ifma.locadora.application.core.domain.ItemLocacaoPK;
import com.ifma.locadora.application.core.domain.JogoPlataformaPK;
import com.ifma.locadora.application.ports.out.AdicionarJogosEmLocacaoOutputPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AdicionarJogoEmLocacaoAdapter implements AdicionarJogosEmLocacaoOutputPort {

    private final LocacaoRepository locacaoRepository;
    private final JogoRepository jogoRepository;
    private final PlataformaRepository plataformaRepository;
    private final JogoPlataformaRepository jogoPlataformaRepository;
    private final ItemLocacaoRepository itemLocacaoRepository;
    private final LocacaoEntityMapper locacaoEntityMapper;
    private final JogoEntityMapper jogoEntityMapper;
    private final PlataformaEntityMapper plataformaEntityMapper;
    private final JogoPlataformaEntityPKMapper jogoPlataformaEntityPKMapper;
    private final JogoPlataformaEntityMapper jogoPlataformaEntityMapper;
    private final ItemLocacaoEntityMapper itemLocacaoEntityMapper;

    @Override
    public void adicionar(Integer locacaoId, Integer jogoId, Integer plataformaId, ItemLocacao itemLocacao) {
        // TODO: Fazer busca por jogoID, PlataformaID, gerar a PK e buscar o JogoPlatadorma
        // TODO: Refatorar esse código, quando der certo

        var locacaoEntity = locacaoRepository.findById(locacaoId).orElseThrow(
                () -> new RuntimeException("Locação não encontrada"));
        var locacao = locacaoEntityMapper.toLocacao(locacaoEntity);
        var jogoEntity = jogoRepository.findById(jogoId).orElseThrow(
                () -> new RuntimeException("Jogo não encontrado"));
        var jogo = jogoEntityMapper.toJogo(jogoEntity);
        var plataformaEntity = plataformaRepository.findById(plataformaId).orElseThrow(
                () -> new RuntimeException("Plataforma não encontrada."));
        var plataforma = plataformaEntityMapper.toPlataforma(plataformaEntity);

        JogoPlataformaPK jogoPlataformaPK = new JogoPlataformaPK();
        jogoPlataformaPK.setPlataforma(plataforma);
        jogoPlataformaPK.setJogo(jogo);
        var jogoPlataformaEntityPK = jogoPlataformaEntityPKMapper.ToJogoPlataformaEntityPK(jogoPlataformaPK);

        var jogoPlataformaEntity = jogoPlataformaRepository.findById(jogoPlataformaEntityPK).orElseThrow(
                () -> new RuntimeException("Jogo plataforma não encontrado,"));
        var jogoPlataforma = jogoPlataformaEntityMapper.toJogoPlataforma(jogoPlataformaEntity);

        ItemLocacaoPK itemLocacaoPK = new ItemLocacaoPK();
        itemLocacaoPK.setLocacao(locacao);
        itemLocacaoPK.setJogoPlataforma(jogoPlataforma);

        ItemLocacao newItemLocacao = new ItemLocacao();
        newItemLocacao.setId(itemLocacaoPK);
        newItemLocacao.setDias(itemLocacao.getDias());
        newItemLocacao.setQuantidade(itemLocacao.getQuantidade());
        var itemLocacaoEntity = itemLocacaoEntityMapper.toItemLocacaoEntity(newItemLocacao);

        itemLocacaoRepository.save(itemLocacaoEntity);

        locacaoEntity.getItens().add(itemLocacaoEntity);
        locacaoRepository.save(locacaoEntity);
        jogoPlataformaEntity.getLocacoes().add(itemLocacaoEntity);
        jogoPlataformaRepository.save(jogoPlataformaEntity);

    }
}
