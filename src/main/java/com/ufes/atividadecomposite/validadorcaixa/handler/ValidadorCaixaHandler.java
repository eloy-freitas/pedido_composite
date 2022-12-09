package com.ufes.atividadecomposite.validadorcaixa.handler;

import com.ufes.atividadecomposite.composite.CaixaComposite;


public abstract class ValidadorCaixaHandler {
    private ValidadorCaixaHandler proximo;
    
    public ValidadorCaixaHandler() {
    }
    
    public abstract boolean validar(CaixaComposite caixa) throws Exception;

    public final void setNext(ValidadorCaixaHandler proximo) {
        this.proximo = proximo;
    }

    
    public final boolean executar(CaixaComposite caixa) throws Exception{
        if(validar(caixa)){
            if(proximo != null)
                return proximo.executar(caixa);
            return true;
        }
        else
            throw new RuntimeException("Não é possível validar caixa");
    }
}
