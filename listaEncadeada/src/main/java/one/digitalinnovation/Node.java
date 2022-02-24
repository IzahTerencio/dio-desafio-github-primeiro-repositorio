package one.digitalinnovation;

public class Node<T>{

    private T content;
    private Node nextNode;

    // Construtor padrão
    public Node(){
        this.nextNode = null;
    }

    // Construtor parametrizado
    public Node(T content){
        this.content = content;
        this.nextNode = null;
    }

    // Construtor parametrizado #2
    public Node(T content, Node nextNode){
        this.content = content;
        this.nextNode = nextNode;
        this.nextNode = null;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return "Node{" +
                "content=" + content +
                '}';
    }

    public String linkedToString(){
        String str = "Node{" +
                     "content=" + content +
                     '}';

        if(nextNode != null){
            str = str + " --> " + nextNode.toString();
        } else{
            str = str + " --> null";
        }

        return(str);
    }

}
