package one.digitalinnovation;

import java.util.ArrayList;
import java.util.List;

public class Main{

    public static void main(String[] args){

        List<Car> carList = new ArrayList<>();

        carList.add(new Car("Wolksvagem"));
        carList.add(new Car("Fiat"));
        carList.add(new Car("Lamborghini"));

        System.out.println(carList.contains(new Car("Ford")));
        System.out.println((new Car("Ford").hashCode()));

        Car c1 = new Car("Ford");
        Car c2 = new Car("Chevrolet");

        System.out.println(c1.equals(c2));;

    }

}
