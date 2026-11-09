package com.financeiro.projeto.dto;

import com.financeiro.projeto.entities.Pessoa;

public record DadosListagemPessoa(
        //Long id,
        String nome
) {

    public DadosListagemPessoa(Pessoa pessoa){
        this(   //pessoa.getId(),
                pessoa.getNome()
        );
    }
}
