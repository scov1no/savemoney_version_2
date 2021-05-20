package com.savemoney.savemoney.Services;

import java.util.List;

import com.savemoney.savemoney.model.Receita;
import com.savemoney.savemoney.Repositories.ReceitaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReceitaService {

    @Autowired
    private ReceitaRepository repository;

    public List<Receita> findAll() {
        return repository.findAll();
    }
}
