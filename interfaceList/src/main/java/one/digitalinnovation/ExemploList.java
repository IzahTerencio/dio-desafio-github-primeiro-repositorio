package one.digitalinnovation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    }

}
