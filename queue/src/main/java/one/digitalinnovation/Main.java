package one.digitalinnovation;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main{

    public static void main(String[] args){

        Queue<Car> carQueue = new LinkedList<>();

        carQueue.add(new Car("Lamborghini"));
        carQueue.add(new Car("Audi"));
        carQueue.add(new Car("Wolksvagem"));

        System.out.println(carQueue.add(new Car("Fiat")));

        System.out.println(carQueue);

        System.out.println(carQueue.offer(new Car("Renault")));
        System.out.println(carQueue);

        System.out.println(carQueue.peek());
        System.out.println(carQueue);

        System.out.println(carQueue.poll());
        System.out.println(carQueue);

    }

}
