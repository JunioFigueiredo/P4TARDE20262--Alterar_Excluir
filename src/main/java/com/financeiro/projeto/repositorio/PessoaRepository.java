package com.financeiro.projeto.repositorio;

import com.financeiro.projeto.entities.Pessoa;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {


    Page<Pessoa> findAllByAtivoTrue(Pageable paginacao);
}