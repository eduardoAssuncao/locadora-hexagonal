package com.ifma.locadora.application.core.usecase;

import com.ifma.locadora.application.core.domain.Plataforma;
import com.ifma.locadora.application.ports.in.CriarPlataformaInputPort;
import com.ifma.locadora.application.ports.out.CriarPlataformaOutputPort;
import org.springframework.stereotype.Service;

@Service
public class CriarPlataformaUC implements CriarPlataformaInputPort {

    private final CriarPlataformaOutputPort criarPlataformaOutputPort;

    public CriarPlataformaUC(CriarPlataformaOutputPort criarPlataformaOutputPort) {
        this.criarPlataformaOutputPort = criarPlataformaOutputPort;
    }

    @Override
    public void criar(Plataforma plataforma) {
        criarPlataformaOutputPort.criar(plataforma);
    }
}
