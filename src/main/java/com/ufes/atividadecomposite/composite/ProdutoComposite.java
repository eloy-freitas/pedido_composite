package com.ufes.atividadecomposite.composite;

import com.ufes.atividadecomposite.model.Tipo;

public class ProdutoComposite extends Composite{

    public ProdutoComposite(
        String nome, 
        Tipo tipo, 
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

    @Override
    public Tipo getTipo() {
        return tipo;
    }

}
