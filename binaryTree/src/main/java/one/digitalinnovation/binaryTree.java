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

    // Método "externo" para exibição dos dados da árvore IN ORDEM
    public void showInOrder(){
        System.out.println("Exibindo dados IN ORDEM ");
        showInOrder(this.root);
    }

    // Método "interno" auxiliar para a exibição da árvore
    private void showInOrder(binaryNode<T> current){

        if(current != null){
            showInOrder(current.getLeftNode());
            System.out.println(current.getContent() + ", ");

            showInOrder(current.getRightNode());
        }

    }

    // Método "externo" para exibição dos dados da árvore PÓS ORDEM
    public void showPostOrder(){
        System.out.println("Exibindo dados PÓS ORDEM");
        showPostOrder(this.root);
    }

    // Método "interno" auxiliar para a exibição da árvore
    private void showPostOrder(binaryNode<T> current){

        if(current != null){
            showPostOrder(current.getLeftNode());
            showPostOrder(current.getRightNode());
            System.out.println(current.getContent() + ", ");
        }

    }

    // Método "externo" para exibição dos dados da árvore PRÉ-ORDEM
    public void showPreOrder(){
        System.out.println("Exibindo dados PRÉ ORDEM");
        showPreOrder(this.root);
    }

    // Método "interno" auxiliar para a exibição da árvore
    private void showPreOrder(binaryNode<T> current){

        if(current != null){
            System.out.println(current.getContent() + ", ");
            showPreOrder(current.getLeftNode());
            showPreOrder(current.getRightNode());
        }

    }

}
