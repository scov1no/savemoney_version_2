package com.savemoney.savemoney.Entities;

import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "SM_usuario")
public class User implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_usuario;
    private String email_usuario;
    private String nome_usuario;
    private String senha_usuario;
    private Instant data_despesa;

    @OneToMany
    @JoinColumn(name = "id_despesa")
    private List<Despesa> id_despesa = new ArrayList<>();

    @OneToMany
    @JoinColumn(name = "id_receita")
    private List<Receita> id_receita = new ArrayList<>();
    

    public User(){
    }
    
    public User(Long id, String email, String nome, String senha_usuario) {
        this.id_usuario = id;
        this.email_usuario = email;
        this.nome_usuario = nome;
        this.senha_usuario = senha_usuario;
    }

    public Long getId() {
        return id_usuario;
    }

    public void setId(Long id) {
        this.id_usuario = id;
    }

    public String getEmail() {
        return email_usuario;
    }

    public void setEmail(String email) {
        this.email_usuario = email;
    }

    public String getSenha_usuario() {
        return senha_usuario;
    }

    public void setSenha_usuario(String senha_usuario) {
        this.senha_usuario = senha_usuario;
    }
    public String getNome() {
        return nome_usuario;
    }

    public void setNome(String nome) {
        this.nome_usuario = nome;
    }

    public Instant getCriacao() {
        return data_despesa;
    }

    public void setCriacao(Instant criacao) {
        this.data_despesa = criacao;
    }
    public List<Despesa> getId_despesa() {
        return this.id_despesa;
    }


    public List<Receita> getId_receita() {
        return id_receita;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id_usuario == null) ? 0 : id_usuario.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        User other = (User) obj;
        if (id_usuario == null) {
            if (other.id_usuario != null)
                return false;
        } else if (!id_usuario.equals(other.id_usuario))
            return false;
        return true;
    }

    
}
