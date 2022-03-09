package one.digitalinnovation;

import java.util.*;

public class ExemploList{

    public static void main(String[] args){

        System.out.println("==========  EXERCICIOS COM COLECTION LIST EM JAVA ==========");

        List<Double> notasAlunos = new ArrayList<>();

        notasAlunos.add(7d);
        notasAlunos.add(8.5);
        notasAlunos.add(9.3);
        notasAlunos.add(5.0);
        notasAlunos.add(7.0);
        notasAlunos.add(0d);
        notasAlunos.add(3.6);

        System.out.println("==> IMPRESSAO 1" + "\n"
                + notasAlunos);
        System.out.println();

        System.out.println("==> IMPRESSAO 2" + "\n"
                + notasAlunos.toString());
        System.out.println();

        System.out.println("==> POSICAO DE UM ELEMENTO" +
                "\nElemento (nota) 5.0: "+
                notasAlunos.indexOf(5d));

        notasAlunos.add(4, 8d);

        System.out.println("==> IMPRESSAO 3" + "\n"
                + notasAlunos.toString());
        System.out.println();

        notasAlunos.set(notasAlunos.indexOf(5d), 6d); // Substituindo nota 5.0 por nota 6.0

        System.out.println("==> IMPRESSAO 4" + "\n"
                + notasAlunos.toString());
        System.out.println();

        System.out.println("Nota 5.0 esta presente na estrutura? " + notasAlunos.contains(5d));

        System.out.println();
        System.out.println("==> IMPRIMINDO ELEMENTOS COM FOR EACH:");
        for(Double nota : notasAlunos) System.out.println(nota);

        System.out.println();
        System.out.println("Terceira nota adicionada à lista: " + notasAlunos.get(2));

        System.out.println();
        System.out.println("Menor nota da estrutura: " + Collections.min(notasAlunos));

        System.out.println();
        System.out.println("Maior nota da estrutura: " + Collections.max(notasAlunos));

        System.out.println();
        Iterator<Double> iterator = notasAlunos.iterator();
        double soma = 0.0;
        while(iterator.hasNext()){
            double next = iterator.next();
            soma += next;
        }
        System.out.println("Soma das notas dos alunos: " + soma + "\n");

        System.out.println("Media das notas dos alunos: " + (soma / notasAlunos.size()) + "\n");

        notasAlunos.remove(0.0);
        System.out.println("==> IMPRESSAO 5" + "\n"
                + notasAlunos.toString());
        System.out.println();

        notasAlunos.remove(0);
        System.out.println("==> IMPRESSAO 6" + "\n"
                + notasAlunos.toString());
        System.out.println();

        Iterator<Double> it1 = notasAlunos.iterator();
        while(it1.hasNext()){
            double next = it1.next();
            if(next < 7 ){
                it1.remove();
            }
        }
        System.out.println("==> IMPRESSAO 7" + "\n"
                + notasAlunos.toString());
        System.out.println();

        notasAlunos.clear();
        System.out.println("Lista apagada: " + notasAlunos);

        


    }

}
