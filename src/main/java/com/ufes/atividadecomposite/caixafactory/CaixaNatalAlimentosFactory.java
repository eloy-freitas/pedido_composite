package com.ufes.atividadecomposite.caixafactory;

import com.ufes.atividadecomposite.composite.CaixaComposite;
import com.ufes.atividadecomposite.composite.ProdutoComposite;
import com.ufes.atividadecomposite.model.Tipo;
import java.util.ArrayList;
import java.util.List;


public class CaixaNatalAlimentosFactory implements CaixaFactory{

    public CaixaNatalAlimentosFactory() {
    }

    @Override
    public CaixaComposite getCaixa() {
        List<Tipo> produtoPermitidos = new ArrayList<>();
        produtoPermitidos.add(Tipo.ALIMENTO);
        produtoPermitidos.add(Tipo.BEBIDA);
              
        CaixaComposite caixa = new CaixaComposite(
                produtoPermitidos,
                "Caixa Natal: Alimentoes",
                Tipo.CAIXA_MEDIA,
                2,
                500, 
                3000,
                5
        );
        
        caixa.addProduto(new ProdutoComposite(
                "Panetone", 
                Tipo.ALIMENTO,
                50,
                20,
                40
        ));
        
        caixa.addProduto(new ProdutoComposite(
                "Vinho", 
                Tipo.ALIMENTO,
                100,
                40,
                20
        ));
        
        caixa.addProduto(new ProdutoComposite(
                "Frango Assado", 
                Tipo.ALIMENTO,
                30,
                50,
                50
        ));
        
        return caixa;
    } 
}
