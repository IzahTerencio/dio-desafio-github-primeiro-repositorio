package com.projetono;

public class No<T>{

    private T content;
    private No<T> nextNode;

    public No(T content){
        this.nextNode = null; // Garantindo que a referência do nó criado esteja nula
        this.content = content;
    }

    // Setters e Getters
    public T getContent(){
        return content;
    }

    public void setContent(T content){
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
