package one.digitalinnovation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploOrdenacaoList{

    public static void main(String[] args){

        List<Gato> gatos = new ArrayList<Gato>(){{
            add(new Gato("Mateo", 18,  "preto"));
            add(new Gato("Salem", 6, "tigrado"));
            add(new Gato("Mateo", 12, "amarelo"));
        }};

        System.out.println("===== IMPRIMINDO NA ORDEM DE INSERCAO =====");
        System.out.println(gatos);
        System.out.println();

        System.out.println("===== IMPRIMINDO EM ORDEM ALEATORIA =====");
        Collections.shuffle(gatos);
        System.out.println(gatos);
        System.out.println();

        System.out.println("===== ORDEM NATURAL DOS ELEMENTOS =====");
        Collections.sort(gatos);
        System.out.println(gatos);

    }

}


class Gato implements Comparable<Gato>{

    private String nome;
    private Integer idade;
    private String cor;

    public Gato(){
    }

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome(){
        return nome;
    }

    public Integer getIdade(){
        return idade;
    }

    public String getCor(){
        return cor;
    }

    @Override
    public String toString(){
        return "Gato{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }

    @Override
    public int compareTo(Gato gato) {
        return(this.getNome().compareToIgnoreCase(gato.getNome()));
    }

}