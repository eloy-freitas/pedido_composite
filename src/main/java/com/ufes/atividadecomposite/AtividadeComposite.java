package com.ufes.atividadecomposite;

import com.ufes.atividadecomposite.composite.CaixaComposite;
import com.ufes.atividadecomposite.composite.ProdutoComposite;


public class AtividadeComposite {

    public static void main(String[] args) {
        CaixaComposite c1 = new CaixaComposite("c1", "1", 1000);
        c1.addProduto(new ProdutoComposite("a","a",10,10,20));
        c1.addProduto(new ProdutoComposite("ba","ba",20,150,2));
        
        System.out.println(c1.toString());
    }
}
