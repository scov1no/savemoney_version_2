package com.savemoney.savemoney.Entities;

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
@Table(name = "SM_despesa")
public class Despesa implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_despesa;
    private String nome_despesa;
    private Float valor_despesa;
    private String descricao_despesa;
    private Instant data_despesa;

    @ManyToOne
    @JoinColumn(name = "id_categoria_despesa")
    private CategoriaD id_categoriaD;
    
    public Despesa() {
    }

    public Despesa(Long id_despesa, String nome_despesa, Float valor_despesa, String descricao_despesa,
            Instant data_despesa, CategoriaD id_categoriaD) {
        this.id_despesa = id_despesa;
        this.nome_despesa = nome_despesa;
        this.valor_despesa = valor_despesa;
        this.descricao_despesa = descricao_despesa;
        this.data_despesa = data_despesa;
        this.id_categoriaD = id_categoriaD;
    }

    public Long getId_despesa() {
        return id_despesa;
    }

    public void setId_despesa(Long id_despesa) {
        this.id_despesa = id_despesa;
    }

    public String getNome_despesa() {
        return nome_despesa;
    }

    public void setNome_despesa(String nome_despesa) {
        this.nome_despesa = nome_despesa;
    }

    public Float getValor_despesa() {
        return valor_despesa;
    }

    public void setValor_despesa(Float valor_despesa) {
        this.valor_despesa = valor_despesa;
    }

    public String getDescricao_despesa() {
        return descricao_despesa;
    }

    public void setDescricao_despesa(String descricao_despesa) {
        this.descricao_despesa = descricao_despesa;
    }

    public Instant getData_despesa() {
        return data_despesa;
    }

    public void setData_despesa(Instant data_despesa) {
        this.data_despesa = data_despesa;
    }

    public CategoriaD getId_categoriaD() {
        return id_categoriaD;
    }

    public void setId_categoriaD(CategoriaD id_categoriaD) {
        this.id_categoriaD = id_categoriaD;
    }

    

    

    

}
