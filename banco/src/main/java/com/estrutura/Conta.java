package com.estrutura;

public abstract class Conta {
    private int numero;
    private int agencia;
    private Titular titular;
    protected double saldo;

    public Conta(Titular titular,int numero,int agencia){
        this.numero=numero;
        this.agencia=agencia;
        this.titular=titular;
    }
    public Titular getTitular(){
        return this.titular;
    }
    public void setTitular(Titular titular){
        this.titular=titular;
    }
    public int getNumero(){
        return this.numero;
    }
    public int getAgencia(){
        return this.agencia;
    }
    public double getSaldo(){
        return this.saldo;
    }
    public abstract boolean sacar(double valor);
    public abstract boolean depositar(double valor);
    public boolean transferir(double valor,Conta favorecido){
        this.saldo-=valor;
        favorecido.depositar(valor);
        return true;
    }
}
