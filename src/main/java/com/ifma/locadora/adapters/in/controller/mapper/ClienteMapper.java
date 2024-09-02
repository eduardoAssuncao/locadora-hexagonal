package com.ifma.locadora.adapters.in.controller.mapper;

import com.ifma.locadora.adapters.in.controller.request.ClienteRequest;
import com.ifma.locadora.adapters.in.controller.response.ClienteResponse;
import com.ifma.locadora.application.core.domain.Cliente;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClienteMapper {

    Cliente toCliente(ClienteRequest clienteRequest);
    ClienteResponse toClienteResponse(Cliente cliente);
}
