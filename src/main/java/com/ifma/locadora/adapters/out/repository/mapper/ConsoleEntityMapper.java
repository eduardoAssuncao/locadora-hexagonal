package com.ifma.locadora.adapters.out.repository.mapper;

import com.ifma.locadora.adapters.out.repository.entity.ConsoleEntity;
import com.ifma.locadora.application.core.domain.Console;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ConsoleEntityMapper {

    ConsoleEntity toConsoleEntity(Console console);
    Console toConsole(ConsoleEntity consoleEntity);
}
