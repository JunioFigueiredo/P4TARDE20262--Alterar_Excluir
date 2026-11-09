package com.financeiro.projeto.dto;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoPessoa(
        @NotNull
        Long id,
        String nome,
        DadosEndereco endereco) {
}
