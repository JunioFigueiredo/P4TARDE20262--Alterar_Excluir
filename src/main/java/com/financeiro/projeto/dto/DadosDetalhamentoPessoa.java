package com.financeiro.projeto.dto;

import com.financeiro.projeto.entities.Pessoa;

public record DadosDetalhamentoPessoa(

        Long id,
        String nome
        ) {

    public DadosDetalhamentoPessoa(Pessoa pessoa) {
        this(
                pessoa.getId(),
                pessoa.getNome()
        );
    }
}
