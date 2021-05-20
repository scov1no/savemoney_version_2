package com.savemoney.savemoney.Controller;

import com.savemoney.savemoney.Entities.Receita;

public class Receita_Controller {
    public boolean validar_receita(Receita receita){
        if(isNome_receitaValido(receita){
            return true;
        }else{
            return false;
        }
    }


    private boolean isReceita_Invalido(Receita receita){
        if((receita.getNome_receita().isEmpty()) || (receita.getNome_receita().length()<3)){
            return false;
        }
        return true;
    }
}
