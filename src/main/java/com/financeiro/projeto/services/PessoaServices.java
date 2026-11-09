package com.financeiro.projeto.services;


import com.financeiro.projeto.dto.DadosAtualizacaoPessoa;
import com.financeiro.projeto.dto.DadosCadastroPessoa;
import com.financeiro.projeto.dto.DadosListagemPessoa;
import com.financeiro.projeto.entities.Pessoa;
import com.financeiro.projeto.repositorio.PessoaRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class PessoaServices {

    @Autowired
    private PessoaRepository repository;

    //@Transactional
    public Pessoa cadastrar(DadosCadastroPessoa dados) {
        var pessoa = repository.save(new Pessoa(dados));
        return pessoa;
    }

    public Page<DadosListagemPessoa>
    listarPessoa(Pageable paginacao){
        return repository.findAllByAtivoTrue(paginacao)
                .map(DadosListagemPessoa::new);
    }

    @Transactional
    public Pessoa detalharPessoa(Long id) {
        return repository.getReferenceById(id);
    }

    @Transactional
    public Pessoa atualizarPessoa(DadosAtualizacaoPessoa dados){
        var pessoa = repository.getReferenceById(dados.id());
        pessoa.atualizarInformacoesPessoa(dados);
        return pessoa;
    }

    @Transactional
    public void excluirPessoa(Long id) {
        var pessoa =  repository.getReferenceById(id);
        pessoa.excluir();
    }

}
