package com.baozi.loja_baozi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.baozi.loja_baozi.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
