package one.digitalinnovation;

public class Queue<T>{

    private Node<T> firstRefNode;

    public Queue(){
        this.firstRefNode = null;
    }

    // Adicionando elementos à estrutura da fila
    public void enqueue(T objQueue){
        Node newNode = new Node(objQueue);

        newNode.setRefNode(firstRefNode);
        firstRefNode = newNode;
    }

    // Retornando o primeiro elemento da estrutura
    public T first(){

        if(!this.isEmpty()){
            Node firstNode = firstRefNode;

            while(true){

                if(firstNode.getRefNode() != null){
                    firstNode = firstNode.getRefNode();
                } else{
                    break;
                }

            }

            return((T)firstNode.getObject());

        }

        return(null);

    }

    // Retirando um elemento da estrutura da fila
    public T dequeue(){

        if(!this.isEmpty()){
            Node firstNode = firstRefNode;
            Node auxNode = firstRefNode;

            while(true){

                if(firstNode.getRefNode() != null){
                    auxNode = firstNode;
                    firstNode = firstNode.getRefNode();
                } else{
                    auxNode.setRefNode(null);
                    break;
                }

            }

            return((T)firstNode.getObject());

        }

        return(null);

    }

    // Testando se a estrutura da fila está vazia
    public boolean isEmpty(){
        return(this.firstRefNode == null);
    }

    // Método para auxiliar na impressão da estrutura no console


    @Override
    public String toString(){
        String strReturn = "";
        Node auxNode = firstRefNode;

        if(firstRefNode != null){

            while(true){
                strReturn = strReturn + "[Node{object = " + auxNode.getObject() + "}] -->";

                if(auxNode.getRefNode() != null){
                    auxNode = auxNode.getRefNode();
                } else{
                    strReturn += "null";
                    break;
                }

            }

        } else{
            strReturn = "null";
        }

        return(strReturn);
    }

}
