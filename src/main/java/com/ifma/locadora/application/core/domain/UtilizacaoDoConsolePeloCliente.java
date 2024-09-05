package com.ifma.locadora.application.core.domain;

import java.time.LocalDateTime;

public class UtilizacaoDoConsolePeloCliente {

    private Integer id;
    private LocalDateTime inicio;
    private LocalDateTime fim;
    private Console console;
    private Cliente cliente;

    public UtilizacaoDoConsolePeloCliente() {}

    public UtilizacaoDoConsolePeloCliente(Integer id, LocalDateTime inicio, LocalDateTime fim, Console console, Cliente cliente) {
        this.id = id;
        this.inicio = inicio;
        this.fim = fim;
        this.console = console;
        this.cliente = cliente;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getInicio() {
        return inicio;
    }

    public void setInicio(LocalDateTime inicio) {
        this.inicio = inicio;
    }

    public LocalDateTime getFim() {
        return fim;
    }

    public void setFim(LocalDateTime fim) {
        this.fim = fim;
    }

    public Console getConsole() {
        return console;
    }

    public void setConsole(Console console) {
        this.console = console;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
