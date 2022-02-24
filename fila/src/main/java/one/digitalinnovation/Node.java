package one.digitalinnovation;

public class Node<T>{

    private T object;
    private Node<T> refNode;

    // Construtor padrão
    public Node(){}

    // Construtor parametrizado
    public Node(T object){
        this.refNode = null;
        this.object = object;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public Node getRefNode() {
        return refNode;
    }

    public void setRefNode(Node refNode) {
        this.refNode = refNode;
    }

    // Somente o objeto será exibido no método toString()
    @Override
    public String toString() {
        return "Node{" +
                "object=" + object +
                '}';
    }
}
