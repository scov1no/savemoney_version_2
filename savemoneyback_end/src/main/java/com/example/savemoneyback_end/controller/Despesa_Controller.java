package com.example.savemoneyback_end.controller;

import com.example.savemoneyback_end.model.Despesa;

public class Despesa_Controller {

        public boolean validarDespesa(Despesa despesa) {
            if (isNomeValido(despesa)) {
                return true;
            } else {
                return false;
            }
        }

        /* Verifica se o nome do receita é válido.
         *
         * Um nome válido não pode ser nulo e deve ter mais que 3 caracteres

          @param receita
          @return
         */
        private boolean isNomeValido(Despesa despesa) {
            if ((despesa.getNome_despesa().isEmpty()) || (despesa.getNome_despesa().length() < 3)) {
                return false;
            }
            return true;
        }
    }


