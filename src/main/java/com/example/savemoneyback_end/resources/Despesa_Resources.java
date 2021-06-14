package com.example.savemoneyback_end.resources;


import com.example.savemoneyback_end.controller.Despesa_Controller;
import com.example.savemoneyback_end.controller.Receita_Controller;
import com.example.savemoneyback_end.model.Despesa;
import com.example.savemoneyback_end.model.Receita;
import com.example.savemoneyback_end.repository.Despesa_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/despesa")
public class Despesa_Resources {
    @Autowired
    private Despesa_Repository despesa_repository;

    private ResponseEntity<Despesa> responseEntity;

    @GetMapping("/listar")
    public List<Despesa> listar() {
        return despesa_repository.findAll();
    }

    @GetMapping("get/{id}")
    public Despesa get(@PathVariable(value = "id") long id) {
        return despesa_repository.findById(id);
    }

    @PostMapping("/incluir")
    public ResponseEntity<Despesa> incluir(@RequestBody Despesa despesa) {
        Despesa_Controller despesa_Controller = new Despesa_Controller();
        if (despesa_Controller.validarDespesa(despesa)) {
            despesa = despesa_repository.save(despesa);
            return new ResponseEntity(despesa, HttpStatus.OK);
        } else {
            return new ResponseEntity("Nome despesa é inválido", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/editar")
    public ResponseEntity<Despesa> editar(@RequestBody Despesa despesa) {
        Despesa despesaTemp =  despesa_repository.findById(despesa.getId());
        if(despesa.getNome_despesa() != null){
            despesaTemp.setNome_despesa(despesa.getNome_despesa());
        }

        if(despesa.getDescricao_despesa() != null){
            despesaTemp.setDescricao_despesa(despesa.getDescricao_despesa());
        }
        if(despesa.getValor_despesa() != null){
            despesaTemp.setValor_despesa(despesa.getValor_despesa());
        }
        Despesa_Controller despesa_Controller = new Despesa_Controller();
        if (despesa_Controller.validarDespesa(despesaTemp)) {
            despesaTemp = despesa_repository.save(despesaTemp);
            return new ResponseEntity(despesaTemp, HttpStatus.OK);
        } else {
            return new ResponseEntity("Nome da despesa é inválido", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/remover")
    public Despesa remover(@RequestBody Despesa despesa) {
        despesa_repository.delete(despesa);
        return despesa;
    }
    /*
    @GetMapping("/getTotal")
    public Double gettotaldespesa() {
        return despesa_repository.totaldespesa();
    }

     */
}
