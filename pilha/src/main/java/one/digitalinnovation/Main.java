package one.digitalinnovation;

public class Main{

    public static void main(String[] args){

        Pilha newPilha = new Pilha();

        newPilha.push(new Node(1));
        newPilha.push(new Node(2));
        newPilha.push(new Node(3));
        newPilha.push(new Node(4));
        newPilha.push(new Node(5));
        newPilha.push(new Node(6));
        System.out.println(newPilha);

        System.out.println(newPilha.pop());
        System.out.println(newPilha);

        newPilha.push(new Node(99));
        System.out.println(newPilha);

    }

}
