package com.ufes.atividadecomposite.validadorcaixa.handler;

import com.ufes.atividadecomposite.composite.CaixaComposite;


public class ValidadorQuantidadeItemHandler extends ValidadorCaixaHandler{
    public ValidadorQuantidadeItemHandler() {
    }

    @Override
    public boolean validar(CaixaComposite caixa) throws Exception{
        int quantidadeItens = caixa.getLimitItens();
        if(caixa.getQuantidadeProdutos()<= quantidadeItens)
            return true;
        throw new Exception(
            ""
            .concat("\nQuantidade de itens permitido de: ")
            .concat(String.valueOf(quantidadeItens))
            .concat("\nQuantidade selecionados: ")
            .concat(String.valueOf(caixa.getQuantidadeProdutos()))
        );
    }
    
    
}
