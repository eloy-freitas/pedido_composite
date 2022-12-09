package com.ufes.atividadecomposite.validadorcaixa.handler;

import com.ufes.atividadecomposite.composite.CaixaComposite;


public class ValidadorVolumeHandler extends ValidadorCaixaHandler{
    
    private final double volume = 1000;
    
    public ValidadorVolumeHandler() {

    }

    @Override
    public boolean validar(CaixaComposite caixa) throws Exception{
        double volume = caixa.getLimiteVolume();
        if(caixa.getVolume() <= volume)
            return true;
        throw new Exception(
            ""
            .concat("\nVolume permitido: ")
            .concat(String.valueOf(volume))
            .concat("\nVolume atual da caixa: ")
            .concat(String.valueOf(caixa.getVolume()))
        );
    }
    
    
    
}
