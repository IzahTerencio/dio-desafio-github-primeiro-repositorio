package com.projetono;

public class No{

    private String content;
    private No nextNode;

    public No(String content){
        this.nextNode = null; // Garantindo que a referência do nó criado esteja nula
        this.content = content;
    }

    // Setters e Getters
    public String getContent(){
        return content;
    }

    public void setContent(String content){
        this.content = content;
    }

    public No getNextNode(){
        return nextNode;
    }

    public void setNextNode(No nextNode){
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return "No{" +
                "content='" + content + '\'' +
                '}';
    }
}
