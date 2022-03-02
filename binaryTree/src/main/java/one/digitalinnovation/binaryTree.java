package one.digitalinnovation;

public class binaryTree<T extends Comparable<T>>{

    private binaryNode<T> root;

    // Construtor padrão
    public  binaryTree(){
        this.root = null;
    }

    // Método principal de inserção
    public void insert(T content){
        binaryNode<T> newNode = new binaryNode<>(content);

        root = insert(root, newNode);
    }

    // Método auxiliar para inserção de nó na estrutura da árvore
    private binaryNode<T> insert(binaryNode<T> current, binaryNode<T> newNode){

        if(current == null){ // Quando a árvore está vazia, o novo nó é retornado
            return(newNode);
        } else if(newNode.getContent().compareTo(current.getContent()) < 0){
            current.setLeftNode(insert(current.getLeftNode(), newNode));
        } else{
            current.setRightNode(insert(current.getRightNode(), newNode));
        }

        return(current);

    }

}
