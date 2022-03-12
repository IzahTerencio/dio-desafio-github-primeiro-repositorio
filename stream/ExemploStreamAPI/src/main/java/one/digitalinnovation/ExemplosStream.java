package one.digitalinnovation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.*;
import java.util.stream.Collectors;

public class ExemplosStream{

    public static void main(String[] args){

        List<String> numAleatorios = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

        // Imprimindo os elementos da lista
        // FORMA 1
        /*        numAleatorios.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });*/
        // FORMA 2
        //numAleatorios.stream().forEach(s -> System.out.println(s));
        // FORMA 3
        // numAleatorios.forEach(s -> System.out.println(s));
        // FORMA 4
/*        numAleatorios.forEach(System.out::println);

        System.out.println();*/
        // Pegando os 5 primeiros números e armazenando-os dentro de um set
/*
        numAleatorios.stream().limit(5).collect(Collectors.toSet()).forEach(System.out::println);
*/

        // Transformando a lista de String em uma lista de números inteiros
/*        numAleatorios.stream().map(new Function<String, Integer>(){
            @Override
            public Integer apply(String s){
                return(Integer.parseInt(s));
            }
        });*/
    /*    List<Integer> collectList = numAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());*/

        // Pegue os números pares e maiores que 2 e coloque-os em uma lista
/*        List<Integer> lista = numAleatorios.stream()
                .map(Integer::parseInt)
                .filter(new Predicate<Integer>(){
                    @Override
                    public boolean test(Integer i){
                        if(i%2 == 0 && i>2){
                            return true;
                        } else{ return false; }
                    }
                }).collect(Collectors.toList());
        System.out.println(lista);*/
/*        List<Integer> lista = numAleatorios.stream()
                .map(Integer::parseInt)
                .filter(i -> i%2 == 0 && i>2)
                .collect(Collectors.toList());
        System.out.println(lista);*/


        // Exibir a média dos números
/*        numAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);*/


        // REMOVENDO OS VALORES ÍMPARES
        List<Integer> lista = numAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        lista.removeIf(i -> (i%2 != 0));
        System.out.println(lista);
        

    }

}
