package one.digitalinnovation;

public class CircularList<T>{

    private Node<T> head;
    private Node<T> tail;
    private int listSize;

    public T get(int index){
        return(this.getNode(index).getContent());
    }

    // Método que retorna um determinado elemento (nó) a partir de um índice
    private Node<T> getNode(int index){

        if(this.isEmpty()){
            throw new IndexOutOfBoundsException(("A lista está vazia!"));
        }

        if(index == 0){
            return(this.tail);
        }

        Node<T> auxNode = this.tail;
        for(int i=0; (i<index) && (auxNode != null); i++){
            auxNode = auxNode.getNextNode();
        }

        return(auxNode);

    }

    public CircularList(){
        this.listSize = 0;
    }

    public boolean isEmpty(){
        return(this.listSize == 0);
    }

    public int size(){
        return(this.listSize);
    }

}
