package one.digitalinnovation;

public class LinkedList{

    Node<T> firstNodeRef;

    // Construtor padrão
    public LinkedList(){
        this.firstNodeRef = null;
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
