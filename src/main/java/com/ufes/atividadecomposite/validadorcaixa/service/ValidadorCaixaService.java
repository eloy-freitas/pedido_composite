package com.ufes.atividadecomposite.validadorcaixa.service;

import com.ufes.atividadecomposite.composite.CaixaComposite;
import com.ufes.atividadecomposite.validadorcaixa.handler.ValidadorCaixaHandler;
import com.ufes.atividadecomposite.validadorcaixa.handler.ValidadorPesoHandler;
import com.ufes.atividadecomposite.validadorcaixa.handler.ValidadorQuantidadeItemHandler;
import com.ufes.atividadecomposite.validadorcaixa.handler.ValidadorVolumeHandler;


public class ValidadorCaixaService {

    private ValidadorCaixaHandler primeiro;
    private ValidadorCaixaHandler proximo;

    
    public ValidadorCaixaService() {
        initservices();
    }
    
    public void addValidador(ValidadorCaixaHandler handler){
        if (this.primeiro == null) {
            this.primeiro = handler;
        } else {
            this.proximo.setNext(handler);
        }
        this.proximo = handler;
    }
    
    private void initservices(){
        this.addValidador(new ValidadorPesoHandler());
        this.addValidador(new ValidadorQuantidadeItemHandler());
        this.addValidador(new ValidadorVolumeHandler());
    }

    public boolean validar(CaixaComposite caixa) throws Exception{
        return primeiro.executar(caixa);
    }
    
}
