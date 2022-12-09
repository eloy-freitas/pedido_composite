package com.ufes.atividadecomposite.validadorcaixa.handler;

import com.ufes.atividadecomposite.composite.CaixaComposite;


public class ValidadorPesoHandler extends ValidadorCaixaHandler{
   
    
    public ValidadorPesoHandler() {
    }

    @Override
    public boolean validar(CaixaComposite caixa) throws Exception{
        double peso = caixa.getLimitePeso();
        if(caixa.getPeso() <= peso)
            return true;
        throw new Exception(
            ""
            .concat("\nPeso limite da caixa: ")
            .concat(String.valueOf(peso))
            .concat("\nPeso atual da caixa: ")
            .concat(String.valueOf(caixa.getPeso()))
        );
    }
    
    
}
