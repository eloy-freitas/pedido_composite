package com.ufes.atividadecomposite.caixafactory;

import com.ufes.atividadecomposite.composite.CaixaComposite;
import com.ufes.atividadecomposite.composite.ProdutoComposite;
import java.util.ArrayList;
import java.util.List;


public class CaixaNatalAlimentosFactory implements CaixaFactory{

    public CaixaNatalAlimentosFactory() {
    }

    @Override
    public CaixaComposite getCaixa() {
        List<String> produtoPermitidos = new ArrayList<>();
        produtoPermitidos.add("Alimento");
        produtoPermitidos.add("Bebida");
              
        CaixaComposite caixa = new CaixaComposite(
                produtoPermitidos,
                "Caixa Natal: Alimentoes",
                "Caixa Média",
                2,
                500, 
                3000,
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
