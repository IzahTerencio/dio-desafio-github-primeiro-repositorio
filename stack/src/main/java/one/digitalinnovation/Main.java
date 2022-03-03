package one.digitalinnovation;

import java.util.Stack;

public class Main{

    public static void main(String[] args){

        Stack<Car> carStack = new Stack<>();

        carStack.push(new Car("Ford"));
        carStack.push(new Car("Fiat"));
        carStack.push(new Car("Wolksvagem"));

        System.out.println(carStack);
        System.out.println(carStack.pop());

        System.out.println(carStack.peek());
        System.out.println(carStack);

        if(carStack.empty()){
            System.out.println("A PILHA ESTÁ VAZIA!!");
        } else{
            System.out.println("A PILHA POSSUI ELEMENTOS!!");
        }

    }

}
