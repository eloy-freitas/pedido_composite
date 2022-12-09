package com.ufes.atividadecomposite.validadorcaixa.handler;

import com.ufes.atividadecomposite.composite.CaixaComposite;
import com.ufes.atividadecomposite.composite.Composite;


public class ValidadorTipoProdutoHandler  extends ValidadorCaixaHandler{

    public ValidadorTipoProdutoHandler() {
    }

    @Override
    public boolean validar(CaixaComposite caixa) throws Exception {
        boolean validar = true;
        for(Composite p : caixa.getProdutos()){
            if(caixa.getProdutosPermitidos().indexOf(p.getTipo()) == -1){
                
                validar = false;
                throw new Exception(
                ""
                    .concat("\nProdutos do tipo: ")
                    .concat(p.getTipo())
                    .concat("\nNão são permitidos nessa caixa")
                );
            }
        }
        return validar;
    }
}
