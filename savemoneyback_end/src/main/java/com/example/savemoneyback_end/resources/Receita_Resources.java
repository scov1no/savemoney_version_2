package com.example.savemoneyback_end.resources;

import com.example.savemoneyback_end.controller.Receita_Controller;
import com.example.savemoneyback_end.model.Receita;
import com.example.savemoneyback_end.repository.Receita_Repository;
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
public class Receita_Resources {



        @Autowired
        private Receita_Repository receita_repository;

        private ResponseEntity<Receita> responseEntity;

        @GetMapping("/listar")
        public List<Receita> listar() {
            return receita_repository.findAll();
        }

        @GetMapping("get/{id}")
        public Receita get(@PathVariable(value = "id") long id) {
            return receita_repository.findById(id);
        }

        @PostMapping("/incluir")
        public ResponseEntity<Receita> incluir(@RequestBody Receita receita) {
            Receita_Controller receita_Controller = new Receita_Controller();
            if (receita_Controller.validarReceita(receita)) {
                receita = receita_repository.save(receita);
                return new ResponseEntity(receita, HttpStatus.OK);
            } else {
                return new ResponseEntity("Nome da receita é inválido", HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        @PutMapping("/editar")
        public ResponseEntity<Receita> editar(@RequestBody Receita receita) {
            Receita_Controller receita_Controller = new Receita_Controller();
            if (receita_Controller.validarReceita(receita)) {
                receita = receita_repository.save(receita);
                return new ResponseEntity(receita, HttpStatus.OK);
            } else {
                return new ResponseEntity("Nome da receita é inválido", HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        @PostMapping("/remover")
        public Receita remover(@RequestBody Receita receita) {
            receita_repository.delete(receita);
            return receita;
        }

        @GetMapping("/getTotal")
        public int getTotal() {
            return receita_repository.findAll().size();
        }
}
