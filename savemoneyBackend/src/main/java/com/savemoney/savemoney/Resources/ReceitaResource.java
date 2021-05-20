package com.savemoney.savemoney.Resources;

import com.savemoney.savemoney.Controller.Receita_Controller;
import com.savemoney.savemoney.Entities.Receita;
import com.savemoney.savemoney.Repositories.ReceitaRepository;
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
@RequestMapping(value = "/api/receita")
public class ReceitaResource {

    @Autowired
    private ReceitaRepository receitaRepository;

    private ResponseEntity<Receita> responseEntity;

    @GetMapping("/listar")
    public List<Receita> listar() {
        return receitaRepository.findAll();
    }

    @GetMapping("get/{id}")
    public Receita get(@PathVariable(value = "id") long id_receita) {
        return receitaRepository.findById(id_receita);
    }

    @PostMapping("/incluir")
    public ResponseEntity<Receita> incluir(@RequestBody Receita receita) {
        Receita_Controller receita_controller = new Receita_Controller();
        if (receita_controller.validar_receita(receita)) {
            receita = receitaRepository.save(receita);
            return new ResponseEntity(receita, HttpStatus.OK);
        } else {
            return new ResponseEntity("Receita é inválido", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/editar")
    public ResponseEntity<Receita> editar(@RequestBody Receita receita) {
        Receita_Controller receita_controller = new Receita_Controller();
        if (receita_controller.validar_receita(receita)) {
            receita = receitaRepository.save(receita);
            return new ResponseEntity(receita, HttpStatus.OK);
        } else {
            return new ResponseEntity("Receita é inválido", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/remover")
    public Receita remover(@RequestBody Receita receita) {
        receitaRepository.delete(receita);
        return receita;
    }

    @GetMapping("/getTotal")
    public int getTotal() {
        return receitaRepository.findAll().size();
    }


}
