package com.ufes.atividadecomposite.caixafactory;

import com.ufes.atividadecomposite.composite.CaixaComposite;
import com.ufes.atividadecomposite.composite.ProdutoComposite;


public class CaixaNatalAlimentosFactory implements CaixaFactory{

    public CaixaNatalAlimentosFactory() {
    }

    @Override
    public CaixaComposite getCaixa() {
        CaixaComposite caixa = new CaixaComposite(
            "Caixa de natal", 
            "Caixa grande", 
            1000,
            500,
            5
        );
        
        caixa.addProduto(new ProdutoComposite(
                "Panetone", 
                "Alimento",
                50,
                20,
                40
        ));
        
        caixa.addProduto(new ProdutoComposite(
                "Vinho", 
                "Bebida",
                100,
                40,
                20
        ));
        
        caixa.addProduto(new ProdutoComposite(
                "Frango Assado", 
                "Alimento",
                30,
                50,
                50
        ));
        
        return caixa;
    } 
}
