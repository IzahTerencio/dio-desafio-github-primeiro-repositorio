package one.digitalinnovation;

public class binaryNode<T extends Comparable<T>>{

    private T content;
    private binaryNode<T> leftNode;
    private binaryNode<T> rightNode;

    // Construtor
    public binaryNode(T content){
        this.content = content;
        this.leftNode = null;
        this.rightNode = null;
    }

    // Construtor padrão
    public binaryNode(){}

    public T getContent(){
        return content;
    }

    public void setContent(T content){
        this.content = content;
    }

    public binaryNode<T> getLeftNode(){
        return leftNode;
    }

    public void setLeftNode(binaryNode<T> leftNode){
        this.leftNode = leftNode;
    }

    public binaryNode<T> getRightNode(){
        return rightNode;
    }

    public void setRightNode(binaryNode<T> rightNode){
        this.rightNode = rightNode;
    }

    @Override
    public String toString(){
        return "binaryNode{" +
                "content=" + content +
                '}';
    }
    
}
