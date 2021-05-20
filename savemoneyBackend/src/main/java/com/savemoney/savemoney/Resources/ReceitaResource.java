package com.savemoney.savemoney.Resources;

import java.util.List;

import com.savemoney.savemoney.Entities.Receita;
import com.savemoney.savemoney.Services.ReceitaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/receitas")
public class ReceitaResource {
    
    @Autowired
    private ReceitaService service;

    @GetMapping
    public ResponseEntity<List<Receita>> findAll() {
        List<Receita> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

}
