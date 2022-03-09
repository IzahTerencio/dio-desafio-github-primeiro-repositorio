package one.digitalinnovation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExerciciosList{

    public static void main(String[] args){

/*        // O programa deve receber a temperatura média dos 6
        // primeiros meses do ano e armazenar as mesmas em uma lista.
        Scanner entrada = new Scanner(System.in);
        double temperatura = 0d;

        List<Double> listaTemp = new ArrayList<>();

        for(int i=0; i<6; i++){
            System.out.print("Digite um valor: ");
            temperatura = entrada.nextDouble();
            listaTemp.add(temperatura);
        }

        //System.out.println(listaTemp);

        double soma = 0d;
        for(Double temp : listaTemp){
            soma += temp;
        }
        //System.out.println(soma);

        double media = soma/6.0;
        for(int i=0; i<6; i++){

            double temp = listaTemp.get(i);
            if(temp > media){

                if(i == 0){
                    System.out.println(temp + " - Janeiro");
                } else if(i == 1){
                    System.out.println(temp + " - Fevereiro");
                } else if(i == 2){
                    System.out.println(temp + " - Marco");
                } else if(i == 3){
                    System.out.println(temp + " - Abril");
                } else if(i == 4){
                    System.out.println(temp + " - Maio");
                } else if(i == 5){
                    System.out.println(temp + " - Junho");
                }

            }

        }*/

        Scanner entrada = new Scanner(System.in);
        String resposta;
        List<String> respostas = new ArrayList<>();

            System.out.print("Telefonou para a vítima? (s/n) ");
            resposta = entrada.next();
            respostas.add(resposta);
            System.out.print("Esteve no local do crime? (s/n) ");
            resposta = entrada.next();
            respostas.add(resposta);
            System.out.print("Mora perto da vítima? (s/n) ");
            resposta = entrada.next();
            respostas.add(resposta);
            System.out.print("Devia para a vítima? (s/n) ");
            resposta = entrada.next();
            respostas.add(resposta);
            System.out.print("Já trabalhou com a vítima? (s/n) ");
            resposta = entrada.next();
            respostas.add(resposta);

        int cont = 0;
        String resp;
        for(int i=0; i<5; i++){
            if(respostas.get(i).compareToIgnoreCase("s") == 0){
                cont++;
            }
        }

        if(cont == 2){
            System.out.println("Suspeito");
        } else if(cont==3 || cont==4){
            System.out.println("Cumplice");
        } else if(cont==5){
            System.out.println("Assassino");
        } else{
            System.out.println("Inocente");
        }

    }

}
