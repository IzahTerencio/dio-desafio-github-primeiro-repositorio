/********
EXERCÍCIO: Dada a população estimada de alguns estados do Nordeste brasileiro, faça:
           Estado = PE - População = 9616621
           Estado = AL - População = 3351543
           Estado = CE - População = 9187103
           Estado = RN - População = 3534265
 A. Crie um dicionário e relacione os estados e suas populações;
 B. Substitua a população do estado do RN por 3534165
 C. Confira se o estado PB está no dicionário, caso não esteja adicione: PB - 4039277
 D. Exiba a população de PE;
 E. Exiba todos os estados e suas populações na ordem que foi informado;
 F. Exiba os estados e suas populações em ordem alfabética;
 G. Exiba o estado com a menor população e sua quantidade;
 H. Exiba o estado com a maior população e sua quantidade;
 I. Exiba a soma da população desses estados;
 J. Exiba a média da população deste dicionário de dados;
 K. Remova os estados com a população menor que 4000000;
 L. Apague o dicionário de dados;
 M. Confira se o dicionário está vazio.
*********/

package one.digitalinnovation;

import java.util.*;

public class ExercicioOrdenacao{

    public static void main(String[] args){

        //  A. Crie um dicionário e relacione os estados e suas populações
        Map<String, Integer> estados = new HashMap<String, Integer>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println(estados.toString());
        System.out.println();

        //  B. Substitua a população do estado do RN por 3534165
        estados.put("RN", 3534165);
        System.out.println(estados);
        System.out.println();

        //  C. Confira se o estado PB está no dicionário, caso não esteja adicione: PB - 4039277
        if(!estados.containsKey("PB")){
            estados.put("PB", 4039277);
        }
        System.out.println(estados.toString());
        System.out.println();

        //  D. Exiba a população de PE
        System.out.println("População do estado de Pernambuco: " + estados.get("PE") + " hab.");
        System.out.println();

        //  E. Exiba todos os estados e suas populações na ordem que foi informado
        Map<String, Integer> estadosLHM = new LinkedHashMap<String, Integer>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        for(Map.Entry<String, Integer> e : estadosLHM.entrySet()){
            System.out.println(e.getKey() + " - " + e.getValue());
        }
        System.out.println();

        //  F. Exiba os estados e suas populações em ordem alfabética
        Map<String, Integer> estadosTM = new TreeMap<String, Integer>(estados);
        for(Map.Entry<String, Integer> e : estadosTM.entrySet()){
            System.out.println(e.getKey() + " - " + e.getValue());
        }
        System.out.println();

        //  G. Exiba o estado com a menor população e sua quantidade
        Integer menorPop = Collections.min(estados.values());
        String menorEst = "";
        for(Map.Entry<String, Integer> entry : estados.entrySet()){
            if(entry.getValue().equals(menorPop)){
                menorEst = entry.getKey();
                System.out.println("Estado com menor população é " + menorEst + ", com " + menorPop + " hab.");
            }
        }
        System.out.println();

        //  H. Exiba o estado com a maior população e sua quantidade
        Integer maiorPop = Collections.max(estados.values());
        String maiorEst = "";
        for(Map.Entry<String, Integer> entry : estados.entrySet()){
            if(entry.getValue().equals(maiorPop)){
                maiorEst = entry.getKey();
                System.out.println("O estado com maior população é " + maiorEst + ", com " + maiorPop + " hab.");
                System.out.println();
            }
        }

        //  I. Exiba a soma da população desses estados
        Iterator<Integer> it = estados.values().iterator();
        Integer soma = 0;
        while(it.hasNext()){
            soma += it.next();
        }
        System.out.println("Soma da população dos estados: " + soma + " hab.");
        System.out.println();

        //  J. Exiba a média da população deste dicionário de dados
        System.out.println("A média da população desses estados é " + soma/estados.size() + " hab.");
        System.out.println();

        //  K. Remova os estados com a população menor que 4000000
        Iterator<Integer> it1 = estados.values().iterator();
        while(it1.hasNext()){
            if(it1.next() < 4000000){
                it1.remove();
            }
        }
        System.out.println(estados.toString());
        System.out.println();

        //  L. Apague o dicionário de dados
        estados.clear();

        //  M. Confira se o dicionário está vazio
        if(estados.isEmpty()){
            System.out.println("Não há dados!");
        } else{
            System.out.println("Ainda há dados.");
        }

    }

}
