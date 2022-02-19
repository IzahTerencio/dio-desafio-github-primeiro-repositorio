package com.projeto.atribuicaoreferencia;

public class MeuObjeto{

    Integer numero;

    public MeuObjeto(Integer numero) {
        this.numero = numero;
    }

    public void setNumero(Integer n){
        this.numero = n;
    }

    @Override
    public String toString() {
        return this.numero.toString();
    }
}
