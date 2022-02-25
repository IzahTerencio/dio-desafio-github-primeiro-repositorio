package one.digitalinnovation;

public class CircularList<T>{

    private Node<T> head;
    private Node<T> tail;
    private int listSize;

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
