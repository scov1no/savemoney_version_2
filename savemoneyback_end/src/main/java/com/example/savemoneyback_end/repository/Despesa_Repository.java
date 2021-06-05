package com.example.savemoneyback_end.repository;

import com.example.savemoneyback_end.model.Despesa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Despesa_Repository extends JpaRepository<Despesa, Integer> {

    public Despesa findById(long id);
}
