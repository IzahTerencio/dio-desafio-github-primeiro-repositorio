package one.digitalinnovation;

public class LinkedList<T>{

    Node<T> firstNodeRef;

    // Construtor padrão
    public LinkedList(){
        this.firstNodeRef = null;
    }

    // Recebendo um conteúdo que deve ser armazenado em um nó, o qual será adicionado à estrutura da lista
    public void add(T content){
        Node<T> newNode = new Node<>(content);

        if(this.isEmpty()){
            firstNodeRef = newNode;
            return;
        }

        Node<T> auxNode = firstNodeRef;

        for(int i=0; i<this.size()-1; i++){
            auxNode = auxNode.getNextNode();
        }

        auxNode.setNextNode(newNode);

    }

    // Retornando o conteúdo de um determinado nó
    public T get(int index){
        return(getNode(index).getContent());
    }

    // Obtendo um determinado nó da estrutura a partir de um índice, sem contudo extraí-lo da mesma
    private Node<T> getNode(int index){

        validateIndex(index);

        Node<T> auxNode = firstNodeRef;
        Node<T> returnNode = null;

        for(int i=0; i<this.size()-1; i++){
            returnNode = auxNode;
            auxNode = auxNode.getNextNode();
        }

        return(returnNode);

    }

    // Obtendo o tamanho da estrutura da lista, ou seja, a quantidade de nós presentes nela
    public int size(){
        int listSize = 0;
        Node auxReference = firstNodeRef;

        while(true){

            if(auxReference != null){
                listSize += 1;

                if(auxReference.getNextNode() != null){
                    auxReference = auxReference.getNextNode();
                } else{
                    break;
                }

            } else{
                break;
            }

        }

        return(listSize);
    }

    public void validateIndex(int index){
        if(index >= size()){
            int lastIndex = size()-1;

            throw new IndexOutOfBoundsException("Não existe conteúdo no índice " + index + " desta lista. último índice: " + lastIndex);
        }
    }

    // Verificando se a lista está ou não vazia
    public boolean isEmpty(){
        return(firstNodeRef == null);
    }

}
