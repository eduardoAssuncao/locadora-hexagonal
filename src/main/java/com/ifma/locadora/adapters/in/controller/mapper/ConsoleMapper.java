package com.ifma.locadora.adapters.in.controller.mapper;

import com.ifma.locadora.adapters.in.controller.request.ConsoleRequest;
import com.ifma.locadora.adapters.in.controller.response.ConsoleResponse;
import com.ifma.locadora.application.core.domain.Console;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ConsoleMapper {

    Console toConsole(ConsoleRequest consoleRequest);
    ConsoleResponse toConsoleResponse(Console console);
}
