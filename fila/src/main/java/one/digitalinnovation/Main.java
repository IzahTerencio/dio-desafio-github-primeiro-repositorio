package one.digitalinnovation;

public class Main{

    public static void main(String[] args){

        Queue<String> myQueue = new Queue<>();

        myQueue.enqueue("FIRST");
        myQueue.enqueue("SECOND");
        myQueue.enqueue("THIRD");
        myQueue.enqueue("FOURTH");

        //System.out.println(myQueue);

        System.out.println(myQueue.dequeue());

        System.out.println(myQueue);

        myQueue.enqueue("FIFTH");
        System.out.println(myQueue);

        System.out.println(myQueue.first());

    }

}
