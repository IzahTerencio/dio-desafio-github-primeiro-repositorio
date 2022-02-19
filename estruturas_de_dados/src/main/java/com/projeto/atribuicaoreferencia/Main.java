package com.projeto.atribuicaoreferencia;

public class Main{

    public static void main(String[] args){

        int intA = 1;
        int intB = intA;

        System.out.println("Valor de A é igual a: " + intA);
        System.out.println("Valor de B é igual a: " + intB);

        intA = 2;
        System.out.println("Novo valor de A é: " + intA);
        System.out.println("Valor de B é: " + intB);

    }

}
