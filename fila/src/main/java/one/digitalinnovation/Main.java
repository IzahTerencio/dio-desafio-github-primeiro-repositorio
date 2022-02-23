package one.digitalinnovation;

public class Main{

    public static void main(String[] args){

        Queue myQueue = new Queue();

        myQueue.enqueue(new Node("FIRST"));
        myQueue.enqueue(new Node("SECOND"));
        myQueue.enqueue(new Node("THIRD"));
        myQueue.enqueue(new Node("FOURTH"));

        //System.out.println(myQueue);

        System.out.println(myQueue.dequeue());

        System.out.println(myQueue);

        myQueue.enqueue(new Node("FIFTH"));
        System.out.println(myQueue);

        System.out.println(myQueue.first());

    }

}
