package com.savemoney.savemoney.Entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "SM_categoria_receita")
public class CategoriaR implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_categoria_receita;
    private String nome_categoria;
    private String descricao_categoria;

    public CategoriaR() {
    }

    public CategoriaR(Long id_categoria_receita, String nome_categoria, String descricao_categoria) {
        this.id_categoria_receita = id_categoria_receita;
        this.nome_categoria = nome_categoria;
        this.descricao_categoria = descricao_categoria;
    }

    public Long getId_categoria_receita() {
        return id_categoria_receita;
    }

    public void setId_categoria_receita(Long id_categoria_receita) {
        this.id_categoria_receita = id_categoria_receita;
    }

    public String getNome_categoria() {
        return nome_categoria;
    }

    public void setNome_categoria(String nome_categoria) {
        this.nome_categoria = nome_categoria;
    }

    public String getDescricao_categoria() {
        return descricao_categoria;
    }

    public void setDescricao_categoria(String descricao_categoria) {
        this.descricao_categoria = descricao_categoria;
    }

    
}
