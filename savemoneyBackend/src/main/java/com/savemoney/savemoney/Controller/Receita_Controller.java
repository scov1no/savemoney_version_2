package com.savemoney.savemoney.Controller;

import com.savemoney.savemoney.Entities.Receita;

public class Receita_Controller {



        public boolean validarReceita(Receita receita) {
            if (isNomeValido(receita)) {
                return true;
            } else {
                return false;
            }
        }

        /** Verifica se o nome do aluno é válido.
         *
         * Um nome válido não pode ser nulo e deve ter mais que 3 caracteres
         *
         * @param receita
         * @return
         */
        private boolean isNomeValido(Receita receita) {
            if ((receita.getNome_receita().isEmpty()) || (receita.getNome_receita().length() < 3)) {
                return false;
            }
            return true;
        }

}
