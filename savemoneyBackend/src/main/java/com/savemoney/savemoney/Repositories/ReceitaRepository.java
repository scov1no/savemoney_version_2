package com.savemoney.savemoney.Repositories;

import com.savemoney.savemoney.Entities.Receita;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ReceitaRepository extends JpaRepository<Receita, Integer>{

    public Receita findById(long id_receita);

}
