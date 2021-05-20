package com.savemoney.savemoney.controller;

import com.savemoney.savemoney.model.Cadastro_usuario;
public class Login_Controller {

    public boolean validarAluno(Cadastro_usuario cadastro_usuario) {
        if(isIdadeValido(cadastro_usuario)){
            return true;
        }else{
            return false;
        }
    }

    /** Verifica se o novo usuário e menor de idade.
     *
     * Uma  idade e válido quando tiver mais que 18 anos.
     *
     * @param cadastro_usuario;
     * @return
     *
     *
     *
     */
    private boolean isIdadeValido(Cadastro_usuario cadastro_usuario){
        if((cadastro_usuario.getIdade().isEmpty()) || (cadastro_usuario.getIdade().length()<3)){
            return false;
        }
        return true;
    }
}
