package com.ufes.atividadecomposite.validadorcaixa.handler;

import com.ufes.atividadecomposite.composite.CaixaComposite;


public class ValidadorQuantidadeItemHandler extends ValidadorCaixaHandler{

    public ValidadorQuantidadeItemHandler() {
    }

    @Override
    public boolean validar(CaixaComposite caixa) {
        return (caixa.getQuantidadeProdutos()<= 5);
    }
    
    
}
