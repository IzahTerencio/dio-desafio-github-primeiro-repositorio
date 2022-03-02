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
            System.out.print(current.getContent() + ", ");

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
            System.out.print(current.getContent() + ", ");
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
            System.out.print(current.getContent() + ", ");
            showPreOrder(current.getLeftNode());
            showPreOrder(current.getRightNode());
        }

    }

    // Método para remover (deletar) um elemento da estrutura da árvore
    public void remove(T content){

        try{

            binaryNode<T> current = this.root;
            binaryNode<T> parent = null;
            binaryNode<T> child = null;
            binaryNode<T> auxNode = null;

            while((current != null) && (current.getContent().equals(content))){
                parent = current;

                if(content.compareTo(current.getContent()) < 0){
                    current = current.getLeftNode();
                } else{
                    current = current.getRightNode();
                }

            }

            if(current == null){
                System.out.println("Conteúdo não encontrado na árvore!");
            }

            if(parent == null){

                if(current.getRightNode() == null){

                    this.root = current.getLeftNode();

                } else if(current.getLeftNode() == null){

                    this.root = current.getRightNode();

                } else{

                    for(auxNode = current, child = current.getLeftNode(); child.getRightNode() != null; auxNode = child, child = child.getLeftNode()){

                        if(child != current.getLeftNode()){
                            auxNode.setRightNode(child.getLeftNode());
                            child.setLeftNode(root.getLeftNode());
                        }

                    }

                    child.setRightNode(root.getRightNode());
                    root = child;

                }

            } else if(current.getRightNode() == null){

                if(parent.getLeftNode() == current){
                    parent.setLeftNode(current.getLeftNode());
                } else{
                    parent.setRightNode(current.getLeftNode());
                }

            } else if(current.getLeftNode() == null){

                if(parent.getLeftNode() == current){
                    parent.setLeftNode(current.getRightNode());
                } else{
                    parent.setRightNode(current.getRightNode());
                }

            } else{

                for(auxNode=current, child=current.getLeftNode(); child.getRightNode() != null; auxNode=child, child=child.getRightNode()){

                    if(child != current.getLeftNode()){
                        auxNode.setRightNode(child.getLeftNode());
                        child.setLeftNode(current.getLeftNode());
                    }

                    child.setRightNode(current.getRightNode());

                    if(parent.getLeftNode() == current){
                        parent.setLeftNode(child);
                    } else{
                        parent.setRightNode(child);
                    }

                }

            }

        } catch(NullPointerException arg){
            System.out.println("Conteúdo não encontrado");
        }

    }

}
