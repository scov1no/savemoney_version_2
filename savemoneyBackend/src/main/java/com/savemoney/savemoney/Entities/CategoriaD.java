package com.savemoney.savemoney.Entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SM_categoria_despesa")
public class CategoriaD implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_categoria_despesa;
    private String nome_categoria;
    private String descricao_categoria;

    public CategoriaD(){
    }

    public CategoriaD(Long id_categoria_despesa, String nome_categoria, String descricao_categoria) {
        this.id_categoria_despesa = id_categoria_despesa;
        this.nome_categoria = nome_categoria;
        this.descricao_categoria = descricao_categoria;
    }

    public Long getId_categoria_despesa() {
        return id_categoria_despesa;
    }

    public void setId_categoria_despesa(Long id_categoria_despesa) {
        this.id_categoria_despesa = id_categoria_despesa;
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
