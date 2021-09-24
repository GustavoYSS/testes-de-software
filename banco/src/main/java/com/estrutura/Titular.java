package com.estrutura;

public class Titular {
    private String nome;
    private String email;
    private String endereco;
    Titular(String nome,String email,String endereco){
        this.nome=nome;
        this.email=email;
        this.endereco=endereco;
    }
        public String getNome(){
            return this.nome;
        }
        public String getEmail(){
            return this.email;
        }
        public String getEndereco(){
            return this.endereco;
        }
        public void setNome(String nome){
            this.nome=nome;
        }
        public void setEmail(String email){
            this.email=email;
        }
        public void setEndereco(String ende){
            this.endereco=ende;
        }
}
