package one.digitalinnovation;

import java.util.*;

public class ExemploOrdenacao{

    public static void main(String[] args){

        // Criar dicionário e ordená-lo
        // Exibição: NomeAutor - NomeLivro

        // Ordem aleatória
        Map<String, Livro> livros = new HashMap<String, Livro>(){{
            put("Hawking, Stephen", new Livro("Uma Breve História do Tempo", 251));
            put("DuhIgg, Charles", new Livro("O Poder do Hábito", 408));
            put("Harari, Yuval Noah", new Livro("21 Ligações para o Século 21", 264));
        }};
        for(Map.Entry<String, Livro> liv : livros.entrySet()){
            System.out.println(liv.getKey() + " - " + liv.getValue().getNome());
        }
        System.out.println();

        // Exibindo os livros na ordem de inserção
        Map<String, Livro> livrosLHM = new LinkedHashMap<String, Livro>(){{
            put("Hawking, Stephen", new Livro("Uma Breve História do Tempo", 251));
            put("DuhIgg, Charles", new Livro("O Poder do Hábito", 408));
            put("Harari, Yuval Noah", new Livro("21 Ligações para o Século 21", 264));
        }};
        for(Map.Entry<String, Livro> liv : livrosLHM.entrySet()){
            System.out.println(liv.getKey() + " - " + liv.getValue().getNome());
        }
        System.out.println();

        // Ordenando a estrutura por ordem alfabética dos autores
        Map<String, Livro> livrosTM = new TreeMap<String, Livro>(livros);
        for(Map.Entry<String, Livro> liv : livrosTM.entrySet()){
            System.out.println(liv.getKey() + " - " + liv.getValue().getNome());
        }
        System.out.println();

        // Ordenando a estrutura por ordem alfabética dos nomes dos livros
        Set<Map.Entry<String, Livro>> livrosTS = new TreeSet<>(new ComparatorNome());
        livrosTS.addAll(livros.entrySet());
        for(Map.Entry<String, Livro> l : livros.entrySet()){
            System.out.println(l.getKey() + " - " + l.getValue().getNome());
        }

    }

}


class Livro{

    private String nome;
//    private String autor;
    private Integer numPaginas;

    public Livro(){
    }

    public Livro(String nome, Integer numPaginas){
        this.nome = nome;
        this.numPaginas = numPaginas;
    }

    public String getNome(){
        return nome;
    }

    public Integer getNumPaginas(){
        return numPaginas;
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
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }

}


class ComparatorNome implements Comparator<Map.Entry<String, Livro>>{

    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2){
        return(l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome()));
    }

}