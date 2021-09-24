package com.estrutura;

public class ContaEspecial extends ContaCorrente implements Rendimentos{

    public ContaEspecial(Titular titular, int numero, int agencia) {
        super(titular, numero, agencia);
    }

    @Override
    public void atualizar(double taxaRendimento) {
        this.saldo=this.saldo*(1+taxaRendimento);
        
    }
    
    
}
