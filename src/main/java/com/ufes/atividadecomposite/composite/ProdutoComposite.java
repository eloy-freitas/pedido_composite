package com.ufes.atividadecomposite.composite;

public class ProdutoComposite extends Composite{

    public ProdutoComposite(
        String nome, 
        String tipo, 
        double valor, 
        double peso, 
        double volume
    ) {
        super(nome, tipo, valor, peso, volume);
    }
    
    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getTipo() {
        return tipo;
    }

    @Override
    public double getValor() {
        return valor;
    }

    @Override
    public double getPeso() {
        return peso;
    }

    @Override
    public double getVolume() {
        return volume;
    }

    
    
    
}
