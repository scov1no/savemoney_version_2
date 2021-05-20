package com.savemoney.savemoney.Resources;

import java.util.List;

import com.savemoney.savemoney.Entities.Despesa;
import com.savemoney.savemoney.Services.DespesaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/despesas")
public class DespesaResource {
    
    @Autowired
    private DespesaService service;

    @GetMapping
    public ResponseEntity<List<Despesa>> findAll() {
        List<Despesa> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }
    
}
