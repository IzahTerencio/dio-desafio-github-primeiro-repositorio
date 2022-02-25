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

    public T get(int index){
        return(this.getNode(index).getContent());
    }

    // Método para adicionar um novo elemento (nó) na estrutura da lista
    public void add(T element){
        DoubleNode<T> newNode = new DoubleNode<>(element);

        newNode.setNextNode(null);
        newNode.setPreviousNode(lastNode);

        if(firstNode == null){
            firstNode = newNode;
        }

        if(lastNode != null){
            lastNode.setNextNode(newNode);
        }

        lastNode = newNode;
        listSize += 1;
    }

    private DoubleNode<T> getNode(int index){
        DoubleNode<T> auxNode = firstNode;

        for(int i=0; (i < index) && (auxNode != null); i++){
            auxNode = auxNode.getNextNode();
        }
        return(auxNode);

    }

    // Método que retorna o tamanho da estrutura
    public int size(){
        return(listSize);
    }

}
