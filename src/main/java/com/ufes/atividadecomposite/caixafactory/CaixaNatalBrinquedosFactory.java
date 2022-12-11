package com.ufes.atividadecomposite.caixafactory;

import com.ufes.atividadecomposite.composite.CaixaComposite;
import com.ufes.atividadecomposite.composite.ProdutoComposite;
import java.util.ArrayList;
import java.util.List;
import com.ufes.atividadecomposite.model.Tipo;


public class CaixaNatalBrinquedosFactory implements CaixaFactory{

    public CaixaNatalBrinquedosFactory() {
    }

    @Override
    public CaixaComposite getCaixa() {
        
        List<Tipo> produtoPermitidos = new ArrayList<>();
        produtoPermitidos.add(Tipo.ALIMENTO);
              
        CaixaComposite caixa = new CaixaComposite(
                produtoPermitidos,
                "Caixa de natal: brinquedos", 
                Tipo.CAIXA_GRANDE, 
                2,
                500, 
                3000,
                5
        );
        
        caixa.addProduto(new ProdutoComposite(
                "Carrinho de controle remoto", 
                Tipo.BRINQUEDO,
                100,
                30,
                20
        ));
        caixa.addProduto(new ProdutoComposite(
                "Boneco de ação", 
                Tipo.BRINQUEDO,
                150,
                25,
                30
        ));
        caixa.addProduto(new ProdutoComposite(
                "Quebra cabeça", 
                Tipo.BRINQUEDO,
                80,
                10,
                15
        ));
        
        return caixa;
        
    }
    
    
}
