package com.example.savemoneyback_end.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="receita")
public class Receita {


    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)

    private long id;
    private String nome_receita;
    private double valor_receita;
    private String descricao_receita;


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

    public double getValor_receita() {
        return valor_receita;
    }

    public void setValor_receita(double valor_receita) {
        this.valor_receita = valor_receita;
    }

    public String getDescricao_receita() {
        return descricao_receita;
    }

    public void setDescricao_receita(String descricao_receita) {
        this.descricao_receita = descricao_receita;
    }
}
