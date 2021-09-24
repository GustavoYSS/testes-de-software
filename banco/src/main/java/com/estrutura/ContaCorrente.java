package com.estrutura;

public class ContaCorrente extends Conta{
    private double limite,taxa;
    public ContaCorrente(Titular titular, int numero, int agencia) {
        super(titular, numero, agencia);
    }

    public double getLimite(){
        return this.limite;
    }
    public void setLimite(double Limite){
        this.limite=limite;
    }
    public double getTaxa(){
        return this.taxa;
    }
    public void setTaxa(double taxa){
        this.taxa=taxa;
    }
    public double getSaldoComLimite(){
        return this.limite+this.saldo;
    }
    public boolean sacar(double valor){
        double saldoComLimite=this.getSaldoComLimite();
        if(valor > saldoComLimite){
            return false;
        }else{
            this.saldo-=valor;
            return false;
        }
    }
    @Override
    public boolean depositar(double valor){
        this.saldo+=valor;
        return true;
    }
}
