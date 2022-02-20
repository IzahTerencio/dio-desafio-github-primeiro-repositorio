package com.projetono;

public class Main{

    public static void main(String[] args){

        No<String> no1 = new No<>("Conteúdo nó 1");
        No<String> no2 = new No<>("Conteúdo nó 2");

        no1.setNextNode(no2);

        No<String> no3 = new No<>("Conteúdo nó 3");

        no2.setNextNode(no3);

        No<String> no4 = new No<>("Conteúdo nó 4");

        no3.setNextNode(no4);

        System.out.println(no1);
        System.out.println(no1.getNextNode());
        System.out.println(no2);

        System.out.println("---------------------");

        System.out.println(no1);
        System.out.println(no1.getNextNode());
        System.out.println(no1.getNextNode().getNextNode());

    }

}
