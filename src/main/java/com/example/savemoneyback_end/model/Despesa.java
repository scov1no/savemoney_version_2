package com.example.savemoneyback_end.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
@Table(name="despesa")
public class Despesa {
        @Id
        @GeneratedValue(strategy= GenerationType.AUTO)

        private long id;
        private String nome_despesa;
        private Double valor_despesa;
        private String descricao_despesa;
        private Date data_despesa;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome_despesa() {
        return nome_despesa;
    }

    public void setNome_despesa(String nome_despesa) {
        this.nome_despesa = nome_despesa;
    }

    public Double getValor_despesa() {
        return valor_despesa;
    }

    public void setValor_despesa(Double valor_despesa) {
        this.valor_despesa = valor_despesa;
    }

    public String getDescricao_despesa() {
        return descricao_despesa;
    }

    public void setDescricao_despesa(String descricao_despesa) {
        this.descricao_despesa = descricao_despesa;
    }

    public String getDataFormatada() {
        SimpleDateFormat formatado = new SimpleDateFormat("dd/MM/yyyy");
        String dataFormat = formatado.format(data_despesa);
        return dataFormat;
    }

    public Date getData_despesa() {
        return data_despesa;
    }
    public void setData_despesa(Date data_despesa) {
        this.data_despesa = data_despesa;
    }
}
