package one.digitalinnovation;

public class Main{

    public static void main(String[] args){

        CircularList<String> myList = new CircularList<>();

        myList.add("c0");
        System.out.println(myList);

        myList.remove(0);
        System.out.println(myList);

        myList.add("c1");
        myList.add("c2");
        myList.add("c3");
        System.out.println(myList);

    }

}
