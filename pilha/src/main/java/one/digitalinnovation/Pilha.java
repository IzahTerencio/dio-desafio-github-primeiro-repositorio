package one.digitalinnovation;

public class Pilha{

    private Node firstNodeRef; // É o nó de referência da entrada da pilha

    public Pilha(){
        this.firstNodeRef = null;
    }

    // Método que adiciona elemento no topo da pilha
    public void push(Node newNode){
        Node auxReference = firstNodeRef;
        firstNodeRef = newNode;
        firstNodeRef.setNodeRef(auxReference);
    }

    // Método que retira o elemento do topo da pilha
    public Node pop(){

        if(!this.isEmpty()){
            Node poppedNode = firstNodeRef;
            firstNodeRef = firstNodeRef.getNodeRef();

            return(poppedNode);
        }

    }

    // Simplesmente retorna a referência, o topo da pilha
    public Node top(){
        return this.firstNodeRef;
    }

    public boolean isEmpty(){
        return(this.firstNodeRef == null);
    }

}
