package com.ifma.locadora.adapters.out;

import com.ifma.locadora.adapters.out.repository.ConsoleRepository;
import com.ifma.locadora.adapters.out.repository.mapper.ConsoleEntityMapper;
import com.ifma.locadora.application.core.domain.Console;
import com.ifma.locadora.application.ports.out.CriarConsoleOutputPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CriarConsoleAdapter implements CriarConsoleOutputPort {

    private final ConsoleRepository consoleRepository;
    private final ConsoleEntityMapper consoleEntityMapper;

    @Override
    public void criar(Console console) {
        var ConsoleEntity = consoleEntityMapper.toConsoleEntity(console);
        consoleRepository.save(ConsoleEntity);
    }
}
