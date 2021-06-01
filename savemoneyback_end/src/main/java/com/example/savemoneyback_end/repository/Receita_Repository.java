package com.example.savemoneyback_end.repository;

import com.example.savemoneyback_end.model.Receita;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Receita_Repository extends JpaRepository<Receita, Integer> {

    public Receita findById(long id);


}
