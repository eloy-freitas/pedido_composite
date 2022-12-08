package com.ufes.atividadecomposite.composite;


public abstract class Composite {
    protected String nome;
    protected String tipo;
    protected double valor;
    protected double peso;
    protected double volume;

    public Composite(String nome, String tipo, double valor, double peso, double volume) {
        this.nome = nome;
        this.tipo = tipo;
        this.valor = valor;
        this.peso = peso;
        this.volume = volume;
    }
    
    public abstract String getNome();

    public abstract String getTipo();

    public abstract double getValor();

    public abstract double getPeso();

    public abstract double getVolume();
    
    @Override
    public String toString() {
        return "Composite{"
                + "nome=" + getNome() 
                + ", tipo=" + getTipo()
                + ", valor=" + getValor()
                + ", peso=" + getPeso()
                + ", volume=" + getVolume()
                + '}';
    }



    
}
