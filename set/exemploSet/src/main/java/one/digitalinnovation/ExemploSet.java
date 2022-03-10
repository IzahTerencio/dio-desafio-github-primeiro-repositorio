package one.digitalinnovation;

import java.util.*;

public class ExemploSet{

    public static void main(String[] args){

        System.out.println("================================ EXERCÍCIO 01 ================================");

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


        System.out.println("\n\n");
        System.out.println("================================ EXERCÍCIO 02 ================================");

        // EXERCÍCIO: Crie uma classe LinguagemFavorita que possua os atributos nome, anoDeCriacao e ide.
        //            Em seguida crie um conjunto com 3 linguagens e faça um programa que ordene esse conjunto por:
        Set<LinguagemFavorita> linguagens = new LinkedHashSet<>();
        linguagens.add(new LinguagemFavorita("Java", 1991, "Netbeans"));
        linguagens.add(new LinguagemFavorita("Python", 1990, "Spyder"));
        linguagens.add(new LinguagemFavorita("Pascal", 1970, "Dev-Pascal"));

        // A. Ordem de inserção
        for(LinguagemFavorita ling : linguagens){
            System.out.println(ling);
        }
        System.out.println();

        // B. Ordem natural (nome)
/*        Set<LinguagemFavorita> linguagens2 = new TreeSet<>(linguagens);
        for(LinguagemFavorita ling : linguagens2){
            System.out.println(ling);
        }*/

        // C. IDE
/*        Set<LinguagemFavorita> linguagens3 = new TreeSet<>(linguagens);
        for(LinguagemFavorita ling : linguagens3){
            System.out.println(ling);
        }*/

        // D. Ano de criação e nome
/*        Set<LinguagemFavorita> linguagens3 = new TreeSet<>(linguagens);
        for(LinguagemFavorita ling : linguagens3){
            System.out.println(ling);
        }*/

        // E. Nome, ano de criação e IDE
        Set<LinguagemFavorita> linguagens4 = new TreeSet<>(new ComparatorNomeAnoIDE());
        linguagens4.addAll(linguagens);
        for(LinguagemFavorita ling : linguagens4){
            System.out.println(ling);
        }

    }

}



class LinguagemFavorita implements Comparable<LinguagemFavorita>{

    private String nome;
    private int anoDeCriacao;
    private String ide;

    public LinguagemFavorita(String nome, int anoDeCriacao, String ide){
        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
        this.ide = ide;
    }

    public String getNome(){
        return nome;
    }

    public int getAnoDeCriacao(){
        return anoDeCriacao;
    }

    public String getIde(){
        return ide;
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
    public String toString() {
        return "{" + nome +
                ", " + anoDeCriacao +
                ", " + ide +
                '}';
    }

    @Override
    public int compareTo(LinguagemFavorita linguagemFavorita){
        //return(this.getNome().compareToIgnoreCase(linguagemFavorita.getNome()));
        //return (this.getIde().compareToIgnoreCase(linguagemFavorita.getIde()));

        int anoCriacao = Integer.compare(this.getAnoDeCriacao(), linguagemFavorita.getAnoDeCriacao());
        if(anoCriacao != 0){
            return anoCriacao;
        } else{
            return(this.getNome().compareToIgnoreCase(linguagemFavorita.getNome()));
        }

    }

}


class ComparatorNomeAnoIDE implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2){
        int nome = l1.getNome().compareToIgnoreCase(l2.getNome());
        int ano = Integer.compare(l1.getAnoDeCriacao(), l2.getAnoDeCriacao());

        if(nome != 0){
            return nome;
        } else if(ano != 0){
            return  ano;
        } else{
            return(l1.getIde().compareToIgnoreCase(l2.getIde()));
        }
    }

}