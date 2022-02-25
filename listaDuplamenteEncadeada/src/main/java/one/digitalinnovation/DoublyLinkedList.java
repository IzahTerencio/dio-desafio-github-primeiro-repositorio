package one.digitalinnovation;

public class DoublyLinkedList<T>{

    private DoubleNode<T> firstNode;
    private DoubleNode<T> lastNode;
    private int listSize;

    // Construtor
    public DoublyLinkedList(){
        this.firstNode = null;
        this.lastNode  = null;
        this.listSize  = 0;
    }

    // Método que retorna o tamanho da estrutura
    public int size(){
        return(listSize);
    }

}
