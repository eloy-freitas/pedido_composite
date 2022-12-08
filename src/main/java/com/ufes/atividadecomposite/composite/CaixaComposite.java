package com.ufes.atividadecomposite.composite;

import java.util.ArrayList;
import java.util.List;


public class CaixaComposite  extends Composite{
    
    private List<Composite> produtos;
    
    public CaixaComposite(
            String nome, 
            String tipo, 
            double volume
    ) {
        super(nome, tipo, 0, 0, volume);
        produtos = new ArrayList<>();
        
    }
    
    
    public CaixaComposite(
            String nome, 
            String tipo, 
            double valor, 
            double peso, 
            double volume
    ) {
        super(nome, tipo, valor, peso, volume);
        produtos = new ArrayList<>();
        
    }

    public CaixaComposite(
            List<Composite> produtos, 
            String nome, 
            String tipo, 
            double valor,
            double peso, 
            double volume
    ) {
        super(nome, tipo, valor, peso, volume);
        this.produtos = produtos;
    }
    
    public void addProduto(Composite produto){
        this.produtos.add(produto);
    }
    
    public int getQuantidadeProdutos(){
        return produtos.size();
    }
    
    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public String getTipo() {
        return this.tipo;
    }

    @Override
    public double getValor() {
        double total = 0;
        for(Composite p : this.produtos){
            total += p.getValor();
        }
        
        return total;        
    }

    @Override
    public double getPeso() {
        double total = 0;
        for(Composite p : this.produtos){
            total += p.getPeso();
        }
        
        return total;
    }

    @Override
    public double getVolume() {
        double total = 0;
        for(Composite p : this.produtos){
            total += p.getVolume();
        }
        
        return total;
    }
}
