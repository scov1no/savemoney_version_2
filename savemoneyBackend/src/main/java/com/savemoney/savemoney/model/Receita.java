package com.savemoney.savemoney.model;

import java.io.Serializable;
import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "SM_receita")
public class Receita implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_receita;  
    private String nome_receita;
    private Float valor_receita;  
    private String descricao_receita;  
    private Instant data_receita;
    
    @ManyToOne
    @JoinColumn(name = "id_categoria_receita")
    private CategoriaR id_categoriaR;

    public Receita() {
    }

    public Receita(Long id_receita, String nome_receita, Float valor_receita, String descricao_receita,
            Instant data_receita, CategoriaR id_categoriaR) {
        this.id_receita = id_receita;
        this.nome_receita = nome_receita;
        this.valor_receita = valor_receita;
        this.descricao_receita = descricao_receita;
        this.data_receita = data_receita;
        this.id_categoriaR = id_categoriaR;
    }

    public Long getId_receita() {
        return id_receita;
    }

    public void setId_receita(Long id_receita) {
        this.id_receita = id_receita;
    }

    public String getNome_receita() {
        return nome_receita;
    }

    public void setNome_receita(String nome_receita) {
        this.nome_receita = nome_receita;
    }

    public Float getValor_receita() {
        return valor_receita;
    }

    public void setValor_receita(Float valor_receita) {
        this.valor_receita = valor_receita;
    }

    public String getDescricao_receita() {
        return descricao_receita;
    }

    public void setDescricao_receita(String descricao_receita) {
        this.descricao_receita = descricao_receita;
    }

    public Instant getData_receita() {
        return data_receita;
    }

    public void setData_receita(Instant data_receita) {
        this.data_receita = data_receita;
    }

    public CategoriaR getId_categoriaR() {
        return id_categoriaR;
    }

    public void setId_categoriaR(CategoriaR id_categoriaR) {
        this.id_categoriaR = id_categoriaR;
    }

    
    

}