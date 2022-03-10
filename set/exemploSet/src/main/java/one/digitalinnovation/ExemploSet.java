package one.digitalinnovation;

import java.util.*;

public class ExemploSet{

    public static void main(String[] args){

        // EXERCÍCIO: Crie um conjunto contendo as cores do arco-íris
        Set<String> cores = new LinkedHashSet<>();
        cores.add("Vermelho");
        cores.add("Laranja");
        cores.add("Amarelo");
        cores.add("Verde");
        cores.add("Azul");
        cores.add("Anil");
        cores.add("Violeta");

        // A. Exiba todas as cores uma abaixo da outra
        for(String cor : cores){
            System.out.println(cor);
        }
        System.out.println();

        // B. A quantidade de cores que o arco-íris tem
        System.out.println("O arco-iris possui " + cores.size() + " cores.");
        System.out.println();

        // C. Exiba as cores em ordem alfabética
        Set<String> cores2 = new TreeSet<>(cores);
        System.out.println(cores2);
        System.out.println();

        // D. Exiba as cores na ordem inversa que foram informadas
        List<String> listaAux = new ArrayList<>(cores);
        System.out.println(listaAux);
        Collections.reverse(listaAux);
        System.out.println(listaAux);
        System.out.println();

        // E. Exiba todas as cores que começam com a letra V
        for(String cor : cores){
            if(cor.indexOf("V") == 0){
                System.out.println(cor);
            }
        }
        System.out.println();

        // F. Remova todas as cores que não começam com a letra V
        for(String cor : cores){
            if(cor.indexOf("V") == 0){
                cores2.remove(cor);
            }
        }
        System.out.println(cores2);
        System.out.println();

        // G. Limpe o conjunto
        cores.clear();
        cores2.clear();
        System.out.println(cores);
        System.out.println(cores2);
        System.out.println();

        // H. Confira se o conjunto está vazio
        if(cores.isEmpty()){
            System.out.println("Conjunto vazio!");
        } else{
            System.out.println("Ainda há elementos aqui :/");
        }

    }

}


class Cor implements Comparable<Cor>{

    String nomeCor;

    public Cor(String nomeCor){
        this.nomeCor = nomeCor;
    }

    public String getNomeCor(){
        return nomeCor;
    }

    @Override
    public int hashCode(){
        return super.hashCode();
    }

    @Override
    public boolean equals(Object o){
        return super.equals(o);
    }

    @Override
    public String toString(){
        return super.toString();
    }

    @Override
    public int compareTo(Cor cor){
        return(this.getNomeCor().compareToIgnoreCase(cor.getNomeCor()));
    }

}
