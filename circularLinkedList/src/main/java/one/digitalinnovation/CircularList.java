package one.digitalinnovation;

public class CircularList<T>{

    private Node<T> head;
    private Node<T> tail;
    private int listSize;

    // Método para adicionar um elemento (nó) na estrutura da lista
    public void add(T content){
        Node<T> newNode = new Node<>(content);

        if(this.listSize == 0){
            this.head = newNode;
            this.tail = this.head;
            this.head.setNextNode(tail);
        } else{
            newNode.setNextNode(this.tail);
            this.head.setNextNode(newNode);
            this.tail = newNode;
        }

        this.listSize += 1;
    }

    // Método que extrai um elemento (nó) da estrutura da lista
    public void remove(int index){

        if(index >= this.listSize){
            throw new IndexOutOfBoundsException("O índice é maior que o tamanho da lista!!!");
        }

        Node<T> auxNode = this.tail;
        if(index == 0){
            this.tail = this.tail.getNextNode();
            this.tail.setNextNode(this.tail);
        } else if(index == 1){
            this.tail.setNextNode(this.tail.getNextNode());
        } else{

            for(int i=0; i < index-1; i++){
                auxNode = auxNode.getNextNode();
            }
            auxNode.setNextNode(auxNode.getNextNode().getNextNode());

        }
        this.listSize -= 1;

    }

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

    // Construtor
    public CircularList(){
        this.listSize = 0;
        this.tail = null;
        this.head = null;
    }

    public boolean isEmpty(){
        return(this.listSize == 0);
    }

    public int size(){
        return(this.listSize);
    }

    @Override
    public String toString(){
        String strReuturn = "";
        Node<T> auxNode = this.tail;

        for(int i=0; i < this.size(); i++){
            strReuturn += "[Node{content = " + auxNode.getContent() + "}] --> ";
            auxNode = auxNode.getNextNode();
        }

        if(this.size() != 0){
            strReuturn += "(Retorna ao início)";
        } else{
            strReuturn += "[]";
        }

        return(strReuturn);
    }
}
