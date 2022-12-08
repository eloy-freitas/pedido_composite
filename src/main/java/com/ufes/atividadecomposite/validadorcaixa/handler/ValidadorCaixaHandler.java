package com.ufes.atividadecomposite.validadorcaixa.handler;

import com.ufes.atividadecomposite.composite.CaixaComposite;


public abstract class ValidadorCaixaHandler {
    private ValidadorCaixaHandler next;
    private String erro;
    

    public ValidadorCaixaHandler() {
    }
    
    public abstract boolean validar(CaixaComposite caixa) throws Exception;

    public final void setNext(ValidadorCaixaHandler next) {
        this.next = next;
    }

    public final String getErro() {
        return erro;
    }
    
    public final boolean executar(CaixaComposite caixa) throws Exception{
        if(validar(caixa))
            return next.executar(caixa);
        else
            throw new RuntimeException("Não é possível validar caixa");
    }
}
