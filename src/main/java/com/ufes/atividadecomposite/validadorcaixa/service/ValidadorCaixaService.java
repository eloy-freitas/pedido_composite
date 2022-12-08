package com.ufes.atividadecomposite.validadorcaixa.service;

import com.ufes.atividadecomposite.composite.CaixaComposite;
import com.ufes.atividadecomposite.validadorcaixa.handler.ValidadorCaixaHandler;
import com.ufes.atividadecomposite.validadorcaixa.handler.ValidadorPesoHandler;
import com.ufes.atividadecomposite.validadorcaixa.handler.ValidadorQuantidadeItemHandler;


public class ValidadorCaixaService {

    private ValidadorCaixaHandler primeiro;
    private ValidadorCaixaHandler proximo;

    
    public ValidadorCaixaService() {
        
    }
    
    public void addValidador(ValidadorCaixaHandler handler){
        if (this.primeiro == null) {
            this.primeiro = handler;
        } else {
            this.proximo.setNext(handler);
        }
        this.proximo = handler;
    }

    public boolean validar(CaixaComposite caixa) throws Exception{
        return primeiro.executar(caixa);
    }
    
}
