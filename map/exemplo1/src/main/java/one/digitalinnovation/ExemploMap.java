package one.digitalinnovation;

import java.util.*;

public class ExemploMap{

    public static void main(String[] args){

        // Criação de um dicionário, adição de elementos
        Map<String, Double> carros = new HashMap<String, Double>(){{
            put("Gol", 14.4);
            put("Uno", 15.6);
            put("Mobi", 16.1);
            put("HB20", 14.5);
            put("Voyage", 15.6);
        }};
        System.out.println(carros.toString() );
        System.out.println();

        // Substituindo o consumo do Gol por 15.2km/l
        carros.put("Gol", 15.2);
        System.out.println(carros);
        System.out.println();

        // Conferindo se determinado modelo foi adicionado à estrutura
        System.out.println("Tucson está adicionado? " + carros.containsKey("Tucson"));
        System.out.println("Uno está adicionado? " + carros.containsKey("Uno"));
        System.out.println();

        // Exibindo o consumo de um dos carros
        System.out.println("Consumo do Uno: " + carros.get("Uno"));
        System.out.println();

        // Exibindo os modelos adicionados
        Set<String> modelos = carros.keySet();
        System.out.println(modelos);
        System.out.println();

        // Exibindo os consumos dos carros
        Collection<Double> consumos = carros.values();
        System.out.println(consumos);
        System.out.println();

        // Exibindo o modelo mais econômico e seu respectivo consumo
        Double menorConsumo = Collections.max(carros.values());
        Set<Map.Entry<String, Double>> entries = carros.entrySet();
        String modeloMelhor = "";
        for(Map.Entry<String, Double> entry : entries){
            if(entry.getValue().equals(menorConsumo)){
                modeloMelhor = entry.getKey();
            }
        }
        System.out.println("Modelo mais eficiente: " + modeloMelhor + " - " + menorConsumo);
        System.out.println();

        // Exibindo o modelo menos econômico e seu respectivo consumo
        Double piorConsumo = Collections.min(carros.values());
        String piorModelo = "";
        for(Map.Entry<String, Double> entry : carros.entrySet()){
            if(entry.getValue().equals(piorConsumo)){
                piorModelo = entry.getKey();
                System.out.println("Modelo menos eficiente: " + piorModelo + " - " + piorConsumo);
            }
        }
        System.out.println();

        // Exibindo a soma dos consumos dos modelos
        Iterator<Double> iterator = carros.values().iterator();
        Double soma = 0.0;
        while(iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println("Soma dos consumos é: " + soma);
        System.out.println();

        // Exibindo a média dos consumos
        System.out.println("Média dos consumos " + soma/carros.size());
        System.out.println();

        // Removendo modelos com determinado consumo
        Iterator<Double> it1 = carros.values().iterator();
        while(it1.hasNext()){
            if(it1.next() == 15.6){
                it1.remove();
            }
        }
        System.out.println(carros.toString());
        System.out.println();

        // Exibindo os carros na ordem que foram informados
        Map<String, Double> carrosLHM = new LinkedHashMap<String, Double>(){{
            put("Gol", 14.4);
            put("Uno", 15.6);
            put("Mobi", 16.1);
            put("HB20", 14.5);
            put("Voyage", 15.6);
        }};
        System.out.println(carrosLHM);
        System.out.println();

        // Exibindo dicionário ordenado pelo modelo
        Map<String, Double> carrosTM = new TreeMap<>(carrosLHM);
        System.out.println(carrosTM);
        System.out.println();

        // Apagando o dicionário de carros
        carros.clear();
        carrosLHM.clear();
        carrosTM.clear();

        // Conferindo se o dicionário está vazio
        System.out.println("Estrutura 1 vazia? " + carros.isEmpty());
        System.out.println("Estrutura 2 vazia? " + carrosLHM.isEmpty());
        System.out.println("Estrutura 3 vazia? " + carrosTM.isEmpty());

    }

}
