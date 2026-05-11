package com.baozi.loja_baozi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.baozi.loja_baozi.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
