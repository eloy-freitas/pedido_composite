package com.ufes.atividadecomposite.caixafactory;

import com.ufes.atividadecomposite.composite.CaixaComposite;
import com.ufes.atividadecomposite.composite.ProdutoComposite;
import java.util.ArrayList;
import java.util.List;


public class CaixaNatalBrinquedosFactory implements CaixaFactory{

    public CaixaNatalBrinquedosFactory() {
    }

    @Override
    public CaixaComposite getCaixa() {
        List<String> produtoPermitidos = new ArrayList<>();
        produtoPermitidos.add("Brinquedo");
              
        CaixaComposite caixa = new CaixaComposite(
                produtoPermitidos,
                "Caixa de natal: brinquedos", 
                "Caixa grande", 
                2,
                500, 
                3000,
                5
        );
        
        caixa.addProduto(new ProdutoComposite(
                "Carrinho de controle remoto", 
                "Brinquedo",
                100,
                30,
                20
        ));
        caixa.addProduto(new ProdutoComposite(
                "Boneco de ação", 
                "Brinquedo",
                150,
                25,
                30
        ));
        caixa.addProduto(new ProdutoComposite(
                "Quebra cabeça", 
                "Brinquedo",
                80,
                10,
                15
        ));
        
        return caixa;
        
    }
    
    
}
