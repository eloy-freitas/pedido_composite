package com.ufes.atividadecomposite.validadorcaixa.handler;

import com.ufes.atividadecomposite.composite.CaixaComposite;


public abstract class ValidadorCaixaHandler {
    private ValidadorCaixaHandler next;
    private String erro;
    

    public ValidadorCaixaHandler() {
    }
    
    public abstract boolean validar(CaixaComposite caixa);

    public final void setNext(ValidadorCaixaHandler next) {
        this.next = next;
    }
    
    public final String getErro() {
        return erro;
    }
    
    public final boolean executar(CaixaComposite caixa){
        if(validar(caixa) && next != null)
            next.executar(caixa);
        else if(next == null)
            return true;
        else
            throw new RuntimeException(getErro());
        return false;
    }
}
