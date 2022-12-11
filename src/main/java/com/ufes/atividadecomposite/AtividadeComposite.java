package com.ufes.atividadecomposite;

import com.ufes.atividadecomposite.caixafactory.CaixaNatalAlimentosFactory;
import com.ufes.atividadecomposite.caixafactory.CaixaNatalBrinquedosFactory;
import com.ufes.atividadecomposite.composite.CaixaComposite;
import com.ufes.atividadecomposite.composite.ProdutoComposite;
import com.ufes.atividadecomposite.model.Tipo;
import com.ufes.atividadecomposite.validadorcaixa.service.ValidadorCaixaService;


public class AtividadeComposite {

    public static void main(String[] args) throws Exception {
        ValidadorCaixaService s = new ValidadorCaixaService();
        
        CaixaComposite c1 = new CaixaNatalAlimentosFactory().getCaixa();
        c1.addProduto(new ProdutoComposite(
                    "Queijo parmesão", 
                    Tipo.ALIMENTO, 
                    70, 100, 
                    20)
        );
        System.out.println(s.validar(c1));
        System.out.println(c1.toString());
        
        c1 = new CaixaNatalBrinquedosFactory().getCaixa();
        
         c1.addProduto(new ProdutoComposite(
                "Boneco do homem aranha", 
                Tipo.BRINQUEDO, 
                400, 
                200, 
                100
            )
        );
        
        System.out.println(s.validar(c1));
        System.out.println(c1.toString());
    }
}
