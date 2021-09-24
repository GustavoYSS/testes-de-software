package com.estrutura;

public class ContaPoupanca extends Conta implements Rendimentos{

    public ContaPoupanca(Titular titular, int numero, int agencia) {
        super(titular, numero, agencia);
    }

    @Override
    public boolean depositar(double valor) {
        this.saldo+=valor;
        return true;
    }

    @Override
    public boolean sacar(double valor) {
        if(valor < this.getSaldo())
        return false;
        else{
            this.saldo-=valor;
            return true;
        }
    }

    @Override
    public void atualizar(double taxaRendimento) {
        this.saldo=this.saldo*(1+taxaRendimento);
        
    }
    
}
