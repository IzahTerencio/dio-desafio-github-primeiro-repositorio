package one.digitalinnovation;

public class Node{

    private int data;
    private Node nodeRef = null;

    // Construtor padrão
    public Node(){
    }

    // Construtor parametrizado
    public Node(int data){
        this.data = data;
    }

    public int getData(){
        return data;
    }

    public void setData(int data){
        this.data = data;
    }

    public Node getNodeRef(){
        return nodeRef;
    }

    public void setNodeRef(Node nodeRef){
        this.nodeRef = nodeRef;
    }

    @Override
    public String toString(){
        return "Node{" +
                "data=" + data +
                '}';
    }
}
