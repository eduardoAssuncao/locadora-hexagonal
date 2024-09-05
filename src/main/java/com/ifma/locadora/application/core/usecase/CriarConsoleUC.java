package com.ifma.locadora.application.core.usecase;

import com.ifma.locadora.application.core.domain.Console;
import com.ifma.locadora.application.ports.in.CriarConsoleInputPort;
import com.ifma.locadora.application.ports.out.CriarConsoleOutputPort;
import org.springframework.stereotype.Service;

@Service
public class CriarConsoleUC implements CriarConsoleInputPort {

    private final CriarConsoleOutputPort criarConsoleOutputPort;

    public CriarConsoleUC(CriarConsoleOutputPort criarConsoleOutputPort) {
        this.criarConsoleOutputPort = criarConsoleOutputPort;
    }

    @Override
    public void criar(Console console) {
        criarConsoleOutputPort.criar(console);
    }
}
