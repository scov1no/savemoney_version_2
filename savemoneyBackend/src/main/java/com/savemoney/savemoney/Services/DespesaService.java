package com.savemoney.savemoney.Services;

import java.util.List;

import com.savemoney.savemoney.Entities.Despesa;
import com.savemoney.savemoney.Repositories.DespesaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DespesaService {
    
    @Autowired
    private DespesaRepository repository;

    public List<Despesa> findAll() {
        return repository.findAll();
    }

}
