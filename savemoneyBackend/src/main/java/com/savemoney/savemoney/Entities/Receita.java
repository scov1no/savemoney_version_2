package com.savemoney.savemoney.Entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.Date;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="receita")
public class Receita{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome_receita;
    private float valor_receita;
    private String descricao_receita;



    /*
    @ManyToOne
    @JoinColumn(name = "id_categoria_receita")
    private CategoriaR id_categoriaR;

     */




    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome_receita() {
        return nome_receita;
    }

    public void setNome_receita(String nome_receita) {
        this.nome_receita = nome_receita;
    }

    public float getValor_receita() {
        return valor_receita;
    }

    public void setValor_receita(float valor_receita) {
        this.valor_receita = valor_receita;
    }

    public String getDescricao_receita() {
        return descricao_receita;
    }

    public void setDescricao_receita(String descricao_receita) {
        this.descricao_receita = descricao_receita;
    }





    /*
    public CategoriaR getId_categoriaR() {
        return id_categoriaR;
    }

    public void setId_categoriaR(CategoriaR id_categoriaR) {
        this.id_categoriaR = id_categoriaR;
    }

     */
}
