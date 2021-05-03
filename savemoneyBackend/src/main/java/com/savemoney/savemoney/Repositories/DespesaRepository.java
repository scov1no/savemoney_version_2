package com.savemoney.savemoney.Repositories;

import com.savemoney.savemoney.Entities.Despesa;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DespesaRepository extends JpaRepository<Despesa, Long>{
    
}
