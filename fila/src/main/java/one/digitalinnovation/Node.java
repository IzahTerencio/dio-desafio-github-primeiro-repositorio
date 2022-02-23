package one.digitalinnovation;

public class Node{

    private Object object;
    private Node refNode;

    // Construtor padrão
    public Node(){}

    // Construtor parametrizado
    public Node(Object object){
        this.refNode = null;
        this.object = object;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
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
