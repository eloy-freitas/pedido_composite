package com.ufes.atividadecomposite.validadorcaixa.handler;

import com.ufes.atividadecomposite.composite.CaixaComposite;


public class ValidadorVolumeHandler extends ValidadorCaixaHandler{

    public ValidadorVolumeHandler() {
    }

    @Override
    public boolean validar(CaixaComposite caixa) {
        return (caixa.getVolume()<= 1000);
    }
    
    
    
}
