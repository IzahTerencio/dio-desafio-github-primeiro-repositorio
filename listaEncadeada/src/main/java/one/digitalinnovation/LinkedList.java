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

    // Verificando se a lista está ou não vazia
    public boolean isEmpty(){
        return(firstNodeRef == null);
    }

}
