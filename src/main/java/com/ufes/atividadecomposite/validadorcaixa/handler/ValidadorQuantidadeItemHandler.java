package com.ufes.atividadecomposite.validadorcaixa.handler;

import com.ufes.atividadecomposite.composite.CaixaComposite;


public class ValidadorQuantidadeItemHandler extends ValidadorCaixaHandler{
    
    private final int quantidadeItens = 5;
    
    public ValidadorQuantidadeItemHandler() {
    }

    @Override
    public boolean validar(CaixaComposite caixa) throws Exception{
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
