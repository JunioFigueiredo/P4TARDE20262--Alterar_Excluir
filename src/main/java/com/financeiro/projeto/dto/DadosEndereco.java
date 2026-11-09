package com.financeiro.projeto.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record DadosEndereco(
        @NotBlank
        String logradouro,
        String numero,
        String complemento,
        @NotBlank
        String bairro,
        @NotBlank
        @Pattern(regexp = "\\d{7}")
        String cep,
        @NotBlank
        String cidade,
        @NotBlank
        String uf

) {
}
