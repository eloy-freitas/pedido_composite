package com.ufes.atividadecomposite.validadorcaixa.handler;

import com.ufes.atividadecomposite.composite.CaixaComposite;


public class ValidadorPesoHandler extends ValidadorCaixaHandler{

    public ValidadorPesoHandler() {
    }

    @Override
    public boolean validar(CaixaComposite caixa) {
        return (caixa.getPeso() <= 2000);
    }
    
    
}
