package com.ufes.atividadecomposite.composite;

import com.ufes.atividadecomposite.model.Tipo;
import java.util.ArrayList;
import java.util.List;


public class CaixaComposite  extends Composite{
    
    private List<Composite> produtos;
    private List<Tipo> produtosPermitidos;
    private double limiteVolume;
    private double limitePeso;
    private int limitItens;
    
    public CaixaComposite(
        String nome, 
        Tipo tipo, 
        double limiteVolume,
        double limitePeso,
        int limitItens
    ) {
        super(nome, tipo, 0, 0, limiteVolume);
        this.produtos = new ArrayList<>();
        this.produtosPermitidos = new ArrayList<>();
        this.limiteVolume = limiteVolume;
        this.limitePeso = limitePeso;
        this.limitItens = limitItens;          
    }
    
    public CaixaComposite(
        List<Tipo> produtosPermitidos,
        String nome, 
        Tipo tipo, 
        double valor, 
        double limiteVolume,
        double limitePeso,
        int limitItens
    ) {
        super(nome, tipo, valor, limitePeso, limiteVolume);
        this.produtos = new ArrayList<>();
        this.produtosPermitidos = produtosPermitidos;
        this.limiteVolume = limiteVolume;
        this.limitePeso = limitePeso;
        this.limitItens = limitItens;
        
    }

    public CaixaComposite(
        List<Composite> produtos, 
        List<Tipo> produtosPermitidos,
        String nome, 
        Tipo tipo, 
        double valor,
        double limiteVolume,
        double limitePeso,
        int limitItens
    ) {
        super(nome, tipo, valor,limitePeso, limiteVolume);
        this.produtos = produtos;
        this.produtosPermitidos = produtosPermitidos;
        this.limiteVolume = limiteVolume;
        this.limitePeso = limitePeso;
        this.limitItens = limitItens;
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
    public Tipo getTipo() {
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

    public List<Composite> getProdutos() {
        return produtos;
    }

    public double getLimiteVolume() {
        return limiteVolume;
    }

    public double getLimitePeso() {
        return limitePeso;
    }

    public int getLimitItens() {
        return limitItens;
    }

    public List<Tipo> getProdutosPermitidos() {
        return produtosPermitidos;
    }
    
    
}
