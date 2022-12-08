package com.ufes.atividadecomposite;

import com.ufes.atividadecomposite.composite.CaixaComposite;
import com.ufes.atividadecomposite.composite.ProdutoComposite;
import com.ufes.atividadecomposite.validadorcaixa.handler.ValidadorCaixaHandler;
import com.ufes.atividadecomposite.validadorcaixa.handler.ValidadorPesoHandler;
import com.ufes.atividadecomposite.validadorcaixa.handler.ValidadorQuantidadeItemHandler;
import com.ufes.atividadecomposite.validadorcaixa.handler.ValidadorVolumeHandler;
import com.ufes.atividadecomposite.validadorcaixa.service.ValidadorCaixaService;


public class AtividadeComposite {

    public static void main(String[] args) throws Exception {
        ValidadorCaixaService s = new ValidadorCaixaService();
        
        CaixaComposite c1 = new CaixaComposite("c1", "1", 1000);
        c1.addProduto(new ProdutoComposite("a","a",10,0,0));
        c1.addProduto(new ProdutoComposite("ba","ba",20,150,0));
        c1.addProduto(new ProdutoComposite("ba","ba",20,150,0));
        c1.addProduto(new ProdutoComposite("ba","ba",20,150,0));
        c1.addProduto(new ProdutoComposite("ba","ba",20,150,0));
        c1.addProduto(new ProdutoComposite("ba","ba",20,150,0));
        c1.addProduto(new ProdutoComposite("ba","ba",20,150,0));
        
        s.addValidador(new ValidadorPesoHandler());
        s.addValidador(new ValidadorQuantidadeItemHandler());
        s.addValidador(new ValidadorVolumeHandler());
        System.out.println(s.validar(c1));
    }
}
